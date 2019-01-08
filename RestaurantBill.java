import java.util.Scanner;

public class RestaurantBill {
    public static void main(String... args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the bill amount: ");
        double billAmount = scanner.nextDouble();
        double taxAmount = billAmount / 10;
        System.out.print("Please enter the percentage tip: ");
        double percentageTip = scanner.nextDouble();
        double tip = percentageTip * billAmount / 100;

        System.out.println("Meal cost: " + billAmount);
        System.out.println("Tax amount: " + taxAmount);
        System.out.println("Tip amount: " + tip);
        System.out.println("Total bill: " + (billAmount + taxAmount + tip));

        scanner.close();
    }
}
