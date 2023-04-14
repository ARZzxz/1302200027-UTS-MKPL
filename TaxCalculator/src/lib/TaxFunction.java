package lib;

public class TaxFunction {

    public static double calculateTax(int monthlySalary, int otherMonthlyIncome, int numberOfMonthWorking, int deductible, boolean married, int numberOfChildren) {

        if (numberOfMonthWorking > 12) {
            throw new IllegalArgumentException("Number of month working exceeds 12");
        }

        numberOfChildren = Math.min(numberOfChildren, 3);

        double nonTaxableIncome = 54000000;

        if (married) {
            nonTaxableIncome += 4500000;
        }

        nonTaxableIncome += numberOfChildren * 1500000;

        double taxableIncome = (monthlySalary + otherMonthlyIncome) * numberOfMonthWorking - deductible - nonTaxableIncome;

        double tax = Math.round(0.05 * taxableIncome);

        return Math.max(tax, 0);
    }

}
//merge branch refactoring ke master