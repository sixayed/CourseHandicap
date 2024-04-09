package com.example.coursehandicap.controller;

import com.example.coursehandicap.dto.CourseDetails;
import com.example.coursehandicap.dto.FieldError;
import com.example.coursehandicap.service.CourseHandicapService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.validation.BindingResult;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
public class CalculationRestController {

    private final CourseHandicapService courseHandicapService;

    @PostMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> calculateHandicap(@Valid @RequestBody CourseDetails courseDetails,
                                                     BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            List<FieldError> errors = bindingResult.getFieldErrors().stream()
                    .map(error -> new FieldError(error.getField(), error.getDefaultMessage()))
                    .toList();

            return ResponseEntity.badRequest().body(errors);
        }
        return ResponseEntity.ok(Double.toString(courseHandicapService.calculateHandicap(courseDetails)));
    }
}
