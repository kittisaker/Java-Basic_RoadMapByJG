# Java Programming Language : Chapter 16 Java continue Statement

## 1. Flow Diagram of a continue Statement
The continue statement skips the current iteration of a for, while or do-while loop. The unlabeled form skips to the end of the innermost loop's body and evaluates the boolean expression that controls the loop.

## 2. continue Statement Inside for Loop Example

```java
public class ContinueExample {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            System.out.print(i + " ");

            if(i % 2 == 0){
                continue;
            }

            System.out.println("");
        }
    }
}
```

<details>
<summary>Output : </summary>

```shell
0 1  
2 3
4 5
6 7
```
</details>


## 3. Using continue Statement in while Loop Example

```java
public class ContinueExample {
    public static void main(String[] args) {
        int count = 10;

        while (count >= 0) {

            if(count == 7){
                count--;
                continue;
            }

            System.out.println(count + " ");
            count--;
        }
    }
}
```

<details>
<summary>Output : </summary>

```shell
10 
9 
8 
6 
5 
4 
3
2
1
0
```
</details>

## 4. Using continue Statement in do-while Loop Example

```java
public class ContinueExample {
    public static void main(String[] args) {
        int j = 0;

        do{
            if(j == 7){
                j++;
                continue;
            }
            System.out.print(j + " ");
            j++;
        }while(j < 10);
    }
}
```

<details>
<summary>Output : </summary>

```shell
0 1 2 3 4 5 6 8 9
```
</details>

## 5. Using continue Statement with Labeled for Loop

```java
public class ContinueLabel {
    public static void main(String[] args) {
        outer: for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if(j > i){
                    System.out.println();
                    continue outer;
                }
                System.out.print(" " + (i * j));
            }
        }
        System.out.println("End loop");
    }
}
```

<details>
<summary>Output : </summary>

```shell
0
 0 1
 0 2 4
 0 3 6 9
 0 4 8 12 16
 0 5 10 15 20 25
 0 6 12 18 24 30 36
 0 7 14 21 28 35 42 49
 0 8 16 24 32 40 48 56 64
 0 9 18 27 36 45 54 63 72 81End loop
```
</details>

---