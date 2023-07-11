package com.dark.androidbox.builder;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.ConstructorDeclaration;
import com.github.javaparser.ast.body.FieldDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.type.ClassOrInterfaceType;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogicBuilder {
    private final String codeString;

    public LogicBuilder(String codeString) {
        this.codeString = codeString;
    }

    public ArrayList<String> getClasses() {
        CompilationUnit cu = StaticJavaParser.parse(codeString);
        ArrayList<String> classes = new ArrayList<>();
        for (ClassOrInterfaceDeclaration cls : cu.findAll(ClassOrInterfaceDeclaration.class)) {
            classes.add(cls.getName().getIdentifier());
        }
        return classes;
    }

    public ArrayList<StringBuilder> getClassCode() {
        ArrayList<StringBuilder> codeList = new ArrayList<>();

        // Regular expression pattern to match class code blocks
        String regex = "(?s)class.*?\\{.*?\\}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(codeString);

        while (matcher.find()) {
            StringBuilder code = new StringBuilder(matcher.group());
            codeList.add(code);
        }

        return codeList;
    }

    public ArrayList<StringBuilder> getMethods() {
        CompilationUnit cu = StaticJavaParser.parse(codeString);
        ArrayList<StringBuilder> methods = new ArrayList<>();
        for (MethodDeclaration method : cu.findAll(MethodDeclaration.class)) {
            methods.add(new StringBuilder(method.getNameAsString()));
        }
        return methods;
    }

    public ArrayList<StringBuilder> getVariables() {
        CompilationUnit cu = StaticJavaParser.parse(codeString);
        ArrayList<StringBuilder> fields = new ArrayList<>();
        for (FieldDeclaration field : cu.findAll(FieldDeclaration.class)) {
            fields.add(new StringBuilder(field.getVariables().get(0).getNameAsString()));
        }
        return fields;
    }

    public ArrayList<StringBuilder> getClassExtends() {
        CompilationUnit cu = StaticJavaParser.parse(codeString);
        ArrayList<StringBuilder> extandes = new ArrayList<>();
        for (ClassOrInterfaceDeclaration cls : cu.findAll(ClassOrInterfaceDeclaration.class)) {
            if (cls.getExtendedTypes().size() > 0) {
                ClassOrInterfaceType parent = cls.getExtendedTypes().get(0);
                extandes.add(new StringBuilder(parent.getNameAsString()));
            }
        }
        return extandes;
    }

    public ArrayList<StringBuilder> getClassImplementation() {

        CompilationUnit cu = StaticJavaParser.parse(codeString);
        ArrayList<StringBuilder> interfaces = new ArrayList<>();

        for (ClassOrInterfaceDeclaration cls : cu.findAll(ClassOrInterfaceDeclaration.class)) {
            if (cls.getImplementedTypes().size() > 0) {
                for (ClassOrInterfaceType face : cls.getImplementedTypes()) {
                    interfaces.add(new StringBuilder(face.getNameAsString()));
                }
            }
        }

        return interfaces;
    }

    public ArrayList<StringBuilder> getVariablesCode() {
        VariableExtractor extractor = new VariableExtractor(new StringBuilder(codeString));
        return extractor.getVariables();
    }

    public ArrayList<StringBuilder> getMethodsCode() {
        MethodExtractor extractor = new MethodExtractor(new StringBuilder(codeString));
        return extractor.getMethods();
    }

    public ArrayList<StringBuilder> getConstructors() {
        CompilationUnit cu = StaticJavaParser.parse(codeString);
        ArrayList<StringBuilder> constructors = new ArrayList<>();
        for (ClassOrInterfaceDeclaration cls : cu.findAll(ClassOrInterfaceDeclaration.class)) {
            for (ConstructorDeclaration constructor : cls.getConstructors()) {
                StringBuilder constructorName = new StringBuilder(constructor.getName().getIdentifier());
                constructors.add(constructorName);
            }
        }
        return constructors;
    }

    public ArrayList<StringBuilder> getConstructorCode() {
        CompilationUnit cu = StaticJavaParser.parse(codeString);
        ArrayList<StringBuilder> constructorsCode = new ArrayList<>();
        for (ClassOrInterfaceDeclaration cls : cu.findAll(ClassOrInterfaceDeclaration.class)) {
            for (ConstructorDeclaration constructor : cls.getConstructors()) {
                StringBuilder constructorCode = new StringBuilder(codeString.substring(constructor.getRange().get().begin.line - 1, constructor.getRange().get().end.line - 1));
                constructorsCode.add(constructorCode);
            }
        }
        return constructorsCode;
    }


    //Check If the give code is the Type of Element
    public boolean isClass() {
        CompilationUnit cu = StaticJavaParser.parse(codeString);
        return cu.findFirst(ClassOrInterfaceDeclaration.class).isPresent();
    }

    public boolean isVariable() {
        CompilationUnit cu = StaticJavaParser.parse(codeString);
        return cu.findFirst(FieldDeclaration.class).isPresent();
    }

    public boolean isMethod() {
        CompilationUnit cu = StaticJavaParser.parse(codeString);
        return cu.findFirst(MethodDeclaration.class).isPresent();
    }

    public boolean isConstructor() {
        CompilationUnit cu = StaticJavaParser.parse(codeString);
        return cu.findFirst(ConstructorDeclaration.class).isPresent();
    }


    //Check If the Particular elements exists
    public boolean containsClass(String className) {
        CompilationUnit cu = StaticJavaParser.parse(codeString);
        return cu.findFirst(ClassOrInterfaceDeclaration.class, cls -> cls.getNameAsString().equals(className)).isPresent();
    }

    public boolean containsVariable(String variableName) {
        CompilationUnit cu = StaticJavaParser.parse(codeString);
        return cu.findFirst(FieldDeclaration.class, field -> field.getVariables().stream().anyMatch(variable -> variable.getNameAsString().equals(variableName))).isPresent();
    }

    public boolean containsConstructor(String constructorName) {
        CompilationUnit cu = StaticJavaParser.parse(codeString);
        return cu.findFirst(ConstructorDeclaration.class, constructor -> constructor.getName().asString().equals(constructorName)).isPresent();
    }

    public boolean containsMethod(String methodName) {
        CompilationUnit cu = StaticJavaParser.parse(codeString);
        return cu.findFirst(MethodDeclaration.class, method -> method.getName().asString().equals(methodName)).isPresent();
    }


    //Replacing Methods
    public String replaceClass(String oldClassName, String newCode) {
        CompilationUnit cu = StaticJavaParser.parse(codeString);
        CompilationUnit newCu = StaticJavaParser.parse(newCode);
        cu.getClassByName(oldClassName).ifPresent(oldClass -> {
            oldClass.replace(newCu.getType(0));
        });
        return cu.toString();
    }

    public String replaceVariable(String oldVariableName, String newCode) {
        CompilationUnit cu = StaticJavaParser.parse(codeString);
        FieldDeclaration newField = StaticJavaParser.parseBodyDeclaration(newCode).asFieldDeclaration();
        cu.findAll(FieldDeclaration.class).forEach(field -> {
            field.getVariables().forEach(variable -> {
                if (variable.getNameAsString().equals(oldVariableName)) {
                    variable.replace(newField.getVariable(0));
                }
            });
        });
        return cu.toString();
    }

    public String replaceConstructor(String oldConstructorName, String newCode) {
        CompilationUnit cu = StaticJavaParser.parse(codeString);
        ConstructorDeclaration newConstructor = StaticJavaParser.parseBodyDeclaration(newCode).asConstructorDeclaration();
        cu.findAll(ConstructorDeclaration.class).forEach(constructor -> {
            if (constructor.getName().asString().equals(oldConstructorName)) {
                constructor.replace(newConstructor);
            }
        });
        return cu.toString();
    }

    public String replaceMethod(String oldMethodName, String newCode) {
        CompilationUnit cu = StaticJavaParser.parse(codeString);
        MethodDeclaration newMethod = StaticJavaParser.parseBodyDeclaration(newCode).asMethodDeclaration();
        cu.findAll(MethodDeclaration.class).forEach(method -> {
            if (method.getName().asString().equals(oldMethodName)) {
                method.replace(newMethod);
            }
        });
        return cu.toString();
    }


    //Extract Elements By their name
    public String extractClass(String className) {
        CompilationUnit cu = StaticJavaParser.parse(codeString);
        ClassOrInterfaceDeclaration targetClass = cu.getClassByName(className).orElse(null);
        if (targetClass != null) {
            return targetClass.toString();
        } else {
            return null;
        }
    }

    public String extractVariable(String variableName) {
        CompilationUnit cu = StaticJavaParser.parse(codeString);
        FieldDeclaration targetVariable = cu.findAll(FieldDeclaration.class).stream()
                .filter(field -> field.getVariables().stream()
                        .anyMatch(variable -> variable.getNameAsString().equals(variableName)))
                .findFirst()
                .orElse(null);
        if (targetVariable != null) {
            return targetVariable.toString();
        } else {
            return null;
        }
    }

    public String extractConstructor(String constructorName) {
        CompilationUnit cu = StaticJavaParser.parse(codeString);
        ConstructorDeclaration targetConstructor = cu.findAll(ConstructorDeclaration.class).stream()
                .filter(constructor -> constructor.getName().asString().equals(constructorName))
                .findFirst()
                .orElse(null);
        if (targetConstructor != null) {
            return targetConstructor.toString();
        } else {
            return null;
        }
    }

    public String extractMethod(String methodName) {
        CompilationUnit cu = StaticJavaParser.parse(codeString);
        MethodDeclaration targetMethod = cu.findAll(MethodDeclaration.class).stream()
                .filter(method -> method.getName().asString().equals(methodName))
                .findFirst()
                .orElse(null);
        if (targetMethod != null) {
            return targetMethod.toString();
        } else {
            return null;
        }
    }


    public static class VariableExtractor {
        private final ArrayList<StringBuilder> variables;

        public VariableExtractor(StringBuilder codeString) {
            variables = new ArrayList<>();
            CompilationUnit compilationUnit = StaticJavaParser.parse(codeString.toString());
            new FieldVisitor().visit(compilationUnit, null);
        }

        public ArrayList<StringBuilder> getVariables() {
            return variables;
        }

        private class FieldVisitor extends VoidVisitorAdapter<Void> {
            public void visit(CompilationUnit field, Void arg) {
                variables.add(new StringBuilder(field.toString()));
                super.visit(field, arg);
            }
        }
    }

    public static class MethodExtractor {
        private ArrayList<StringBuilder> methods;

        public MethodExtractor(StringBuilder codeString) {
            methods = new ArrayList<>();

            CompilationUnit compilationUnit = StaticJavaParser.parse(String.valueOf(codeString));
            new MethodVisitor().visit(compilationUnit, null);

        }

        public ArrayList<StringBuilder> getMethods() {
            return methods;
        }

        private class MethodVisitor extends VoidVisitorAdapter<Void> {
            @Override
            public void visit(MethodDeclaration method, Void arg) {
                methods.add(new StringBuilder(method.toString()));
                super.visit(method, arg);
            }
        }
    }

}
