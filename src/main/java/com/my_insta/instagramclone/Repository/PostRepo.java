package com.my_insta.instagramclone.Repository;

import com.my_insta.instagramclone.Entity.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface PostRepo extends CrudRepository<Post, Integer> {

    Post findBypostId(String postId);
    ArrayList<Post> findAllByUserId(String userId);
}
