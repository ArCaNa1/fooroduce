package com.fooroduce.backend.Membership.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CheckUserIdResponse {
    private boolean isUsableId;
}
