package week02;

public class Fact {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        long factorial=1;

        if (number<0) {
            System.out.println("555 cannot be negative");
            
        }
            else {
            for (int i=1; i<=number;i++) {
               factorial *= i;
            } }
            
        }
    
    }
