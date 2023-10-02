# Java Programming Language : Chapter 1 What is JDK, JRE and JVM in Java

## 1. JDK(Java Development Kit)
The JDK(Java Development Kit) is a superset of the JRE and contains everything that is in the JRE, plus tools such as the compiler, debugger, JavaDoc, keytool etc necessary for developing and running Java programs or applications.

## 2. JVM (Java Virtual Machine)
JVM is a very important component of Java programming language. When you run the Java program, the Java compiler first compiles your Java code to bytecode. Then, the JVM translates bytecode into native machine code (set of instructions that a computer's CPU executes directly).

## 3. JRE(Java Runtime Environment)
The Java Runtime Environment (JRE) provides the libraries, the Java Virtual Machine, and other components to run applets and applications written in the Java programming language.

JRE doesn’t contain any development tools such as Java compiler, debugger, JShell, etc.

If you just want to execute a java program, you can install only JRE. You don’t need JDK because there is no development or compilation of java source code is required.

## 4. JDK vs JRE vs JVM
Let’s look at some of the important differences between JDK, JRE, and JVM.
    * JDK is for development purposes whereas JRE is for running the java programs.
    * JDK and JRE both contain JVM so that we can run our java program.
    * JVM is the heart of Java programming language and provides platform independence.

---