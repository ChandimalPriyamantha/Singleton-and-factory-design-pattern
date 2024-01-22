import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.SQLException;

public class JDBCSingletonDemo {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        // Declare a JDBCSingleton object
        JDBCSingleton jdbcSingleton = JDBCSingleton.getInstance();

        // Use a BufferedReader for user input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        try{
            while (true){
                System.out.println("1. Insert Data");
                System.out.println("2. View Data");
                System.out.println("3. Update Data");
                System.out.println("4. Delete Data");
                System.out.println("5. Exit");
                System.out.println("Enter your choice: ");

                //Read user input
                int choice = Integer.parseInt(reader.readLine());

                // Implement case for each operation: insert, view, delete, update and exit
                switch (choice){
                    case 1:
                        System.out.println("Enter data to insert");
                        String dataToInsert = reader.readLine();
                        jdbcSingleton.insertData(dataToInsert);
                        break;
                    case 2:
                        jdbcSingleton.viewData();
                        break;
                    case 3:
                        System.out.println("Enter new data to update: ");
                        String newDataToUpdate = reader.readLine();
                        jdbcSingleton.updateData(newDataToUpdate);
                        break;
                    case  4:
                        jdbcSingleton.deleteData();
                        break;
                    case 5:
                        System.out.println("Exiting program.");
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. Please enter a valid option.");
                        break;
                }

            }

        }catch(NumberFormatException e){
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
