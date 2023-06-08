package com.my_insta.instagramclone.Service;

import com.my_insta.instagramclone.Entity.Users;
import com.my_insta.instagramclone.Repository.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServices {

    @Autowired
    UsersRepo userRepo;

    public Users submitUserData(Users user){
        return userRepo.save(user);
    }

    public Users displayUserData(String userId){
        return userRepo.findByUserId(userId);
    }

    public Users editUserData(String userId){
        Users user = userRepo.findByUserId(userId);
        return userRepo.save(user);
    }

    public void deleteUserfromDB(String userId){
        Users user = userRepo.findByUserId(userId);
        userRepo.delete(user);
    }
}
