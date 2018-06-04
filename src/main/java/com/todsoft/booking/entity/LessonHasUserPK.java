/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.todsoft.booking.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author TangD
 */
@Embeddable
public class LessonHasUserPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "lesson_id")
    private int lessonId;

    @Basic(optional = false)
    @Column(name = "user_id")
    private int userId;

    public LessonHasUserPK() {
    }

    public LessonHasUserPK(int lessonId, int userId) {
        this.lessonId = lessonId;
        this.userId = userId;
    }

    public int getLessonId() {
        return lessonId;
    }

    public void setLessonId(int lessonId) {
        this.lessonId = lessonId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += lessonId;
        hash += userId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LessonHasUserPK)) {
            return false;
        }
        LessonHasUserPK other = (LessonHasUserPK) object;
        if (this.lessonId != other.lessonId) {
            return false;
        }
        return this.userId == other.userId;
    }

    @Override
    public String toString() {
        return "com.todsoft.booking.LessonHasUserPK[ lessonId=" + lessonId + ", userId=" + userId + " ]";
    }

}
