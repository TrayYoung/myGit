package com.jxd.comment.model;

/**
 * @ClassName Course_jxd
 * @Description TODO
 * @Author lxz
 * @Date 2020/10/28 0028
 * @Version 1.0
 */
public class CourseJxd {
    private int courseId;       //课程编号
    private String courseName;  //课程名称

    public CourseJxd() {
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
