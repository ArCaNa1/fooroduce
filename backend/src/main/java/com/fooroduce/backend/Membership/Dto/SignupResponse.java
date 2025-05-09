package com.fooroduce.backend.Membership.Dto;



import lombok.AllArgsConstructor;
import lombok.Getter;
import com.fooroduce.backend.entity.User.Role;

@Getter
@AllArgsConstructor
public class SignupResponse {

    private String user_id;
    private String email;
    private String role;



}
