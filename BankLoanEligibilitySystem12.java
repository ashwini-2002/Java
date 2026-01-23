// Usecase12
package ashwini.cm;

import java.util.*;

public class BankLoanEligibilitySystem12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User details
        System.out.println("Please enter your name:");
        String name = sc.next();

        System.out.println("Enter your age " + name + ":");
        Integer age = sc.nextInt();   // Wrapper class Integer

        System.out.println("Please enter your CIBIL score " + name + ":");
        Integer cibilScore = sc.nextInt();   // Wrapper class Integer

        System.out.println("Enter the number of businesses you own:");
        int businesses = sc.nextInt();

        // Store monthly income using wrapper class Double
        ArrayList<Double> incomeList = new ArrayList<>();

        double totalIncome = 0.0;

        // Autoboxing & Unboxing
        for (int i = 1; i <= businesses; i++) {
            System.out.println("Enter income of business " + i + ":");
            double income = sc.nextDouble();

            incomeList.add(income);        // Autoboxing: double -> Double
            totalIncome += income;         // Unboxing: Double -> double
        }

        System.out.println("\nApplicant Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("CIBIL Score: " + cibilScore);
        System.out.println("Total Monthly Income: " + totalIncome);

        // Loan eligibility decision logic
        if (age > 18 && cibilScore >= 800 && totalIncome >= 125000) {
            System.out.println("\nYou are eligible for a loan of ₹150,000");
        }
        else if (age > 18 && cibilScore >= 750 && totalIncome >= 10000) {
            System.out.println("\nYou are eligible for a loan of ₹125,000");
        }
        else if (age > 18 && cibilScore >= 700 && totalIncome >= 50000) {
            System.out.println("\nYou are eligible for a loan of ₹1,00,000");
        }
        else {
            System.out.println("\nYou are not eligible for a loan");
        }

        sc.close();
    
}
}