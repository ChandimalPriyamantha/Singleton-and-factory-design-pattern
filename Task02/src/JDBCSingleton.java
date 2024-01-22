import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCSingleton {

    private static JDBCSingleton instance;
    private Connection connection = null;

    private static String url = "jdbc:mysql://localhost:3306/jobs";

    private static  String user = "root";

    private static String pw = "1234";

    private JDBCSingleton() {

    }


    // public method to get the singleton instance
    public static JDBCSingleton getInstance() throws SQLException, ClassNotFoundException {
        if(instance == null){
            instance = new JDBCSingleton();
        }
        return instance;
    }

    // private method to get the database connection
    private Connection getConnection() throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection contact = DriverManager.getConnection(url,user,pw);
        System.out.println("Connection is successfully..!");

        return connection;



    }

    public void insertData(String dataToInsert){


    }

    public void viewData() throws SQLException, ClassNotFoundException {
        connection = getConnection();
        System.out.println("Data is viewed..");

    }

    public void updateData(String newData){

    }

    public void deleteData(){

    }
}
