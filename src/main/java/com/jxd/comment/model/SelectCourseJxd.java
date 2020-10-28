package com.jxd.comment.model;

/**
 * @ClassName SelectCourseJxd
 * @Description TODO
 * @Author lxz
 * @Date 2020/10/28 0028
 * @Version 1.0
 */
public class SelectCourseJxd {
    private int selectId;   //课程评价编号
    private int courseId;   //课程编号
    private int empnoStu;   //学生编号
    private int empnoTch;   //老师编号
    private double score;   //分数

    public SelectCourseJxd() {
    }

    public int getSelectId() {
        return selectId;
    }

    public void setSelectId(int selectId) {
        this.selectId = selectId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getEmpnoStu() {
        return empnoStu;
    }

    public void setEmpnoStu(int empnoStu) {
        this.empnoStu = empnoStu;
    }

    public int getEmpnoTch() {
        return empnoTch;
    }

    public void setEmpnoTch(int empnoTch) {
        this.empnoTch = empnoTch;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
