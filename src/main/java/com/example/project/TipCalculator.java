package com.example.project;

public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW      
        StringBuilder result = new StringBuilder();
        //your code here
        double percentage = (double) percent/100;
        double totalTip = cost * percentage;
        double totalBillTip = cost + totalTip;
        double perCost = cost/people;
        double perTip = totalTip/people;
        double totalSplit = totalBillTip / people;
     

        


        result.append("-------------------------------\n");
        result.append("Total bill before tip: $" + Math.round(cost * 100)/100.0 + "\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: " + percent + "%\n");
        result.append("Total tip: $" + Math.round(totalTip * 100)/100.0 + "\n");
        result.append("Total Bill with tip: $" + Math.round((cost + totalTip) * 100)/100.0 + "\n");
        result.append("Per person cost before tip: $" + Math.round(perCost * 100)/100.0 + "\n");
        result.append("Tip per person: $" + Math.round(perTip * 100)/100.0 + "\n");
        result.append("Total cost per person: $" + Math.round(totalSplit * 100)/100.0 + "\n");
        result.append("-------------------------------\n");

        return result.toString();
    }
    //// I got the round information from the website geeksforgeeks
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people = 5; 
        int percent = 15;
        double cost = 60;              
        System.out.println(calculateTip(people,percent,cost));
    }
}
        
