package com.my_insta.instagramclone.Repository;

import com.my_insta.instagramclone.Entity.Comments;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface CommentRepo extends CrudRepository<Comments, Integer> {

    ArrayList<Comments> findAllByPostId(String postId);
    Comments findByCommentId(String commentId);
}
