package com.jxd.comment.model;

/**
 * @ClassName CommandScore
 * @Description TODO
 * @Author lxz
 * @Date 2020/10/28 0028
 * @Version 1.0
 */
public class CommandScore {
    private int selectCmJxd;    //评价分数主键
    private int CommentId;      //评价id，外键
    private int empnoMgr;       //经理编号
    private int empnoEmp;       //员工编号
    private double CScore;      //评价分数
    private int year;           //评价年份

    public CommandScore() {
    }

    public int getSelectCmJxd() {
        return selectCmJxd;
    }

    public void setSelectCmJxd(int selectCmJxd) {
        this.selectCmJxd = selectCmJxd;
    }

    public int getCommentId() {
        return CommentId;
    }

    public void setCommentId(int commentId) {
        CommentId = commentId;
    }

    public int getEmpnoMgr() {
        return empnoMgr;
    }

    public void setEmpnoMgr(int empnoMgr) {
        this.empnoMgr = empnoMgr;
    }

    public int getEmpnoEmp() {
        return empnoEmp;
    }

    public void setEmpnoEmp(int empnoEmp) {
        this.empnoEmp = empnoEmp;
    }

    public double getCScore() {
        return CScore;
    }

    public void setCScore(double CScore) {
        this.CScore = CScore;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
