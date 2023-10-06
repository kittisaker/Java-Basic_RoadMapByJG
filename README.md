# Java Programming Language : Chapter 14 Java Switch Case Statement

* Syntax
```java
switch (expression) {
    case value1:
        // statement sequence
        break;
    case value2:
        // statement sequence
        break;
        .
        .
        .
        case valueN:
            // statement sequence
            break;
    default:
        // default statement sequence
}
```

The switch statement works like this: The value of the expression is compared with each of the values in the case statements. If a match is found, the code sequence following that case statement is executed. If none of the constants match the value of the expression, then the default statement is executed. However, the default statement is optional. If no case matches and no default is present, then no further action is taken.

## 1. Java switch case Simple Example

```java
public class SwitchDemo {
    public static void main(String[] args) {
        int month = 8;
        String monthString;

        switch (month) {
            case 1:
                monthString = "January";
                break;
            case 2:
                monthString = "February";
                break;
            case 3:
                monthString = "March";
                break;
            case 4:
                monthString = "April";
                break;
            case 5:
                monthString = "May";
                break;
            case 6:
                monthString = "June";
                break;
            case 7:
                monthString = "July";
                break;
            case 8:
                monthString = "August";
                break;
            case 9:
                monthString = "September";
                break;
            case 10:
                monthString = "October";
                break;
            case 11:
                monthString = "November";
                break;
            case 12:
                monthString = "December";
                break;
            default:
                monthString = "Invalid month";
                break;
        }
        
        System.out.println(monthString);
    }
}
```

<details>
<summary>Output : </summary>

```shell
August
```
</details>

## 2. Java switch Statement with Break (break statements are optional)

```java
public class MissingBreak {
    public static void main(String[] args) {
        for(int i = 0; i < 12; i++){
            switch(i){
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("i is less than 5");
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    System.out.println("i is less than 10");
                    break;
                default:
                    System.out.println("i is 10 or more");
            }
        }
    }
}
```

<details>
<summary>Output : </summary>

```shell
i is less than 5
i is less than 5
i is less than 5
i is less than 5
i is less than 5
i is less than 10
i is less than 10
i is less than 10
i is less than 10
i is less than 10
i is 10 or more
i is 10 or more
```
</details>

## 3. Java switch Statement with String

```java
public class StringsSwitch {
    public static void main(String[] args) {
        String str = "two";

        switch (str) {
            case "one":
                System.out.println("one");
                break;
            case "two":
                System.out.println("two");
                break;
            case "three":
                System.out.println("three");
                break;
            default:
                System.out.println("no match");
                break;
        }
    }
}
```

<details>
<summary>Output : </summary>

```shell
two
```
</details>

## 4. Java switch Statement with Enum

```java
public class EnumInSwitchStatement {

    enum Days{
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY;
    }

    public static String enumInSwitch(Days day){
        switch (day) {
            case SUNDAY:
                return "Its Sunday!!";
            case MONDAY:
                return "Its Monday";
            case TUESDAY:
                return "Its Tuesday";
            case WEDNESDAY:
                return "Its Wednesday";
            default:
                return "Rest of the week....";
        }
    }

    public static void main(String[] args) {
        System.out.println(enumInSwitch(Days.SUNDAY));
    }
}
```

<details>
<summary>Output : </summary>

```shell
Its Sunday!!
```
</details>

## 5. Java Nested switch Statements

```java
switch (count) {
    case 1:
        switch (target) { // nested switch
            case 0:
                System.out.println("target is zero");
                break;
            case 1: // no conflicts with outer switch
                System.out.println("target is one");
                break;
        }
        break;
    case 2: // ...
```

---