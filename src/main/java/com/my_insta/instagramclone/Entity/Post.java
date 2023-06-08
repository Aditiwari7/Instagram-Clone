package com.my_insta.instagramclone.Entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "post")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String postId;
    private String userId;
    private String userName;
    private String postPath;
    private Timestamp postTime;
    private int likeCount;

    public Post(){
        super();
    }

    public Post(String postId, String userId, String postPath, Timestamp
                postTime, int likeCount){
        super();
        this.postId = postId;
        this.userId = userId;
        this.postPath = postPath;
        this.postTime = postTime;
        this.likeCount = likeCount;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getPostId() {
        return postId;
    }
    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPostPath() {
        return postPath;
    }
    public void setPostPath(String postPath) {
        this.postPath = postPath;
    }

    public Timestamp getPostTime() {
        return postTime;
    }
    public void setPostTime(Timestamp postTime) {
        this.postTime = postTime;
    }

    public int getLikeCount() {
        return likeCount;
    }
    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }
}
