package com.todsoft.booking.controller;

import com.todsoft.booking.entity.Lesson;
import com.todsoft.booking.repository.LessonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestPart;

import java.util.List;

@Controller
public class LessonController {
    private final static Logger log = LoggerFactory.getLogger(LessonController.class);

    @Autowired
    LessonRepository lessonRepository;

    @GetMapping("/course/{courseId}/lessons")
    public String showAllLesson(@RequestPart Integer courseId, Model model){
        List<Lesson> lessons = lessonRepository.findAll();
        model.addAttribute("allLessons",lessons);
        return "lesson";
    }
}
