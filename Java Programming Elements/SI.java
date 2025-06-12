import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Principal: ");
        double principal = input.nextDouble();
        System.out.print("Enter Rate of Interest: ");
        double rate = input.nextDouble();
        System.out.print("Enter Time (in years): ");
        double time = input.nextDouble();

        double si = (principal * rate * time) / 100;

        System.out.println("The Simple Interest is " + si + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time);
    }
}
