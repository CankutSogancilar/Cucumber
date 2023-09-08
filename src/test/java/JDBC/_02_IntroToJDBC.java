package JDBC;

import org.testng.annotations.Test;

import java.sql.*;

public class _02_IntroToJDBC {

    @Test
    public void test1() throws SQLException {
        String url= "jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com:3306/sakila";
        // url contains tyoe of connection (JDBC), type of database (mySQL), url to remote server that our database is
        // stored. port number of our database, name of the database.

        String username= "root";
        String password= "'\"-LhCB'.%k[4S]z"; //    ' "-LhCB'.%k[4S}z

        Connection connection= DriverManager.getConnection(url,username,password); // Creates a connection to the database

        Statement statement= connection.createStatement(); // Creates a Statement to run our queries

        ResultSet rs=statement.executeQuery("select * from actor"); // execute query and gets the entire result and
        // returns it in as a ResultSet object

        rs.next(); // moves onto first row
        String firstName= rs.getString(2); // gets the value from the second column. Index starts from 1 not 0.
        System.out.println("first name: "+ firstName);

        String lastName=rs.getString(3);
        System.out.println("last Name: "+lastName);

        rs.next(); // Moves to the next row
        String firstName1= rs.getString(2); // gets the value from the second column. Index starts from 1 not 0.
        System.out.println("first name: "+ firstName1);

        String lastName1=rs.getString(3);
        System.out.println("last Name: "+lastName1);


        connection.close(); // Dont forget to close the connection like apache poi
    }
}
