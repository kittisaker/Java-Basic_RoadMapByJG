# Java Programming Language : Chapter 8 Equality, Relational, and Conditional Operators in Java With Examples

## 1. The Equality and Relational Operators
The equality and relational operators determine if one operand is <b>greater than, less than, equal to,</b> or <b>not equal</b> to another operand. The majority of these operators will probably look familiar to you as well. Keep in mind that you must use "==", not "=", when testing if two primitive values are equal.

```java
package net.kope.corejava.operators.equality;

public class ComparisonDemo {
    public static void main(String[] args) {
        int value1 = 1;
        int value2 = 2;
        if (value1 == value2)
            System.out.println("value1 == value2");
        if (value1 != value2)
            System.out.println("value1 != value2");
        if (value1 > value2)
            System.out.println("value1 > value2");
        if (value1 < value2)
            System.out.println("value1 < value2");
        if (value1 <= value2)
            System.out.println("value1 <= value2");
    }
}
```

<details>
<summary>Output : </summary>

```shell
value1 != value2
value1 < value2
value1 <= value2
```

</details>

## 2. The Conditional Operators
The && and || operators perform Conditional-AND and Conditional-OR operations on two boolean expressions. These operators exhibit "short-circuiting" behavior, which means that the second operand is evaluated only if needed.

```java
package net.kope.corejava.operators.condition;

public class ConditionalDemo1 {
    public static void main(String[] args) {
        int value1 = 1;
        int value2 = 2;
        if ((value1 == 1) && (value2 == 2))
            System.out.println("value1 is 1 AND value2 is 2");
        if ((value1 == 1) || (value2 == 1))
            System.out.println("value1 is 1 OR value2 is 1");
    }
}
```

<details>
<summary>Output : </summary>

```shell
value1 is 1 AND value2 is 2
value1 is 1 OR value2 is 1
```

</details>

## 3. Ternary Operator
Java includes a special ternary (three-way) operator that can replace certain types of if-then-else statements.

```java
package net.kope.corejava.operators.ternary;

public class Ternary {
    public static void main(String[] args) {
        int i, k;

        i = 10;
        k = i < 0 ? -i : i; // get absolute value of i

        System.out.print("Absolute value of ");
        System.out.println(i + " is " + k);

        i = -10;
        k = i < 0 ? -i : i; // get absolute value of i

        System.out.print("Absolute value of ");
        System.out.println(i + " is " + k);
    }
}
```

<details>
<summary>Output : </summary>

```shell
Absolute value of 10 is 10
Absolute value of -10 is 10
```

</details>

## 4. The Type Comparison Operator instanceof
The instanceof operator compares an object to a specified type. You can use it to test if an object is an instance of a class, an instance of a subclass, or an instance of a class that implements a particular interface.

```java
package net.kope.corejava.operators.comparison;

public class InstanceofDemo {
    public static void main(String[] args) {
        Parent obj1 = new Parent();
        Parent obj2 = new Child();

        System.out.println("obj1 instanceof Parent: " + (obj1 instanceof Parent));
        System.out.println("obj1 instanceof Child: " + (obj1 instanceof Child));
        System.out.println("obj1 instanceof MyInterface: " + (obj1 instanceof MyInterface));
        System.out.println("obj2 instanceof Parent: " + (obj2 instanceof Parent));
        System.out.println("obj2 instanceof Child: " + (obj2 instanceof Child));
        System.out.println("obj2 instanceof MyInterface: " + (obj2 instanceof MyInterface));
    }
}

class Parent {}
class Child extends Parent implements MyInterface {}
interface MyInterface {}
```

<details>
<summary>Output : </summary>

```shell
obj1 instanceof Parent: true
obj1 instanceof Child: false
obj1 instanceof MyInterface: false
obj2 instanceof Parent: true
obj2 instanceof Child: true
obj2 instanceof MyInterface: true
```

</details>

---