package com.jxd.comment.model;

/**
 * @ClassName SumComment
 * @Description TODO
 * @Author lxz
 * @Date 2020/10/28 0028
 * @Version 1.0
 */
public class SumComment {
    private int sumCommentId;       //总评id
    private String sumCommentName;  //总评名称

    public SumComment() {
    }

    public int getSumCommentId() {
        return sumCommentId;
    }

    public void setSumCommentId(int sumCommentId) {
        this.sumCommentId = sumCommentId;
    }

    public String getSumCommentName() {
        return sumCommentName;
    }

    public void setSumCommentName(String sumCommentName) {
        this.sumCommentName = sumCommentName;
    }
}
