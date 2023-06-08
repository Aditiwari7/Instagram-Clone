package com.my_insta.instagramclone.Controller;

import com.my_insta.instagramclone.Entity.Status;
import com.my_insta.instagramclone.Service.StatusServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin
@RestController
@RequestMapping("/status")
public class StatusController {
    @Autowired
    StatusServices statusServices;

    @PostMapping("")
    private Status submitStatus(@RequestBody Status status){
        return statusServices.submitStatusData(status);
    }

    @GetMapping("")
    private ArrayList<Status> getAllStatus(){
        return statusServices.getStatusData();
    }
}
