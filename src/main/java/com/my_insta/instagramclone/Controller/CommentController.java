package com.my_insta.instagramclone.Controller;

import com.my_insta.instagramclone.Entity.Comments;
import com.my_insta.instagramclone.Service.CommentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin
@RestController
@RequestMapping("/comment")
public class CommentController {

    @Autowired
    CommentServices commentServices;

    @PostMapping("")
    private Comments submitComment(@RequestBody Comments comments){
        return commentServices.submitCommentOnDB(comments);
    }

    @GetMapping("/{postid}")
    private ArrayList<Comments> getCommentsForPost(@PathVariable("postid") String postId){
        return commentServices.getAllComments(postId);
    }
}
