package com.todsoft.booking.repository;

import com.todsoft.booking.entity.Course;
import com.todsoft.booking.entity.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LessonRepository extends JpaRepository<Lesson, Integer> {
    List<Lesson> findByCourseId(Course courseId);
}
