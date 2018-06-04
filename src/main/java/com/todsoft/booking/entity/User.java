package com.todsoft.booking.entity;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

/**
 * @author TangD
 */
@Entity
@Table(name = "user")
//@NamedQueries({
//        @NamedQuery(name = "User.findAll", query = "SELECT u FROM Users u")})
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "user_id")
    private Integer userId;

    @Basic(optional = false)
    @Column(name = "open_id")
    private String openId;

    @Basic(optional = false)
    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_type")
    private String userType;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private Collection<LessonHasUser> lessonHasUserCollection;

    public User() {
    }

    public User(Integer userId) {
        this.userId = userId;
    }

    public User(Integer userId, String openId, String userName) {
        this.userId = userId;
        this.openId = openId;
        this.userName = userName;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
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
        hash += (userId != null ? userId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof User)) {
            return false;
        }
        User other = (User) object;
        return (this.userId != null || other.userId == null) && (this.userId == null || this.userId.equals(other.userId));
    }

    @Override
    public String toString() {
        return "com.todsoft.booking.User[ userId=" + userId + " ]";
    }

}