// For connecting to a database we need the address of the database

package jdbcjava;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;

class Student{
    int id;
    String name;
    int age;
    String location;

    Student(int id, String name, int age, String location){
        this.id = id;
        this.name = name;        
        this.age = age;        
        this.location = location;        
    }

    public void displayDetails(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(age);
        System.out.println(location);
    }
}



public class StudentsDB {

    public static String insertion(int id, String name, int age, String location){
        String query = "INSERT INTO student(id, name, age, location) VALUES(" +id+",'"+name+"',"+age+",'"+location+"');";
        return query;
    }   

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/JavaTutorial";
        Connection conn = null;

        int id = 2;
        String name = "parag";
        int age = 21;
        String location = "Bengaluru";

        // String query = insertion(id, name, age, location);
        String query = "SELECT * FROM student;";
        System.out.println(query); 


        try{
            conn = DriverManager.getConnection(url, "postgres", "Parag@postgre");
            Statement stmt = conn.createStatement();

            // FOR INSERTION OF RECORDS =>
            // int result = stmt.executeUpdate(query);

            // if(result == 1)
            //     System.out.println("Insertion is done successfully!\nQuery:"+query);
            // else
            //     System.out.println("Insertion failed!");

            // FOR SELECT STATEMENT QUERY =>

            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                System.out.println(rs.getString(1));
                System.out.println(rs.getString(2));
                System.out.println(rs.getString(3));
                System.out.println(rs.getString(4));
                System.out.println();
            }


        }catch(Exception e){
            System.err.println(e);
        }finally{
            conn.close();
        }
        
    }
}
