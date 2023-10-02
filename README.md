# Java Programming Language : Chapter 7 Bitwise Operators in Java with Examples

## 1. The Bitwise Logical Operators
The bitwise logical operators are &, |, ^, and ~. Let's briefly discuss these bitwise logic operators. The following table shows the outcome of each operation.

## 2. Using the Bitwise Logical Operators

```java
package net.kope.corejava.operators.bitwise;

public class BitLogic {
    public static void main(String args[]) {
        String binary[] = {
            "0000",
            "0001",
            "0010",
            "0011",
            "0100",
            "0101",
            "0110",
            "0111",
            "1000",
            "1001",
            "1010",
            "1011",
            "1100",
            "1101",
            "1110",
            "1111"
        };
        int a = 3; // 0 + 2 + 1 or 0011 in binary
        int b = 6; // 4 + 2 + 0 or 0110 in binary
        int c = a | b;
        int d = a & b;
        int e = a ^ b;
        int f = (~a & b) | (a & ~b);
        int g = ~a & 0x0f;
        System.out.println(" a = " + binary[a]);
        System.out.println(" b = " + binary[b]);
        System.out.println(" a|b = " + binary[c]);
        System.out.println(" a&b = " + binary[d]);
        System.out.println(" a^b = " + binary[e]);
        System.out.println("~a&b|a&~b = " + binary[f]);
        System.out.println(" ~a = " + binary[g]);
    }
}
```

<details>
<summary>Output : </summary>

```shell
 a = 0011
 b = 0110
 a|b = 0111
 a&b = 0010
 a^b = 0101
~a&b|a&~b = 0101
 ~a = 1100
```

</details>

## 3. The Left Shift

```java
package net.kope.corejava.operators.bitwise;

public class ByteShif {
    public static void main(String[] args) {
        byte a = 64, b;
        int i;
        
        i = a << 2;
        b = (byte)(a << 2);

        System.out.println("Original value of a : " + a);
        System.out.println("i and b : " + i + " " + b);
    }
}
```

<details>
<summary>Output : </summary>

```java
Original value of a: 64
i and b: 256 0
```

</details>

## 4. Java Right Shift Operator

```java
package net.kope.corejava.operators.bitwise;

public class OperatorExample {
    public static void main(String[] args) {
        System.out.println(10 >> 2); //10/2^2=10/4=2  
        System.out.println(20 >> 2); //20/2^2=20/4=5  
        System.out.println(20 >> 3); //20/2^3=20/8=2 
    }
}
```

<details>
<summary>Output : </summary>

```shell
2
5
2
```

</details>

## 5. Bitwise Operator Compound Assignments

```java
package net.kope.corejava.operators.bitwise;

public class OpBitEquals {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        a |= 4;
        b >>= 1;
        c <<= 1;
        a ^= c;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
```

<details>
<summary>Output : </summary>

```shell
a = 3
b = 1
c = 6
```

<details>/

---