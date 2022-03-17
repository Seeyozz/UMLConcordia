package myPackage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean quit = false;
        boolean connected = false;
        String[][] database = {{"pablo","password"},{"benjamin","123456"}};
        do {
            System.out.println("""
                    What do you want to do?
                    1- Login
                    0- Quit""");
            int menuItem = input.nextInt();
            switch (menuItem) {
                case 1:
                    Login login = new Login();
                    while(!connected){
                        System.out.println("Enter you username: ");
                        String username =input.nextLine();
                        login.setUsername(username);
                        System.out.println("Enter your password");
                        String password = input.nextLine();
                        login.setPassword(password);
                        if(login.tryconnect(username,password)){
                            connected = true;
                        }
                    }
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("What do you want to do ?");



                    break;

                case 2:
                    BMI bmi = new BMI();
                    System.out.println("Enter your age: ");
                    int age = input.nextInt();
                    bmi.setAge(age);
                    System.out.println("Enter your height in cm: ");
                    int height = input.nextInt();
                    bmi.setHeight(height);
                    System.out.println("Enter your weight: ");
                    double weight = input.nextDouble();
                    bmi.setWeight(weight);
                    double userBMI = bmi.calculateBMI(bmi.getAge(), bmi.getWeight(), bmi.getHeight());
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    break;

                case 6:

                    break;

                case 7:
                    break;
                case 0:
                    quit = true;
                    break;
                default:
                    System.out.println("Pick a number between 0 and 7");
            }
        } while (!quit);
        System.out.println("Bye-bye!");
    }

}
