package com.fooroduce.backend.Membership.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class SignupResponse {

    private String user_id;
    private String email;
    private String role;

}
