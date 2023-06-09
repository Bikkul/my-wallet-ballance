package ru.bikkul.mwb.main.dto;

import java.time.LocalDateTime;

public record NewUserDto(String firstName, String secondName, String login, String email, String password,
                         String confirmPassword, LocalDateTime birthday) {
}
