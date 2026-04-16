package com.thanghub.myudemybackend.user;

import com.thanghub.myudemybackend.user.request.LoginRequestDto;
import com.thanghub.myudemybackend.user.request.RegisterRequestDto;
import com.thanghub.myudemybackend.user.response.AuthResponseDto;
import com.thanghub.myudemybackend.user.response.RegisterResponseDto;
import org.apache.coyote.BadRequestException;
import org.springframework.stereotype.Service;

public interface UserService {
    AuthResponseDto login(LoginRequestDto loginRequest);

    RegisterResponseDto register(RegisterRequestDto registerRequestDto) throws BadRequestException;

    User createUser(User user);

    User getUserById(Long id);

    User getUserByEmail(String email);

}