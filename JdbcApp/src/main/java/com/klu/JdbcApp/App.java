package com.klu.JdbcApp;

import java.sql.*;

public class App 
{
    public static void main(String[] args) 
    {
        String url = "jdbc:mysql://localhost:3306/students_db";
        String username = "root";
        String password = "Vamshi@130";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, username, password);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from klu_student");
            while (rs.next()) {
                System.out.println("Student ID: " + rs.getInt(1));
                System.out.println("Student Name: " + rs.getString(2));
            }

            con.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
