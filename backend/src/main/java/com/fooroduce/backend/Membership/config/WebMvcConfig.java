package com.fooroduce.backend.Membership.config;

import com.fooroduce.backend.Membership.util.JwtAuthFilter;
import org.springframework.beans.factory.annotation.Autowired;

public class WebMvcConfig {
    @Autowired
    private JwtAuthFilter jwtAuthFilter;


}
