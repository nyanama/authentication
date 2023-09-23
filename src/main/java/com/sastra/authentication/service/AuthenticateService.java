package com.sastra.authentication.service;

import com.sastra.authentication.entity.UserEntity;
import com.sastra.authentication.entity.UserMetaEntity;
import com.sastra.authentication.model.SuccessResponse;
import com.sastra.authentication.repository.UserMetaRepository;
import com.sastra.authentication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.naming.AuthenticationException;

@Service
public class AuthenticateService {
    @Autowired
    UserMetaRepository userMetaRepository;

    @Autowired
    UserRepository userRepository;

    public SuccessResponse authenticate(String uname, String pwd) throws Exception{
        SuccessResponse response = new SuccessResponse();
        UserEntity userEntity = userRepository.findByUser(uname);
        if(userEntity != null && userEntity.getUser_pass().equalsIgnoreCase(pwd)){
            UserMetaEntity userMetaEntity = userMetaRepository.findByUserId(userEntity.getId());
            response.setValue(userMetaEntity.getMeta_value());
            response.setKey(userMetaEntity.getMeta_key());
        }else{
            throw new AuthenticationException("User name / password wrong");
        }
        return response;
    }
}
