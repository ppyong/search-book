package com.skp.book.user.domain;

import lombok.Getter;

import javax.persistence.Entity;

@Getter
@Entity
public class UserEntity {
    private String userId;
    private String password;
}
