package com.fooroduce.backend.Membership.Dto;

import lombok.Data;

@Data
public class KakaoProfile {

    private Long id;
    private KakaoAccount kakao_account;

    @Data
    public static class KakaoAccount {
        private String email;
    }
}
