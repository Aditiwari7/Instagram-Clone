package com.my_insta.instagramclone.Service;

import com.my_insta.instagramclone.Entity.Post;
import com.my_insta.instagramclone.Repository.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PostServices {
    @Autowired
    PostRepo postRepo;

    @Autowired
    UsersServices usersServices;

    public Post submitPost(Post post){
        return postRepo.save(post);
    }

    public ArrayList<Post> getPostDetail(String userId){
        ArrayList<Post> posts = postRepo.findAllByUserId(userId);

        for (Post postItem : posts) {
            postItem.setUserName(usersServices.displayUserData(postItem.getUserId()).getUserName());
        }

        posts.sort((a, b) -> b.getId() - a.getId());
        return posts;
    }

    public void deletePost(String postId){
        Post currPost = postRepo.findBypostId(postId);
        postRepo.delete(currPost);
    }
}
