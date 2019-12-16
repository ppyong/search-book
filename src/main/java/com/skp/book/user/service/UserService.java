package com.skp.book.user.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.skp.book.common.error.exception.DuplicateUserIdException;
import com.skp.book.user.domain.UserEntity;
import com.skp.book.user.dto.User;
import com.skp.book.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {
    private final ObjectMapper objectMapper;
    private final UserRepository userRepository;

    /**
     * 회원 가입!
     * @param user
     */
    public void join(User user){
        log.info("::: Trying to login with user's id -> {} :::", user.getUserId());

        if(userRepository.findByUserId(user.getUserId()) == null){
            UserEntity userEntity = objectMapper.convertValue(user, UserEntity.class);
            userRepository.save(userEntity);
        }
        throw new DuplicateUserIdException(user.getUserId());
    }

    /**
     * 회원 탈퇴!
     * @param user
     */
    public void withdraw(User user){
        // TODO!!
    }
}
