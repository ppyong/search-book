package com.skp.book.user.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.security.core.GrantedAuthority;

import javax.validation.constraints.NotNull;
import java.util.Collection;

public class User extends org.springframework.security.core.userdetails.User {
    //@Builder
    public User(String username, String password,
                Collection<? extends GrantedAuthority> authorities){
        super(username, password, authorities);
    }
}
