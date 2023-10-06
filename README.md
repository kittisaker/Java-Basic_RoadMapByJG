# Java Programming Language : Chapter 12 Java while Loop

* Syntax
```java
while(condition) {
    // body of a loop
}
// The condition can be any boolean expression. The body of the loop will be executed as long as the conditional expression is true. When the condition becomes false, control passes to the next line of code immediately following the loop. 
```

## 1. How while loop works?
In a while loop, a condition is evaluated first, and if it returns true then the statements inside while loop execute. When the condition returns false, the control comes out of a loop and jumps to the next statement after a while loop.

## 2. Simple while Loop Example

```java
public class WhileLoopExample {
    public static void main(String[] args) {
        int n = 10;

        while (n > 0) {
            System.out.println("tick " + n);
            n--;
        }
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


## 3. The while Loop with No Body
The body of the while (or any other of Java’s loops) can be empty. This is because a null statement (one that consists only of a semicolon) is syntactically valid in Java.
```java
public class WhileLoopNoBody {
    public static void main(String[] args) {
        int i, j;
        i = 100;
        j = 200;

        // find midpoint between i and j
        while (++i < --j) {
            // NO body in this loop
        }

        System.out.println("Midpoint is " + i);
    }
}
```

<details>
<summary>Output : </summary>

```shell
Midpoint is 150
```

</details>

## 4. Infinite while Loop
If you pass true in the while loop, it will be an infinite while loop.

* Syntax
```java
while(true){  
    //code to be executed  
}
```

---