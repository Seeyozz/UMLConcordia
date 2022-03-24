package myPackage;

import java.util.Scanner;
import java.sql.*;


public class SQL {

    public Connection connection(){
        try {

            return DriverManager.getConnection("jdbc:mysql://localhost:3306/customer", "root", "1998Ocanada1.");

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    public void select_all_Customer(){
        try {

            Connection co = connection();

            Statement statement = co.createStatement();
            ResultSet resultSet = statement.executeQuery("select* from Medication");

            while (resultSet.next()) {
                System.out.println(resultSet.getString("Username") + " " + resultSet.getString("Id") + " " + resultSet.getString("Dosage")
                        + " " + resultSet.getString("Time_")+ " " + resultSet.getString("Medication")+ " " + resultSet.getString("Id_medication")
                        + " " + resultSet.getString("Date_"));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }


    public void insert_Customer(String username, int id, int dosage , String time, String medication, int id_med, String date){
        try {


            Connection co = connection();

            PreparedStatement posted = co.prepareStatement("INSERT INTO Medication (Username, Id, Dosage, Time_, Medication, Id_medication, Date_) VALUES ('"+username+"','"+id+"','"+dosage+"','"+time+"','"+medication+"','"+id_med+"','"+date+"')");

            posted.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void delete_Customer(int id) {
        try {


            Connection co = connection();

            Statement st = co.createStatement();

            st.executeUpdate("DELETE FROM Medication where Id='" + id + "'");


        }catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void insert_Cust(String username, String password, double bmi){
        try {


            Connection co = connection();

            PreparedStatement posted = co.prepareStatement("INSERT INTO customer (Username, Password, BMI) VALUES ('"+username+"','"+password+"','"+bmi+"')");

            posted.executeUpdate();

            System.out.println("done");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        try {

            Connection co = connection();

            Statement statement = co.createStatement();
            ResultSet resultSet = statement.executeQuery("select* from customer");

            while (resultSet.next()) {
                System.out.println(resultSet.getString("Username") + " " + resultSet.getString("Password") + " " + resultSet.getString("BMI"));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }


}
