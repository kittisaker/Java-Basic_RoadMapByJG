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
