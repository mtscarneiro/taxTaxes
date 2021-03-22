package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.CompanyTax;
import entities.IndividualTax;
import entities.TaxPayer;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<>();

        System.out.println("Enter the number of tax payers: ");
        int taxPayer = input.nextInt();

        for(int i = 1; i <= taxPayer; i++){
            System.out.println("Tax payer #" + i + " data: ");
            System.out.println("Individual or company (i/c)? ");
            char x = input.next().charAt(0);
            System.out.println("Name: ");
            input.nextLine();
            String name = input.nextLine();
            System.out.println("Anual income: ");
            double annualIncome = input.nextDouble();

            if(x == 'i'){
                System.out.println("Health expenditures: ");
                double healthExpeds = input.nextDouble();
                list.add(new IndividualTax(name, annualIncome, healthExpeds));
            }
            else{
                System.out.println("Number of employees: ");
                int numberOfEmployees = input.nextInt();
                list.add(new CompanyTax(name, annualIncome, numberOfEmployees));
            }

            
        } 
            double sum = 0.0;
            System.out.println();
            System.out.println("TAXES PAID: ");
            for (TaxPayer tp : list) {
                double tax = tp.tax();
                System.out.println(tp.getName() + ": $ " + String.format("%.2f", tax));
                sum += tax;
            System.out.println();
            System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));

        input.close();
        
    }
            
  }
}