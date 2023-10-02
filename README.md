# Java-RoadMapByJG

## 1. About the Java Technology
* The Java Programming Language : characterized
    1. Simple
    2. Object-oriented
    3. Distributed
    4. Multi-threaded
    5. Dynamic
    6. Architecture neutral
    7. Portable
    8. High performance
    9. Robust
    10. Secure

* Java software development process:
    1. MyProgram.java
    2. Complier
    3. MyProgram.class
    4. Java VM
    5. My Program

### Step 1 : Create a Java Source File (HelloWorldApp.java)

```java
public class HelloWorldApp {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
```

### Step 2 : Compile Java Source File

```shell
javac HelloWorldApp.java
```

### Step 3 : Execute ByteCodes ( .class File)

```shell
java HelloWorldApp
```

## 2. Java Platform Independent
* Write Once and Run Anywhere(WORA) :
    * Comiler --> JVM --> Win32
    * Comiler --> JVM --> UNIX
    * Comiler --> JVM --> MacOS
    * Etc.

## 3. JVM Platform Dependent?
As we know that JVM translates the byte-code into machine language, and since the machine language depends on the operating system being used, it is clear that the JVM is platform (operating system) dependent.

## 4. The Java Platform

The Java platform has two components:
    1. The Java Virtual Machine
    2. The Java Application Programming Interface (API)

## 5. What Can Java Technology Do?
* Development Tools
* Application Programming Interface (API)
* Deployment Technologies
* User Interface Toolkits
* Integration Libraries

## 6. How Will Java Technology Change My Life?
* Get started quickly
* Write less code
* Write better code
* Develop programs more quickly
* Avoid platform dependencies
* Write once, run anywhere
* Distribute software more easily

---