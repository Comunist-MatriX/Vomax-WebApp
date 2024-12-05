package com.vomax.vomax.UserDto;

import java.util.Date;

public record userDto(
        Long id,
        String firstName,
        String LastName,
        String email,
        String username,
        String password,
        String profilePic,
        String description,
        Date dateOfbirth,
        String githupUrl,
        Date dateOfsignup
) {
}
