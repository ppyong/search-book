package com.skp.book.common.error.exception;

import lombok.Getter;

@Getter
public class DuplicateUserIdException extends RuntimeException {
    private String userId;

    public DuplicateUserIdException(String userId){
        this.userId = userId;
    }
}
