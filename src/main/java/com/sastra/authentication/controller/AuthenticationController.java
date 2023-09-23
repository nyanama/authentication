package com.sastra.authentication.controller;

import com.sastra.authentication.model.SuccessResponse;
import com.sastra.authentication.service.AuthenticateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Base64;

@RestController
public class AuthenticationController {

    @Autowired
    AuthenticateService authenticateService;

    @PostMapping( path = "/authenticate" )
    public ResponseEntity<SuccessResponse> authenticate(@RequestHeader(name = "Authorization", required = true) String authHeader) throws Exception {
        String[] userNameAndPswd = getUserNameAndPswd(authHeader);
        return ResponseEntity.ok(authenticateService.authenticate(userNameAndPswd[0],userNameAndPswd[1]));
    }

    private String[] getUserNameAndPswd(String authHeader){
        String userNameAndPswd = new String(Base64.getDecoder().decode(authHeader.split(" ")[1]));
        return userNameAndPswd.split(":");
    }
}
