package com.my_insta.instagramclone.Entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "comment")
public class Comments {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String commentId;
    private String userId;
    private String postId;
    private Timestamp postTime;
    private String comment;
    private String userName;

    public Comments(){
        super();
    }
    public Comments(String commentId, String userId, String postId, Timestamp postTime, String comment){
        super();
        this.commentId = commentId;
        this.userId = userId;
        this.postId = postId;
        this.postTime = postTime;
        this.comment = comment;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getCommentId() {
        return commentId;
    }
    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPostId() {
        return postId;
    }
    public void setPostId(String postId) {
        this.postId = postId;
    }

    public Timestamp getPostTime() {
        return postTime;
    }
    public void setPostTime(Timestamp postTime) {
        this.postTime = postTime;
    }

    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
}
