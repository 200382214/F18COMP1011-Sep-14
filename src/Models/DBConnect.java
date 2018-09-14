package Models;

import java.sql.*;
import java.util.ArrayList;

public class DBConnect {
    private static String user="root";
    private static String password ="";

    public static ArrayList<String> getPhoneManufacturers() throws SQLException {
        ArrayList<String> manufacturere = new ArrayList<>();
        Connection conn = null;
        Statement statement = null;
        ResultSet resultSet = null;

            try{
                //1. Connect to database
                conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/phones?useSSL=false",user,password);

                //2. v=create a Statement
                statement = conn.createStatement();
                //3. create a Sql Query
                resultSet = statement.executeQuery("Select * From manufacturers");
                //4. loop over the results and add it to the ArrayList
                while(resultSet.next())
                {
                    manufacturere.add(resultSet.getString("manufacturers"));

                }

            }
            catch(SQLException e)
            {
                System.err.println(e);
            }
            finally {
            if(conn != null)
                conn.close();
            if(statement != null)
             statement.close();
             if(resultSet!= null)
             resultSet.close();
            }

        return manufacturere;
    }


}
