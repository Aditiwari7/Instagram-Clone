package com.my_insta.instagramclone.Service;

import com.my_insta.instagramclone.Entity.Comments;
import com.my_insta.instagramclone.Repository.CommentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CommentServices {

    @Autowired
    CommentRepo commentRepo;

    @Autowired
    UsersServices usersServices;

    public Comments submitCommentOnDB(Comments comment){
        return commentRepo.save(comment);
    }

    public ArrayList<Comments> getAllComments(String postId){

        ArrayList<Comments> commentList = commentRepo.findAllByPostId(postId);

        for (Comments commentItem : commentList) {
            commentItem.setUserName(usersServices.displayUserData(commentItem.getUserId()).getUserName());
        }

        return commentList;
    }

    public void deleteComment(String commentId){
        Comments comment = commentRepo.findByCommentId(commentId);
    }

}
