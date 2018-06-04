package com.todsoft.booking.repository;

import com.todsoft.booking.entity.LessonHasUser;
import com.todsoft.booking.entity.LessonHasUserPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LessonHasUserRepository extends JpaRepository<LessonHasUser, LessonHasUserPK> {
}
