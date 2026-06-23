package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.CUser;
import com.example.demo.entity.UserData;
import com.example.demo.respository.DataRespository;
import com.example.demo.respository.UserRespository;

@Service
public class UserService {

    UserRespository userRespository;
    DataRespository dataRespository;

    public UserService(UserRespository userRespository) {
        this.userRespository = userRespository;
    }

    public List<CUser> getUsers(){
        return userRespository.findAll();
    }

    public List<UserData> getAllUserData(){
        return dataRespository.findAll();
    }   

    public UserData getUserDataById(String id){
        return dataRespository.findById(id);
    }

    public void registerUser(String name, String username, String password, String email) {
        // Logic to register a new user
        // This could involve validating the input, creating a new User object,
        // and saving it to the database using the UserRespository.
        userRespository.save(new CUser(name,username, password, email));
    }

public boolean signInUser(String username, String password) {
        // Logic to sign in a user
        // This could involve validating the input, checking the credentials against the database,
        // and returning a response indicating success or failure.
        boolean exist = false;
        CUser user = userRespository.findByUsername(username);
        if (user != null && user.getPassword().equals(password)) {
            // Successful sign-in logic here
            exist = true;
        } else {
            return exist;
        }
        return exist;
    }

public boolean userExists(String username) {
    boolean exist = false;
    CUser user = userRespository.findByUsername(username);
    if (user != null) {
        exist = true;
    }
    return exist;
}

public void saveUserData(UserData userData) {
    dataRespository.save(userData);
}


}
