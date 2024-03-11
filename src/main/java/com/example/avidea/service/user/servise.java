package com.example.avidea.service.user;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.User;

@Service
@Slf4j
@RequiredArgsConstructor

public class Userservise {
    private final UserRepository userRepository;

    @Override
    public boolean createUser(User user) {
        if(userRepository.findByEmail(user.getEmail(email))!= null) return false;
        user.setActive (true);
        user.getRoles().add(Role.ROLE_USER);
        log.info("Saving new User with email : {}", email);
        return true;
    }
}
