package com.todsoft.booking.controller;

import com.todsoft.booking.entity.Course;
import com.todsoft.booking.repository.CourseRepository;
import com.todsoft.booking.template.Greeting;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class CourseController {
    private final static Logger log = LoggerFactory.getLogger(CourseController.class);
    @Autowired
    CourseRepository courseRepository;

    @GetMapping("/course")
    public String showAllCourse(Model model) {
        List<Course> course = courseRepository.findAll();
        model.addAttribute("allCourses", course);

        model.addAttribute("newCourse",new Course());
        return "course";
    }

    @PostMapping("/course")
    public String addNewCourse(@ModelAttribute Course newCourse) {
        log.info(newCourse.toString());
        courseRepository.save(newCourse);
        return "redirect:course";
    }
}
