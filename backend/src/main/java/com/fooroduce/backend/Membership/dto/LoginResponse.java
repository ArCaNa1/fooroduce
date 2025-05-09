package com.fooroduce.backend.Membership.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class LoginResponse {

    private String user_id;
    private String token;
    private String role;

}
