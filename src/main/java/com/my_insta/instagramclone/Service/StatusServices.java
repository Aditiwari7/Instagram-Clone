package com.my_insta.instagramclone.Service;

import com.my_insta.instagramclone.Entity.Status;
import com.my_insta.instagramclone.Repository.StatusRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class StatusServices {

    @Autowired
    StatusRepo statusRepo;

    @Autowired
    UsersServices usersServices;

    public Status submitStatusData(Status status){
        return statusRepo.save(status);
    }

    public ArrayList<Status> getStatusData(){
        ArrayList<Status> statusList = statusRepo.findAll();

        for (Status statusItem : statusList) {

            statusItem.setUserName(usersServices.displayUserData(statusItem.getUserId()).getUserName());
        }

        return statusList;
    }
}
