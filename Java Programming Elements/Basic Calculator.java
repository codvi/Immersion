import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();

        double add = num1 + num2;
        double sub = num1 - num2;
        double mul = num1 * num2;
        double div = num1 / num2;

        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers " + num1 + " and " + num2 + " is " + add + ", " + sub + ", " + mul + ", and " + div);
    }
}
