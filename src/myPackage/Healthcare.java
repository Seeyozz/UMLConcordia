package myPackage;
import java.util.Scanner;

import java.sql.Date;

public class Healthcare extends User {


    public void newPrescription(){
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the name of the medication ?");
        String name = scan.nextLine();
        System.out.println("How many dose should the patient take ?");
        int dose = scan.nextInt();
        System.out.println("What day should the medication been taken ?");
        System.out.print("Year :");
        int y = scan.nextInt();
        System.out.print("\nMonth :");
        int m = scan.nextInt();
        System.out.print("\nDay :");
        int d = scan.nextInt();
        System.out.println("\nAt what moment of the day should it been taken ? \nEnter 'morning', 'afternoon' or 'evening' ");
        String moment = scan.next();
        //script pour add à la bdd.

    }
}
