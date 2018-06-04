package com.todsoft.booking.entity;


import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.util.Collection;

/**
 * @author TangD
 */
@Entity
@Table(name = "lesson")
//@NamedQueries({
// @NamedQuery(name = "Lesson.findAll", query = "SELECT l FROM Lesson l")})
public class Lesson implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "lesson_id")
    private Integer lessonId;

    @Basic(optional = false)
    @Column(name = "start_datetime")
    //@Temporal(TemporalType.TIMESTAMP)
    private Instant startDatetime;

    @Basic(optional = false)
    @Column(name = "period_hours")
    private int periodHours;

    @JoinColumn(name = "course_id", referencedColumnName = "course_id")
    @ManyToOne(optional = false)
    private Course courseId;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lesson")
    private Collection<LessonHasUser> lessonHasUserCollection;

    public Lesson() {
    }

    public Lesson(Integer lessonId) {
        this.lessonId = lessonId;
    }

    public Lesson(Integer lessonId, Instant startDatetime, int periodHours) {
        this.lessonId = lessonId;
        this.startDatetime = startDatetime;
        this.periodHours = periodHours;
    }

    public Integer getlessonId() {
        return lessonId;
    }

    public void setlessonId(Integer lessonId) {
        this.lessonId = lessonId;
    }

    public Instant getStartDatetime() {
        return startDatetime;
    }

    public void setStartDatetime(Instant startDatetime) {
        this.startDatetime = startDatetime;
    }

    public int getPeriodHours() {
        return periodHours;
    }

    public void setPeriodHours(int periodHours) {
        this.periodHours = periodHours;
    }

    public Course getCourseId() {
        return courseId;
    }

    public void setCourseId(Course courseId) {
        this.courseId = courseId;
    }

    public Collection<LessonHasUser> getLessonHasUserCollection() {
        return lessonHasUserCollection;
    }

    public void setLessonHasUserCollection(Collection<LessonHasUser> lessonHasUserCollection) {
        this.lessonHasUserCollection = lessonHasUserCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lessonId != null ? lessonId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lesson)) {
            return false;
        }
        Lesson other = (Lesson) object;
        return (this.lessonId != null || other.lessonId == null) && (this.lessonId == null || this.lessonId.equals(other.lessonId));
    }

    @Override
    public String toString() {
        return "com.todsoft.booking.Lesson[ lessonId=" + lessonId + " ]";
    }

}
