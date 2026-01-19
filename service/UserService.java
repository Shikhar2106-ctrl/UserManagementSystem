package service;

import dao.UserDAO;
import model.User;
import java.util.List;

public class UserService {

    private UserDAO userDAO = new UserDAO();

    public void addUser(User user) {
        userDAO.addUser(user);
        System.out.println("User saved to database.");
    }
    public void deleteUser(int id) {
        userDAO.deleteUser(id);
    }

    public void updateUser(int id, String name, String email) {
        userDAO.updateUser(id, name, email);
    }

    


    public void viewUsers() {
        List<User> users = userDAO.getAllUsers();
        users.forEach(System.out::println);
    }
}




// package service;

// import model.User;
// import java.util.ArrayList;
// import java.util.List;

// public class UserService {

//     private List<User> users = new ArrayList<>();

//     public void addUser(User user) {
//         users.add(user);
//         System.out.println("User added successfully.");
//     }

//     public void viewUsers() {
//         if (users.isEmpty()) {
//             System.out.println("No users found.");
//             return;
//         }
//         users.forEach(System.out::println);
//     }

//     public void updateUser(int id, String name, String email) {
//         for (User user : users) {
//             if (user.getId() == id) {
//                 user.setName(name);
//                 user.setEmail(email);
//                 System.out.println("User updated successfully.");
//                 return;
//             }
//         }
//         System.out.println("User not found.");
//     }

//     public void deleteUser(int id) {
//         users.removeIf(user -> user.getId() == id);
//         System.out.println("User deleted if existed.");
//     }
// }
