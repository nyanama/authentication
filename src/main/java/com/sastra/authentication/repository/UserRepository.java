package com.sastra.authentication.repository;

import com.sastra.authentication.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Integer> {
    UserEntity findByUser(String userLogin);
}
