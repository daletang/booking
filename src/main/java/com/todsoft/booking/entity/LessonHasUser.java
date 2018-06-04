/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.todsoft.booking.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

/**
 * @author TangD
 */
@Entity
@Table(name = "lesson_has_user")
//@NamedQueries({
//   @NamedQuery(name = "LessonHasUserRepository.findAll", query = "SELECT l FROM LessonHasUserRepository l")})
public class LessonHasUser implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LessonHasUserPK lessonHasUserPK;

    @Column(name = "content")
    private String content;

    @JoinColumn(name = "lesson_id", referencedColumnName = "lesson_id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Lesson lesson;

    @JoinColumn(name = "user_id", referencedColumnName = "user_id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private User user;

    public LessonHasUser() {
    }

    public LessonHasUser(LessonHasUserPK lessonHasUserPK) {
        this.lessonHasUserPK = lessonHasUserPK;
    }

    public LessonHasUser(int lessonId, int userId) {
        this.lessonHasUserPK = new LessonHasUserPK(lessonId, userId);
    }

    public LessonHasUserPK getLessonHasUserPK() {
        return lessonHasUserPK;
    }

    public void setLessonHasUserPK(LessonHasUserPK lessonHasUserPK) {
        this.lessonHasUserPK = lessonHasUserPK;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Lesson getLesson() {
        return lesson;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }

    public User getUsers() {
        return user;
    }

    public void setUsers(User users) {
        this.user = users;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lessonHasUserPK != null ? lessonHasUserPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LessonHasUser)) {
            return false;
        }
        LessonHasUser other = (LessonHasUser) object;
        return (this.lessonHasUserPK != null || other.lessonHasUserPK == null) && (this.lessonHasUserPK == null || this.lessonHasUserPK.equals(other.lessonHasUserPK));
    }

    @Override
    public String toString() {
        return "com.todsoft.booking.LessonHasUserRepository[ lessonHasUserPK=" + lessonHasUserPK + " ]";
    }

}
