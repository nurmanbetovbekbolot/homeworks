package zadachaC;

public class MinistryOfFinance extends Ministry {
    int amountOfDonors;
    double publicdebt;
    String finReport;
    String[] securities;

    public MinistryOfFinance(String budget, int amountofworkers, String address, String headofministry, String[] activities) {
        super(budget, amountofworkers, address, headofministry, activities);
    }
}
