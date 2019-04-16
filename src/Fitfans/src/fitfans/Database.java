/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fitfans;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {

    public static Connection conn;

    public static void openConnection() {

        if (conn == null) {
            try {
                conn = DriverManager.getConnection("jdbc:sqlite:fitfans.db");
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void createUserTable() throws SQLException {
        openConnection();
        Statement st = conn.createStatement();

        String createStatement = "CREATE TABLE IF NOT EXISTS User "
                + "(USERNAME TEXT PRIMARY KEY,"
                + "EMAIL TEXT NOT NULL,"
                + "PASSWORD TEXT NOT NULL,"
                + "GENDER TEXT NOT NULL,"
                + "DOB TEXT NOT NULL"
                + ");";

        st.execute(createStatement);
    }

    public static void createFoodTable() throws SQLException {
        openConnection();
        Statement st = conn.createStatement();

        String createStatement = "CREATE TABLE IF NOT EXISTS Food "
                + "(USERNAME TEXT PRIMARY KEY,"
                + "DATE TEXT NOT NULL,"
                + "KILOJOULES INTEGER NOT NULL,"
                + "FOODGROUP TEXT NOT NULL"
                + ");";

        st.execute(createStatement);
    }

    public static void createGymTable() throws SQLException {
        openConnection();
        Statement st = conn.createStatement();

        String createStatement = "CREATE TABLE IF NOT EXISTS Gym "
                + "(USERNAME TEXT PRIMARY KEY,"
                + "ATTENDANCE TEXT NOT NULL,"
                + "DATE TEXT NOT NULL,"
                + "TIMESPENT INTEGER NOT NULL"
                + ");";

        st.execute(createStatement);
    }

    public static void createWeightTable() throws SQLException {
        openConnection();
        Statement st = conn.createStatement();

        String createStatement = "CREATE TABLE IF NOT EXISTS Weight "
                + "(USERNAME TEXT PRIMARY KEY,"
                + "WEIGHT INTEGER NOT NULL,"
                + "DATE TEXT NOT NULL,"
                + ");";
        
       String sqlCommand = "DROP TABLE IF EXIST 'fitfans.Weight'";
        System.out.println("dropped weights" + st.executeUpdate(sqlCommand));
        

        st.execute(createStatement);
        
        
    }

    public static void createGoalsTable() throws SQLException {
        openConnection();
        Statement st = conn.createStatement();

        String createStatement = "CREATE TABLE IF NOT EXISTS Goals "
                + "(USERNAME TEXT PRIMARY KEY,"
                + "KILOJOULESPERDAY TEXT NOT NULL,"
                + "WEIGHT TEXT NOT NULL,"
                + "GYMPERWEKK INTEGER NOT NULL"
                + ");";

        st.execute(createStatement);
    }

}
