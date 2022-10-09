public class TipCalculator {


    // instance variables

    private int numPeople;
    private int tipPercentage;
    private double totalBillBeforeTip;


    // constructors

    public TipCalculator(int numPeople, int tipPercentage) {
        this.numPeople = numPeople;
        this.tipPercentage = tipPercentage;
        totalBillBeforeTip = 0.0; // default value
    }


    // methods

    public double getTotalBillBeforeTip() {
        return totalBillBeforeTip;
    }

    public int getTipPercentage() {
        return tipPercentage;
    }

    public void addMeal(double cost) {
        totalBillBeforeTip += cost;
        if (cost == -1) {
            totalBillBeforeTip++;
        }
    }

    public double tipAmount() {
        return (((double) tipPercentage / 100) * totalBillBeforeTip);
    }

    public double totalBill() {
        return tipAmount() + getTotalBillBeforeTip();
    }

    public double perPersonCostBeforeTip() {
        return getTotalBillBeforeTip() / numPeople;
    }

    public double perPersonTipAmount() {
        return tipAmount() / numPeople;
    }

    public double perPersonTotalCost() {
        return totalBill() / numPeople;
    }
}
