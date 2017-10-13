/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_prg_02_01_name_age_and_annual_income;

/**
 *
 * @author bluebackdev
 * Write a program that declares the following:
 *  - A String variable named name
 *  - An int variable named age
 *  - A double variable named annualPay
 * Store your age, name, and desired annual income as literals in these
 * variables. The program should display these values on the screen in a manner
 * similar to the following:
 *  My name is Joe Mahoney, my age is 26 and
 *  I hope to earn $100000.0 per year.
 */
public class JAVA_PRG_02_01_Name_Age_and_Annual_Income {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String strName = "Keith B. Smith";
        int intAge = 30;
        double dblAnnualPay = 1000000.00;
        
        System.out.println("My name is " + strName + ", my age is " +
                            intAge + " and");
        System.out.println("I hope to earn $" + dblAnnualPay + " per year.");
    }
    
}
