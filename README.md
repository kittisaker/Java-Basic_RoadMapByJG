# Java Programming Language : Chapter 11 java for Loop

## Java for Loop Syntax
```java
for (initialization; termination;
     increment) {
    statement(s)
}

// The initialization expression initializes the loop; it's executed once, as the loop begins.
// When the termination expression evaluates to false, the loop terminates.
// The increment expression is invoked after each iteration through the loop; it is perfectly acceptable for this expression to increment or decrement a value.
```

## Simple for Loop Example

```java
public class ForLoopExample {
    public static void main(String[] args) {
        for(int n = 10; n > 0; n--){
            System.out.println("tick " +n);
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

```java
public class ForLoopFindPrime {
    public static void main(String[] args) {
        int num;
        boolean isPrime;
        num = 14;

        if(num < 2){
            isPrime = false;
        }else{
            isPrime = true;
        }

        for(int i = 2; i <= num / i; i++){
            if((num % i) == 0){
                isPrime = false;
                break;
            }
        }

        if(isPrime){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }
    }
}
```

<details>
<summary>Output : </summary>

```shell
Not Prime
```

</details>

## Using the Comma

```java
public class ForLoopComma {
    public static void main(String[] args) {
        int a, b;
        for(a =1, b = 4; a < b; a++, b--){
            System.out.println("a = " +a);
            System.out.println("b = " +b);
        }
    }
}
```

<details>
<summary>Output : </summary>

```shell
a = 1
b = 4
a = 2
b = 3
```

</details>

## The For-Each Version of the for Loop

* Syntax
```java
for(type itr-var : collection) statement-block

// Here, type specifies the type and itr-var specifies the name of an iteration variable that will receive the elements from a collection, one at a time, from beginning to end.
```

* Example

```java
public class ForEachExample {
    public static void main(String[] args) {
        int[] nums = {
            1,
            2,
            3,
            4,
            5,
            6,
            7,
            8,
            9,
            10
        };

        int sum = 0;

        for(int x: nums){
            System.out.println("Value is : " + x);
            sum += x;
        }

        System.out.println("Summation: " + sum);
    }
}
```

<details>
<summary>Output : </summary>

```shell
Value is : 1
Value is : 2
Value is : 3
Value is : 4
Value is : 5
Value is : 6
Value is : 7
Value is : 8
Value is : 9
Value is : 10
Summation: 55
```

</details>

## for-each Loop with Break

```java
public class ForEachWithBreak {
    public static void main(String[] args) {
        int[] nums = {
            1,
            2,
            3,
            4,
            5,
            6,
            7,
            8,
            9,
            10
        };

        int sum = 0;

        for(int x: nums){
            System.out.println("Value is : " + x);
            sum += x;

            if(x == 5){
                break;
            }
        }

        System.out.println("Summation: " + sum);
    }
}
```

<details>
<summary>Output : </summary>

```shell
Value is : 1
Value is : 2
Value is : 3
Value is : 4
Value is : 5
Summation: 15
```

</details>

## The for-each Loop is Essentially Read-Only
There is one important point to understand about the for-each style loop. Its iteration variable is “read-only” as it relates to the underlying array. An assignment to the iteration variable has no effect on the underlying array. In other words, we can’t change the contents of the array by assigning the iteration variable a new value.

```java
public class ForEachNoChange {
    public static void main(String[] args) {
        int[] nums = {
            1,
            2,
            3,
            4,
            5,
            6,
            7,
            8,
            9,
            10
        };

        for(int x: nums){
            System.out.print(x + " ");
            x = x * 10;                 // No effect on nums
        }

        System.out.println();

        for(int x: nums){
            System.out.println(x + " ");
        }

        System.out.println();
    }
}
```

<details>
<summary>Output : </summary>

```shell     
1 2 3 4 5 6 7 8 9 10 
1
2
3
4
5
6
7
8
9
10
```

</details>

## The for-each Loop - Iterating Over Multidimensional Arrays
The enhanced version of the for also works on multidimensional arrays. The following program uses the for-each style for a two-dimensional array

```java
public class ForEachMultidimensionalArrays {
    public static void main(String[] args) {
        int sum = 0;
        int[][] nums = new int[3][5];

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 5; j++){
                nums[i][j] = (i + 1) * (j + 1);
                // System.out.println(nums[i][j]);
            }
        }

        for(int x[] : nums){
            for(int y : x){
                System.out.println("Value is : " + y);
                sum += y;
            }
        }
        System.out.println("Summation : " + sum);
    }
}
```

<details>
<summary>Output : </summary>

```shell
Value is : 1
Value is : 2
Value is : 3
Value is : 4
Value is : 5
Value is : 2
Value is : 4
Value is : 6
Value is : 8
Value is : 10
Value is : 3
Value is : 6
Value is : 9
Value is : 12
Value is : 15
Summation : 90
```

</details>

## Search an Array Using for-each Style Example

```java
public class ForEachSearchArray {
    public static void main(String[] args) {
        int[] nums = {
            6,
            8,
            3,
            7,
            5,
            6,
            1,
            4
        };

        int val = 5;
        boolean found = false;

        for(int x: nums){
            if(x == val){
                found = true;
                break;
            }
        }

        if(found){
            System.out.println("Value found!");
        }
    }
}
```


<details>
<summary>Output : </summary>

```shell
Value found!
```

</details>

## Nested for Loops

```java
public class NestedForLoops {
    public static void main(String[] args) {
        int i, j;

        for(i = 0; i < 10; i++){
            for(j = i; j < 10; j++){
                System.out.print(".");
            }
            System.out.println();
        }
    }
}
```

<details>
<summary>Output : </summary>

```shell
..........
.........
........
.......
......
.....
....
...
..
.
```

</details>

---