package lk.kochasoft.studentcare.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {


    private static DbConnection dbConnection;

    private Connection connection;


    private DbConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");

       connection =  DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/student-management" +
               "?useSSL=false","root","root");
    }


    public static DbConnection getInstance() throws SQLException, ClassNotFoundException {

        if(dbConnection == null) {
            dbConnection = new DbConnection();
        }

        return dbConnection;
    }

    public Connection getConnection() {
        return connection;
    }

}
