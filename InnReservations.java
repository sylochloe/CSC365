import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.util.Map;
import java.util.Scanner;
import java.util.LinkedHashMap;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class InnReservations {
    public static void main() {
        try {
            InnReservations re = new InnReservations();
            Scanner num = new Scanner(System.in)
            printMenu();
            int choice = num.nextInt();
            switch (choice) {
                case 1: re.roomAndRate(); break;
                case 2: re.reservations(); break;
                case 3: re.changeReservations(); break;
                case 4: re.cancellReservations(); break;
                case 5: re.reservationsInfo(); break;
                case 6: re.revenue(); break;
                // quit the program
                case 7: break;
            }
        } catch (SQLException e) {
            System.err.println("SQLException: " + e.getMessage());
        } catch (Exception e2) {
            System.err.println("Exception: " + e2.getMessage());
        }
    }
    private static void printMenu(){
        System.out.println("\nMain Menu");
        System.out.println("1. Check Rooms and Rates");
        System.out.println("2. Make Resrvations");
        System.out.println("3. Modify Existing Resrvations");
        System.out.println("4. Cancel Resrvation");
        System.out.println("5. Get Resrvation Information");
        System.out.println("6. Check Revenue");
        System.out.println("7. Quit\n");
        System.out.println("\n Please enter the number of your choice\n");
    }

}