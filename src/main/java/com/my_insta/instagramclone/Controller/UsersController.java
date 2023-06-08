package com.my_insta.instagramclone.Controller;

import com.my_insta.instagramclone.Entity.Users;
import com.my_insta.instagramclone.Service.UsersServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    UsersServices usersServices;

    @PostMapping("")
    private Users submitUserProfile(@RequestBody Users users){
        return usersServices.submitUserData(users);
    }

    @GetMapping("/{userid}")
    private Users getUserData(@PathVariable("userid") String userId){
        return usersServices.displayUserData(userId);
    }

    @PutMapping("/{userid}")
    private Users editUser(@PathVariable("userid") String userId){
        return usersServices.editUserData(userId);
    }

    @DeleteMapping("/{userid}")
    private ResponseEntity<Void> deleteUserProfile(@PathVariable("userid") String userId){
        usersServices.deleteUserfromDB(userId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
