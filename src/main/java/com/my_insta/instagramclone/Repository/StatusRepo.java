package com.my_insta.instagramclone.Repository;

import com.my_insta.instagramclone.Entity.Status;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface StatusRepo extends CrudRepository<Status, Integer> {

    Status save(Status state);
    ArrayList<Status> findAll();
}
