import java.sql.*;

public class AccessDB {
    Connection dbConnection;

    public void connectToDB(String path) {
        try {
            dbConnection = DriverManager.getConnection("jdbc:ucanaccess://" + path + ";openExclusive=true;ignoreCase=true");
            Statement st = dbConnection.createStatement();
            st.executeQuery("CREATE TABLE IF NOT EXISTS Products (\n" +
                    "product_id int PRIMARY KEY,\n" +
                    "owner_id int,\n" +
                    "price int,\n" +
                    "cancellation_policy varchar(30),\n" +
                    "category varchar(255),\n" +
                    "address varchar(255) \n" +
                    ");");

            st.executeQuery("CREATE TABLE IF NOT EXISTS Users (\n" +
                    "User_id int PRIMARY KEY,\n" +
                    "name varchar(255),\n" +
                    "email varchar(255),\n" +
                    "cancellation_policy varchar(30),\n" +
                    "category varchar(255),\n" +
                    "address varchar(255) \n" +
                    ");");
            dbConnection.commit();
            System.out.println("hello");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }


}

