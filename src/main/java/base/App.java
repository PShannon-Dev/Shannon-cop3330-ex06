/*
 *  UCF COP3330 Summer 2021 Assignment 6 Solution
 *  Copyright 2021 Paul Shannon
 */
package base;

import java.time.Year;
import java.util.Scanner;

public class App {
    //make a class variable for inputs
    Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        App RetireCalc = new App();

        //gets current year for future calculations
        Year year = Year.now();

        int age = RetireCalc.get_current_age();
        int retireAt = RetireCalc.get_desired_retirement();
        int yearsToGo = RetireCalc.the_time_left(age, retireAt);
        RetireCalc.year_to_year(year, yearsToGo);
    }

    public int get_current_age()
    {
        //prompt
        System.out.print("What is your current age? ");
        String str = input.nextLine();

        //convert
        return Integer.parseInt(str);

    }

    public int get_desired_retirement()
    {
        //prompt
        System.out.print("At what age would you like to retire? ");
        String str = input.nextLine();

        //conversion
        return Integer.parseInt(str);
    }

    public int the_time_left(int age, int retireAt)
    {
        //arithmetic
        int yearsLeft = retireAt - age;

        //output statement
        System.out.println("You have " + yearsLeft + " years left until you can retire.");

        //return the years left to be used in final output
        return yearsLeft;
    }

    public void year_to_year(Year year, int yearsToGo)
    {
        //make local variable to represent the retirement year for output
        Year retirementYear = year.plusYears(yearsToGo);
        System.out.println("It's " + year + ", so you can retire in " + retirementYear + ".");
    }

}
