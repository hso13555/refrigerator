package com.example.demo.util;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Code {

    FAILED_MESSAGE(1000, "Exception 없음"),
    UNKNOWN_ERROR(1003, "토큰이 존재하지 않습니다."),
    WRONG_TYPE_TOKEN(1004, "변조된 토큰입니다."),
    EXPIRED_TOKEN(1005, "만료된 토큰입니다."),
    UNSUPPORTED_TOKEN(1006, "변조된 토큰입니다."),
    ACCESS_DENIED(1007, "권한이 없습니다."),
    WRONG_TYPE_SIGNATURE(1008, "잘못된 JWT 서명입니다.");

    private int code;
    private String message;


}