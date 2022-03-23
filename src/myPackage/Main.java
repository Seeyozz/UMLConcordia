package myPackage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean quit = false;
        boolean connected = false;
        Login login = null;
        String[][] database = {{"pablo","password"},{"benjamin","123456"}};
        do {
            System.out.println("""
                    What do you want to do?
                    1- Login
                    2- Calculate BMI
                    0- Quit""");
            int menuItem = input.nextInt();
            switch (menuItem) {
                case 1:
                    while(!connected){
                        System.out.println("Enter you username: ");
                        String username =input.next();
                        System.out.println("Enter your password");
                        String password = input.next();
                        login = Login.getInstance(username, password);
                        System.out.println(login.username);

                        if(login.tryconnect(username,password)){
                            connected = true;
                            System.out.println("\n ✅ You're connected ✅\n");
                        }
                        else{
                            System.out.println("\n ❌ Wrong informations ❌\n");
                        }
                    }
                    clearScreen();
                    if (login.username.equals("pablo")){
                        System.out.println("""
                            What do you want to do?
                            1- Add a prescription
                            2- See list of future prescriptions
                            3- See historic
                            0- Quit""");
                    }
                    int select = input.nextInt();
                    switch(select){
                        case 1:

                            break;

                        case 2:
                            break;

                }
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
                    System.out.println("The BMI is: " + userBMI);
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
    public static void clearScreen() {
        {
            try {
                final String os = System.getProperty("os.name");

                if (os.contains("Windows")) {
                    Runtime.getRuntime().exec("cls");
                } else {
                    Runtime.getRuntime().exec("clear");
                }
            } catch (final Exception e) {
                //  Handle any exceptions.
            }
        }
    }

}
