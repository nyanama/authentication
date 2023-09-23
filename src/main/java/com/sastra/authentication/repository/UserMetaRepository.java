package com.sastra.authentication.repository;

import com.sastra.authentication.entity.UserMetaEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserMetaRepository extends CrudRepository<UserMetaEntity, String> {
    public UserMetaEntity findByUserId(int id);
}
