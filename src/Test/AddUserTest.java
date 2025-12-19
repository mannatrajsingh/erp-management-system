package Test;
import authen.*;



import java.util.Scanner;

public class AddUserTest {
    public static void main(String[] args) {
        SetSession.startSession(1, "admin", "ADMIN");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter new username: ");
        String username = sc.nextLine();

        System.out.print("Enter role (STUDENT / INSTRUCTOR): ");
        String role = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        int user_id = AddUser.addNewUser(username, password, role);

        System.out.println(user_id);

        SetSession.endSession();
        sc.close();
    }
}

