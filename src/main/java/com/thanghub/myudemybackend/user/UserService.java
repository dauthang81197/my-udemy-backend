package com.thanghub.myudemybackend.user;

import org.springframework.stereotype.Service;

public interface UserService {

    User createUser(User user);

    User getUserById(Long id);

    User getUserByEmail(String email);
}