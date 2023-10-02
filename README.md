# Java Programming Language : Chapter 1 Java First Hello World Program

## 1. Prerequisites
* The Java SE Development Kit 8 (JDK 8)
* A text editor

## 2. Creating Your First Application

### 1. Create a Source File

```java
public class HelloWorldApp {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
```

* class : keyword is used to declare a class in java.
* public : keyword is an access modifier which represents visibility. It means it is visible to all.
* static : is a keyword. If we declare any method as static, it is known as the static method. The core advantage of the static method is that there is no need to create an object to invoke the static method. The main method is executed by the JVM, so it doesn't require to create an object to invoke the main method. So it saves memory.
* void : is the return type of the method. It means it doesn't return any value.
* main : represents the starting point of the program.
* String[] : args is used for command line argument. We will learn it later.
* System.out.println() : is used print statement.

## 2. Compile the Source File into a .class File

```shell
javac HelloWorldApp.java
```


## 3. Run the Program

```shell
$ java HelloWorldApp
Hello World!
```

---