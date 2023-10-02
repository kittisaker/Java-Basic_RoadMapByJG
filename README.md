# Java Programming Language : Chapter 4 Variables in Java - Local Variable, Class Variable and Instance Variable

## What is Variable in Java?
* The value stored in a variable can be changed during program execution.
* A variable is only a name given to a memory location, all the operations done on the variable effects that memory location.
* In Java, all the variables must be declared before they can be used.

## Declaring a Variable

```java
type identifier [ = value ][, identifier [= value ] …];

// type is one of Java’s atomic types or the name of a class or interface.
// The identifier is the name of the variable.
// We can initialize the variable by specifying an equal sign and a value.
```

```java
int a, b, c; // declares three ints, a, b, and c.
int d = 3, e, f = 5; // declares three more ints, initializing d and f.
byte z = 22; // initializes z.
double pi = 3.14159; // declares an approximation of pi.
char x = 'x'; // the variable x has the value 'x'.
```

## Java Different Kinds of Variables

### 1. Instance Variables (Non-Static Fields)
Technically speaking, objects store their individual states in "non-static fields", that is, fields declared without the static keyword. Non-static fields are also known as instance variables because their values are unique to each instance of a class (to each object, in other words); the empName of one Employee is independent of the empName of another.

```java
package net.kope.corejava;

public class InstanceVariableExapmle {
    public static void main(String[] args) {
        Employee employee = new Employee();

        // Before assigning values to employee object
        System.out.println(employee.id);
        System.out.println(employee.empName);
        System.out.println(employee.age);

        employee.id = 101;
        employee.empName = "solo kope";
        employee.age = 28;

        // After assigning values to employee object
        System.out.println(employee.id);
        System.out.println(employee.empName);
        System.out.println(employee.age);
    }
}

class Employee{
    // instance variable : employee id, employee name, employee age
    public int id;
    public String empName;
    public int age;
}
```

<details>
<summary>Output : </summary>

```shell
0
null
0
101
solo kope
28
```

</details>

### 2. Class Variables (Static Fields)
A class variable is any field declared with the static modifier; this tells the compiler that there is exactly one copy of this variable in existence, regardless of how many times the class has been instantiated.

```java
package net.kope.corejava.variables;

public class StaticVariableExample {
    public static void main(String[] args) {
        Student student1 = new Student(100, "Student 1");
        Student student2 = new Student(101, "Student 2");
        Student student3 = new Student(102, "Student 3");
        Student student4 = new Student(103, "Student 4");

        System.out.println(" ------------ Student 1 -------------");
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());
        System.out.println(student4.toString());
    }
}

class Student{
    private int rollNo;
    private String name;
    private static String college = "ABC"; // Static variable

    public Student(int rollNo, String name) {
        super();
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString(){
        return "Student [rollNo=" + rollNo + ", name= " + name  + ", college=" + college + "]";
    }
}
```

<details>
<summary>Output : </summary>

```shell
 ------------ Student 1 -------------
Student [rollNo=100, name= Student 1, college=ABC]
Student [rollNo=101, name= Student 2, college=ABC]
Student [rollNo=102, name= Student 3, college=ABC]
Student [rollNo=103, name= Student 4, college=ABC]
```

</details>

### 3. Local Variables
Similar to how an object stores its state in fields, a method will often store its temporary state in local variables. These variables are declared inside a method of the class. Their scope is limited to the method which means that You can’t change their values and access them outside of the method.

```java
package net.kope.corejava.variables;

public class LocalVariableExample {
    
    public int sum(int n){
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum = sum + i;
        }
        return sum;
    }

    public static void main(String[] args) {
        LocalVariableExample localVariableExample = new LocalVariableExample();
        int sum = localVariableExample.sum(10);
        System.out.println("Sum of first 10 numbers -> " + sum);
    }
}
```

### 4. Parameters
Let's look at the signature for the main method is public static void main(String[] args). Here, the args variable is the parameter to this method. The important thing to remember is that parameters are always classified as "variables" not "fields".

### Variables naming convention in java
* Variables naming cannot contain white spaces.
* A variable name can begin with special characters such as $ and _.
* The variable name should start with a lowercase letter. Parameter names, member variable names, and local variable names should be written in lowerCamelCase.
    4. Variable names are case sensitive in Java.

---