import java.util.Scanner;
public class TipCalculatorRunner {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the tip calculator!");

        System.out.println("What is the total bill?");
        double bill = scan.nextDouble();

        System.out.println("How many people are in your group? ");
        int numPeople = scan.nextInt();

        System.out.println("What's the tip percentage? (0 - 100)");
        int tipPercentage = scan.nextInt();
        System.out.println();


        TipCalculator newTip = new TipCalculator(numPeople, tipPercentage);
        newTip.addMeal(bill);
        System.out.println("-------------------------");
        System.out.println("The total bill before tip is: $" + String.format("%.2f", newTip.getTotalBillBeforeTip()));
        System.out.println("The tip percentage is: " + newTip.getTipPercentage());
        System.out.println("The total tip is: $" + String.format("%.2f", newTip.tipAmount()));
        System.out.println("The tip per person is: $" +  String.format("%.2f", newTip.perPersonTipAmount()));
        System.out.println("The cost per person before tip is: $" + String.format("%.2f", newTip.perPersonCostBeforeTip()));
        System.out.println("The total bill including the tip is: $" + String.format("%.2f", newTip.totalBill()));
        System.out.println("The total per person (including tip and bill) is: $" + String.format("%.2f", newTip.perPersonTotalCost()));







    }
}