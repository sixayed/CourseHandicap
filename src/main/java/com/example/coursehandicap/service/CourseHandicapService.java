package com.example.coursehandicap.service;

import com.example.coursehandicap.dto.CourseDetails;
import lombok.NonNull;
import org.springframework.stereotype.Service;

@Service
public class CourseHandicapService {
    public long calculateHandicap(@NonNull CourseDetails courseDetails) {
        double handicapIndex;
        if(courseDetails.getIsNineHoles()) {
             handicapIndex = courseDetails.getHandicapIndex();
        } else {
            handicapIndex = courseDetails.getHandicapIndex() / 2.0;
        }

        return Math.round(handicapIndex * ((double) courseDetails.getSlopeRating() / 113)
                + (courseDetails.getCourseRating() - courseDetails.getPar()));
    }
}
