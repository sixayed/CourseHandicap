package com.example.coursehandicap.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class FieldError {

    @NotNull
    private final String field;

    @NotNull
    private final String message;
}
