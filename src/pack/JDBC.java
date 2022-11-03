package pack;
import java.sql.*;

public class JDBC {

    public static void main(String args[]) throws Exception {

        JDBC obj = new JDBC();
        obj.create_Bank_Emp_Table();

    }



    public void create_Bank_Emp_Table(){


        try{
           // Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306","root","Manasa@9008");

            if (con!=null) {
                System.out.println("Connection success");
            }
            //here sonoo is database name, root is username and password

            Statement stmt=con.createStatement();

            // Select/Use The Data Base

            stmt.execute("use BankApplication;");

            // Create a Table inside the Database ...



            // Insert Data into the Table ......


            stmt.execute("create table BankEmp" +
                    "(" +
                    "EmpId int not null," +
                    "Mobile double," +
                    "FName varchar(50)," +
                    "LName varchar(50)," +
                    "Email varchar(50)," +
                    "State varchar(2)," +
                    "Doj date," +
                    "Vehicle varchar(200)" +
                    ");");


            System.out.println("Table Creation is Successfull ....");



            con.close();
        }catch(Exception e){ e.printStackTrace();}







    }








}

