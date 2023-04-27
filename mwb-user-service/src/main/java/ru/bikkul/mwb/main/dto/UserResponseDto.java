package ru.bikkul.mwb.main.dto;

import java.time.LocalDateTime;

public record UserResponseDto(Long id, String firstName, String secondName, String login, String email, LocalDateTime birthday) {
}
