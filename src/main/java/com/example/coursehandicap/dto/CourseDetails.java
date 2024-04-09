package com.example.coursehandicap.dto;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CourseDetails {

    @NotNull(message = "Must be not blank")
    @Min(value = 0, message = "Min value is 0")
    @Max(value = 54, message = "Max value is 54")
    private Double handicapIndex;

    @NotNull(message = "Must be not blank")
    @Min(value = 55, message = "Min value is 55")
    @Max(value = 155, message = "Max value is 155")
    private Integer slopeRating;

    @NotNull(message = "Must be not blank")
    @Min(value = 0,message = "Min value is 0")
    private Double courseRating;

    @NotNull(message = "Must be not blank")
    @Min(value = 0, message = "Min value is 0")
    private Integer par;

    @NotNull(message = "Choose holes count")
    private Boolean isNineHoles;
}
