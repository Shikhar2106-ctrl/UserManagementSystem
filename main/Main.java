package main;

import model.User;
import service.UserService;
import util.InputUtil;

public class Main {

    public static void main(String[] args) {
        UserService service = new UserService();

        while (true) {
            System.out.println("\n1. Add User");
            System.out.println("2. View Users");
            System.out.println("3. Update User");
            System.out.println("4. Delete User");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = InputUtil.scanner.nextInt();
            InputUtil.scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = InputUtil.scanner.nextInt();
                    InputUtil.scanner.nextLine();

                    System.out.print("Enter Name: ");
                    String name = InputUtil.scanner.nextLine();

                    System.out.print("Enter Email: ");
                    String email = InputUtil.scanner.nextLine();

                    service.addUser(new User(id, name, email));
                    break;

                case 2:
                    service.viewUsers();
                    break;

                case 3:
                    int uid = InputUtil.getIntInput("Enter User ID to update: ");
                    System.out.print("Enter New Name: ");
                    String newName = InputUtil.scanner.nextLine();
                    System.out.print("Enter New Email: ");
                    String newEmail = InputUtil.scanner.nextLine();
                    service.updateUser(uid, newName, newEmail);
                    break;


                case 4:
                    int did = InputUtil.getIntInput("Enter User ID to delete: ");
                    service.deleteUser(did);
                    break;


                case 5:
                    System.out.println("Exiting application.");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}

