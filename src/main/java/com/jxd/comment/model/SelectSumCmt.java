package com.jxd.comment.model;

/**
 * @ClassName SelectSumCmt
 * @Description TODO
 * @Author lxz
 * @Date 2020/10/28 0028
 * @Version 1.0
 */
public class SelectSumCmt {
    private int selectSumCmtId; //总评价id
    private int sum_commentId;  //评价id
    private int empnoMORT;      //评价人（老师/经理）
    private int empnoEmp;       //被评价人编号
    private double contentText; //整体评价分数(二者选一）
    private String contentScore;//文本评价(二者选一）
    private String contentType; //school/regular/regular1-3(五种类型）

    public SelectSumCmt() {
    }

    public int getSelectSumCmtId() {
        return selectSumCmtId;
    }

    public void setSelectSumCmtId(int selectSumCmtId) {
        this.selectSumCmtId = selectSumCmtId;
    }

    public int getSum_commentId() {
        return sum_commentId;
    }

    public void setSum_commentId(int sum_commentId) {
        this.sum_commentId = sum_commentId;
    }

    public int getEmpnoMORT() {
        return empnoMORT;
    }

    public void setEmpnoMORT(int empnoMORT) {
        this.empnoMORT = empnoMORT;
    }

    public int getEmpnoEmp() {
        return empnoEmp;
    }

    public void setEmpnoEmp(int empnoEmp) {
        this.empnoEmp = empnoEmp;
    }

    public double getContentText() {
        return contentText;
    }

    public void setContentText(double contentText) {
        this.contentText = contentText;
    }

    public String getContentScore() {
        return contentScore;
    }

    public void setContentScore(String contentScore) {
        this.contentScore = contentScore;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }
}
