import java.util.Scanner;

public class Q26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter from city: ");
        String fromCity = input.nextLine();
        System.out.print("Enter via city: ");
        String viaCity = input.nextLine();
        System.out.print("Enter to city: ");
        String toCity = input.nextLine();

        System.out.print("Enter distance from " + fromCity + " to " + viaCity + " (in miles): ");
        double fromToVia = input.nextDouble();
        System.out.print("Enter distance from " + viaCity + " to " + toCity + " (in miles): ");
        double viaToFinalCity = input.nextDouble();

        System.out.print("Enter time from " + fromCity + " to " + viaCity + " (in minutes): ");
        int time1 = input.nextInt();
        System.out.print("Enter time from " + viaCity + " to " + toCity + " (in minutes): ");
        int time2 = input.nextInt();

        double totalDistanceKm = (fromToVia + viaToFinalCity) * 1.6;
        int totalTime = time1 + time2;

        System.out.println("The Total Distance travelled by " + name + " from " + fromCity + " to " + toCity + " via " + viaCity + " is " + totalDistanceKm + " km and the Total Time taken is " + totalTime + " minutes");
    }
}
