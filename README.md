# Java Programming Language : Chapter 13 Java do while Loop

## 1. do-while Loop Syntax

```java
do {
    // body of a loop
} while (condition);
```

Each iteration of the do-while loop first executes the body of the loop and then evaluates the conditional expression. If this expression is true, the loop will repeat. Otherwise, the loop terminates. As with all of Java’s loops, a condition must be a Boolean expression.

## 2. How do-while Loop Works?
First, the statements inside the loop execute and then the condition gets evaluated, if the condition returns true then the control gets transferred to the “do” else it jumps to the next statement after do-while.

## 3. Simple do-while Loop Example

```java
public class DoWhileLoopExample {
    public static void main(String[] args) {
        int n = 10;

        do{
            System.out.println("tick " +n);
            n--;
        }while(n > 0);
    }
}
```

<details>
<summary>Output : </summary>

```shell
tick 10
tick 9
tick 8
tick 7
tick 6
tick 5
tick 4
tick 3
tick 2
tick 1
```
</details>

## 3. do-while Loop with Menu Selection Example

The do-while loop is especially useful when you process a menu selection because you will usually want the body of a menu loop to execute at least once.

```java
public class DoWhileMenuExample {
    public static void main(String args[]) throws java.io.IOException {
        char choice;
        do {
            System.out.println("Help on: ");
            System.out.println(" 1. if");
            System.out.println(" 2. switch");
            System.out.println(" 3. while");
            System.out.println(" 4. do-while");
            System.out.println(" 5. for\n");
            System.out.println("Choose one:");
            choice = (char) System.in.read();
        } while (choice < '1' || choice > '5');

        System.out.println("\n");
        
        switch (choice) {
            case '1':
                System.out.println("The if:\n");
                System.out.println("if(condition) statement;");
                System.out.println("else statement;");
                break;
            case '2':
                System.out.println("The switch:\n");
                System.out.println("switch(expression) {");
                System.out.println(" case constant:");
                System.out.println(" statement sequence");
                System.out.println(" break;");
                System.out.println(" //...");
                System.out.println("}");
                break;
            case '3':
                System.out.println("The while:\n");
                System.out.println("while(condition) statement;");
                break;
            case '4':
                System.out.println("The do-while:\n");
                System.out.println("do {");
                System.out.println(" statement;");
                System.out.println("} while (condition);");
                break;
            case '5':
                System.out.println("The for:\n");
                System.out.print("for(init; condition; iteration)");
                System.out.println(" statement;");
                break;
        }
    }
}
```

<details>
<summary>Output : </summary>

```shell
Help on: 
 1. if
 2. switch
 3. while
 4. do-while
 5. for

Choose one:
5


The for:

for(init; condition; iteration) statement;
```
</details>

---