package net.kope.corejava.variables;

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