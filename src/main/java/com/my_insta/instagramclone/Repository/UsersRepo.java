package com.my_insta.instagramclone.Repository;

import com.my_insta.instagramclone.Entity.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepo extends CrudRepository<Users, Integer> {

    Users save(Users user);
    Users findByUserId(String userId);
}
