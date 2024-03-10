package week02;

public class Calc {
    public static void main(String[] args) {
        int number1 = Integer.parseInt(args[0]);
        int number2 = Integer.parseInt(args[1]);
        int sum= number1+number2;
        int subtraction= number1-number2;
        int multiplication = number1*number2;
        double division= number1/number2;
        int remainder = number1 % number2;

        System.out.println(sum);
        System.out.println(multiplication);
        System.out.println(subtraction);
        System.out.println(division);
        System.out.println(remainder);

    }
}
