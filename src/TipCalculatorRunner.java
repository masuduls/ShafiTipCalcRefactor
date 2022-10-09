import java.util.Scanner;
import java.text.DecimalFormat;

public class TipCalculatorRunner {
    public static void main(String[] args) {

        // variables
        int numPeople = 0;
        int tipPercentage = 0;
        double dishCost = 0.0;

        // import objects
        Scanner scan = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#.##");

        // user input
        System.out.println("Welcome to the tip calculator!");
        System.out.print("Enter the amount of people in your group: ");
        numPeople = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter the tip percentage (0-100): ");
        tipPercentage = scan.nextInt();
        scan.nextLine();
        TipCalculator calc = new TipCalculator(numPeople, tipPercentage);
        while (dishCost != -1) {
            System.out.print("Enter a cost in dollars and cents (-1 to end): ");
            dishCost = scan.nextDouble();
            calc.addMeal(dishCost);
            scan.nextLine();
        }

        // calculations
        System.out.println("Total bill before tip: " + formatter.format(calc.getTotalBillBeforeTip()));
        System.out.println("Tip percentage: " + calc.getTipPercentage() + "%");
        System.out.println("Total tip: " + (formatter.format(calc.totalBill() - calc.getTotalBillBeforeTip())));
        System.out.println("Total bill with tip: " + formatter.format(calc.totalBill()));
        System.out.println("Per person cost before tip: " + (formatter.format(calc.perPersonCostBeforeTip())));
        System.out.println("Tip per person: " + formatter.format((calc.perPersonTipAmount())));
        System.out.println("Total cost per person: " + formatter.format(calc.perPersonTotalCost()));
    }
}