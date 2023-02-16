import org.testng.annotations.Test;

import java.sql.*;

public class pgAdmin {

    @Test
    public static void getDBValues() throws ClassNotFoundException, SQLException {


        String url = "jdbc:postgresql://room-reservation-qa.cxvqfpt4mc2y.us-east-1.rds.amazonaws.com:5432/hr";
        String username = "hr";
        String password = "hr";

        Connection connection = DriverManager.getConnection(url,username,password);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from signup.registration");
        while (resultSet.next()) {
            System.out.println(resultSet.getString("firstname"));
        }


        resultSet.close();
        statement.close();
        connection.close();




    }
}
