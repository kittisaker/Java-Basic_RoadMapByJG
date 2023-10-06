# Java Programming Language : Chapter 15 Java break Statement

## 1. Using a break to Exit a for Loop

```java
public class BreakWithForLoop {
    public static void main(String[] args) {
        for(int i = 0; i < 100; i++){
            if(i == 10){
                break;
            }
            System.out.println("i : " + i);
        }
        System.out.println("Loop complete");
    }
}
```

<details>
<summary>Output : </summary>

```shell
i : 0
i : 1
i : 2
i : 3
i : 4
i : 5
i : 6
i : 7
i : 8
i : 9
Loop complete
```
</details>

## 2. Using break to Exit a while Loop

```java
public class BreakWithWhileLoop {
    public static void main(String[] args) {
        int i = 0;

        while (i < 100) {
            if(i == 10){
                break;
            }
            System.out.println("i : " +i);
            i++;
        }
        System.out.println("Loop complete.");
    }
}
```

<details>
<summary>Output : </summary>

```shell
i : 0
i : 1
i : 2
i : 3
i : 4
i : 5
i : 6
i : 7
i : 8
i : 9
Loop complete.
```
</details>

## 3. Using break with Nested Loops

```java
public class BreakWithNestedLoops {
    public static void main(String[] args) {
        for(int i = 0; i < 3; i++){
            System.out.print("Pass " +i+ " : ");
            for(int j = 0; j < 100; j++){
                if(j == 10){
                    break;
                }
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("Loops complete.");
    }
}
```

<details>
<summary>Output : </summary>

```shell
Pass 0 : 0 1 2 3 4 5 6 7 8 9 
Pass 1 : 0 1 2 3 4 5 6 7 8 9
Pass 2 : 0 1 2 3 4 5 6 7 8 9
Loops complete.
```
</details>

## 4. Using break with a switch case Statement

```java
public class BreakSwitchCaseExample {
    public static void main(String[] args) {
        int num = 2;

        switch(num){
            case 1:
                System.out.println("Case 1 ");
                break;
            case 2:
                System.out.println("Case 2 ");
                break;
            case 3:
                System.out.println("Case 3 ");
                break;
            default:
                System.out.println("Default ");
        }
    }
}
```

<details>
<summary>Output : </summary>

```shell
Case 2 
```
</details>


## 5. Using break as a Civilized Form of goto

```java
public class BreakGoto {
    public static void main(String[] args) {
        boolean t = true;

        first:{
            second:{
                third:{
                    System.out.println("Befor the break.");
                    if(t){
                        break second;
                    }
                    System.out.println("This won't execute");
                }
                System.out.println("This won't execute");
            }
            System.out.println("This is after second block.");
        }
    }
}
```

<details>
<summary>Output : </summary>

```shell
Befor the break.
This is after second block.
```
</details>

---