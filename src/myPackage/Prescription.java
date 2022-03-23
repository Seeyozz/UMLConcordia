package myPackage;

import java.util.Scanner;

public class Prescription {
    int dosage;
    int[] date;
    String moment;
    String name;

    public Prescription(){
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the name of the medication ?");
        this.name = scan.nextLine();
        System.out.println("How many dose should the patient take ?");
        this.dosage = scan.nextInt();
        System.out.println("What day should the medication been taken ?");
        System.out.print("Year :");
        int y = scan.nextInt();
        System.out.print("\nMonth :");
        int m = scan.nextInt();
        System.out.print("\nDay :");
        int d = scan.nextInt();
        date = new int[]{y, m, d};
        System.out.println("\nAt what moment of the day should it been taken ? \nEnter 'morning', 'afternoon' or 'evening' ");
        this.moment = scan.next();

    }



}
