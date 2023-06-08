package com.my_insta.instagramclone.Controller;

import com.my_insta.instagramclone.Entity.Post;
import com.my_insta.instagramclone.Service.PostServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin
@RestController
@RequestMapping("/post")
public class PostController {

    @Autowired
    PostServices postServices;

    @PostMapping("")
    private Post submitUserPost(@RequestBody Post post){
        return postServices.submitPost(post);
    }

    @GetMapping("")
    private ArrayList<Post> getAllPost(String userId){
        return postServices.getPostDetail(userId);
    }

    @DeleteMapping("/{postid}")
    private ResponseEntity<Void> deletePost(@PathVariable("userid") String userId){
        postServices.deletePost(userId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
