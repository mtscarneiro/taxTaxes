package entities;

public class IndividualTax extends TaxPayer {
    private Double healthExpeds;

    public IndividualTax(Double healthExpeds) {
        this.healthExpeds = healthExpeds;
    }

    public IndividualTax(String name, Double annualIncome, Double healthExpeds) {
        super(name, annualIncome);
        this.healthExpeds = healthExpeds;
    }

    public Double getHealthExpeds() {
        return healthExpeds;
    }

    public void setHealthExpeds(Double healthExpeds) {
        this.healthExpeds = healthExpeds;
    }

    @Override
    public Double tax() {
        if(getAnnualIncome() < 20000.0){

        return getAnnualIncome() * 0.15 - healthExpeds * 0.5;

        }
        else{
            return getAnnualIncome() * 0.25 - healthExpeds * 0.5;
        }
    }
    
}
