package org.example;

public class UserService {
    public User getUserById(int id){
        if(id == 1){
            return new User(1, "Akash");  // valid user
        }
        return null;  // user not found
    }
}
