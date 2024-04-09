package com.example.coursehandicap.controller;

import com.example.coursehandicap.dto.CourseDetails;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Slf4j
@Controller
@RequiredArgsConstructor
public class CourseHandicapController {

    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("courseDetails", new CourseDetails());
        return "courseHandicapForm";
    }
}
