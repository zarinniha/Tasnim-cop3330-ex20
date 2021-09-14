/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Zarin Tasnim
 */
import java.util.Scanner;
class tax_calculator{

    public static void main(String args[])
    {
        double additionalTax=0;
        double salesTax=0;
        System.out.print("What is the order amount? ");
        Scanner sc =new Scanner(System.in);
        double amount = sc.nextDouble();

        System.out.print("What state do u live in? ");
        Scanner obj1=new Scanner(System.in);
        String state = obj1.nextLine();

        if(state.equalsIgnoreCase("Wisconsin"))
        {
            salesTax=5;
            System.out.print("What county do u live in? ");
            String county = obj1.nextLine();
            if(county.equalsIgnoreCase("Eau Claire"))
            {
                additionalTax=0.005;
            }else if(county.equalsIgnoreCase("Dunn county"))
            {
                additionalTax=0.004;
            }
        }else if(state.equalsIgnoreCase("Illinois"))
        {
            salesTax=8;
            additionalTax=0;
        }

        //tax = amount * total tax/100;
        double tax=(amount*(salesTax+additionalTax)/100);
        double total = amount+tax;

        System.out.print("The tax is $"+String.format("%.2f",tax)+"\nThe total is $"+String.format("%.2f",total));

    }
}