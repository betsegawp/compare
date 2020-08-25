import java.util.Scanner;

public class compare {
    public static void main (String[]args) {
        int num1, num2, num3;
        int greatest;

        Scanner input = new Scanner(System.in);
        System.out.println("enter the first number");
        num1 = input.nextInt();
        System.out.println("enter the second number");
        num2 = input.nextInt();
        System.out.println("Enter the third number");
        num3 = input.nextInt();
        greatest = num1;
        if (greatest < num2) {
            greatest = num2;

        }
        if (greatest < num3) {
            greatest = num3;
        }
        System.out.println("The Greatest of all three is : " + greatest);

    }}