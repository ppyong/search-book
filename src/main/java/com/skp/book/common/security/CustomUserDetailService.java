package com.skp.book.common.security;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.skp.book.user.domain.UserEntity;
import com.skp.book.user.dto.User;
import com.skp.book.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class CustomUserDetailService implements UserDetailsService {
    private final UserRepository userRepository;
    private final ObjectMapper objectMapper;

    @Override
    public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {
        Optional<UserEntity> optUserEntity = userRepository.findByUserId(userId);
        UserEntity userEntity = optUserEntity.orElseThrow(() -> new UsernameNotFoundException(userId));
        User user = objectMapper.convertValue(userEntity, User.class);
        return null;
    }
}
