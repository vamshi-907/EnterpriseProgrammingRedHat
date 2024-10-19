package com.klu.JdbcApp;

import java.sql.*;

public class app1 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/students_db";
        String username = "root";
        String password = "Vamshi@130";

//        // Insert query
        try {
            Connection con = DriverManager.getConnection(url, username, password);
            String query = "INSERT INTO klu_student (sid, sname) VALUES (?, ?)";
            PreparedStatement pstmt = con.prepareStatement(query);

            pstmt.setInt(1, 79800);
            pstmt.setString(2, "raja");

            int rowsAffected = pstmt.executeUpdate();

            System.out.println("Rows affected: " + rowsAffected);

            pstmt.close();

            // Display query
            String displayQuery = "SELECT * FROM klu_student";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(displayQuery);

            System.out.println("Student ID\tStudent Name");
            while (rs.next()) {
                int sid = rs.getInt("sid");
                String sname = rs.getString("sname");
                System.out.println(sid + "\t\t" + sname);
            }

            rs.close();
            stmt.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }

     // Update query
        try {
            Connection con = DriverManager.getConnection(url, username, password);
            String updatequery = "UPDATE klu_student SET sid = ? WHERE sname = ?";
            PreparedStatement pstmtupdate = con.prepareStatement(updatequery);

            pstmtupdate.setInt(1, 30730); 
            pstmtupdate.setString(2, "saikrishna"); 

            int updaterowsAffected = pstmtupdate.executeUpdate();

            System.out.println("Rows affected by update: " + updaterowsAffected);

            pstmtupdate.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }

        
//        
//        //delete query
//        try {
//            Connection con = DriverManager.getConnection(url, username, password);
//
//            String deleteQuery = "DELETE FROM klu_student WHERE sid = ?";
//            PreparedStatement pstmtDelete = con.prepareStatement(deleteQuery);
//
//            pstmtDelete.setInt(1, 200); 
//
//            int deleteRowsAffected = pstmtDelete.executeUpdate();
//            System.out.println("Rows affected by delete: " + deleteRowsAffected);
//
//            pstmtDelete.close();
//            con.close();
//        } catch (SQLException e) {
//            System.out.println("Error: " + e.getMessage());
//        }
      }
}
