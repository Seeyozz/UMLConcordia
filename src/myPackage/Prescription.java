package myPackage;

import java.util.Scanner;

public class Prescription {
    int dosage;
    String date;
    String moment;
    String name;
    int id;
    String username;
    int id_med = 1;

    public void add(){
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the name of the customer ?");
        this.username = scan.next();
        System.out.println("What is the id of the medication ?");
        this.id = scan.nextInt();
        System.out.println("What is the name of the medication ?");
        this.name = scan.next();
        System.out.println("How many dose should the patient take ?");
        this.dosage = scan.nextInt();
        System.out.println("What day should the medication been taken ?");
        System.out.print("Day/month/year :");
        date = scan.next();
        System.out.println("\nAt what moment of the day should it been taken ? \nEnter 'morning', 'afternoon' or 'evening' ");
        this.moment = scan.next();

        SQL i = new SQL();

        i.insert_Customer(username,id,dosage,moment,name,id_med,date);

        i.select_all_Customer();

    }



}
