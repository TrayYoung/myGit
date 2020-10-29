package com.jxd.comment.model;

/**
 * @ClassName Class
 * @Description TODO
 * @Author lxz
 * @Date 2020/10/28 0028
 * @Version 1.0
 */
public class ClassJxd {
    private int cNo;        //班级编号
    private String cname;   //班级名称
    private int empno;      //老师员工号

    public ClassJxd() {
    }

    public int getcNo() {
        return cNo;
    }

    public void setcNo(int cNo) {
        this.cNo = cNo;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }
}
