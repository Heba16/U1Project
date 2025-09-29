//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your bill ($): ");
        double totalBill = scan.nextDouble();
        System.out.print("Tip Percent: ");
        double tipPercentage = scan.nextDouble();
        tipPercentage /= (double)100.0F;
        System.out.print("Number of People: ");
        int partyNumber = scan.nextInt();
        System.out.println();
        double totalTip = totalBill * tipPercentage;
        double roundedTip = (double)Math.round(totalTip * (double)100.0F) / (double)100.0F;
        System.out.print("Total Tip amount: $");
        System.out.printf("%.2f", roundedTip);
        System.out.println();
        double totalBillAndTip = totalBill + totalTip;
        double roundedTotalBillAndTip = (double)Math.round(totalBillAndTip * (double)100.0F) / (double)100.0F;
        System.out.print("Total bill cost: $");
        System.out.printf("%.2f", roundedTotalBillAndTip);
        System.out.println();
        double tipPerPerson = totalTip / (double)partyNumber;
        double roundedTipPerPerson = (double)Math.round(tipPerPerson * (double)100.0F) / (double)100.0F;
        System.out.print("Tip per person: $");
        System.out.printf("%.2f", roundedTipPerPerson);
        System.out.println();
        double billPerPerson = totalBillAndTip / (double)partyNumber;
        double roundedBillPerPerson = (double)Math.round(billPerPerson * (double)100.0F) / (double)100.0F;
        System.out.print("Total bill per person: $");
        System.out.printf("%.2f", roundedBillPerPerson);
    }
}