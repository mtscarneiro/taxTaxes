package entities;

public class CompanyTax extends TaxPayer{
    private Integer numberOfEmployees;

    public CompanyTax(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public CompanyTax(String name, Double annualIncome, Integer numberOfEmployees) {
        super(name, annualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public Double tax() {
        if(numberOfEmployees > 10 ){
           return getAnnualIncome() * 0.14;
        }
        else{
            return getAnnualIncome() * 0.16;
        }
    }
}
