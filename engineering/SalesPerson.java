package unsw.engineering;

public class SalesPerson extends Employee {
    private float commission;
    private double salesTarget;
    private double salesAchieved;

    public SalesPerson(String title, String firstName, String lastName, int quota, double salesTarget,
            double salesAchieved, float commission) {
        super(title, firstName, lastName, quota);
        this.salesTarget = salesTarget;
        this.salesAchieved = salesAchieved;
        this.commission = commission;
    }

    public double getSalesAchieved() {
        return salesAchieved;
    }

    public double getSalesTarget() {
        return salesTarget;
    }

    @Override
    public double getAdditionalSalary() {
        return commission * getSalesAchieved();
    }

    public String getSalesSummary() {
        return getFirstName() + getLastName() + "Sales Target: " + getSalesTarget() + "$\n" + "Sales to date: "
                + getSalesAchieved() + "$";
    }

}
