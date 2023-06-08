package com.my_insta.instagramclone.Entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "status")
public class Status {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String statusId;
    private String userId;
    private String path;
    private String userName;
    private Timestamp postTime;

    public Status(){
        super();
    }

    public Status(String statusId, String userId, String path, Timestamp postTime){
        super();
        this.statusId = statusId;
        this.userId = userId;
        this.path = path;
        this.postTime = postTime;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getStatusId() {
        return statusId;
    }
    public void setStatusId(String statusId) {
        this.statusId = statusId;
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

    public String getPath() {
        return path;
    }
    public void setPath(String path) {
        this.path = path;
    }

    public Timestamp getPostTime() {
        return postTime;
    }
    public void setPostTime(Timestamp postTime) {
        this.postTime = postTime;
    }
}
