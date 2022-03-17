package myPackage;

import java.util.Scanner;
import java.sql.*;


public class SQL {

    public Connection connection(){
        try {

            return DriverManager.getConnection("jdbc:mysql://localhost:3306/Project_ca", "root", "password.");

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    public void select_all_Resident(){
        try {

            Connection co = connection();

            Statement statement = co.createStatement();
            ResultSet resultSet = statement.executeQuery("select* from Resident");

            while (resultSet.next()) {
                System.out.println(resultSet.getString("Name") + " " + resultSet.getString("Email") + " " + resultSet.getString("Mobile_number"));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }


    public void insert_Resident(String name, String email, String mobile){
        try {


            Connection co = connection();

            PreparedStatement posted = co.prepareStatement("INSERT INTO Resident (Name, Email, Mobile_number) VALUES ('"+name+"','"+email+"','"+mobile+"')");

            posted.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void delete_Resident(String email) {
        try {


            Connection co = connection();

            Statement st = co.createStatement();

            st.executeUpdate("DELETE FROM Resident where Email='" + email + "'");


        }catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void update_Resident(String email) {
        String medicine1;


        Scanner input = new Scanner(System.in);

        System.out.println("Enter a medicine to update : ");
        medicine1 = input.next();

        try{
            Connection co = connection();

            Statement st = co.createStatement();

            st.executeUpdate("UPDATE customer SET medicine_1 = " + medicine1 + " WHERE username = " + email + "; ");

        }catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }


}
