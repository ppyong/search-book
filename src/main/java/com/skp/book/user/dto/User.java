package com.skp.book.user.dto;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@Builder
public class User {
    @NotNull
    private String userId;

    @NotNull
    private String password;
}
