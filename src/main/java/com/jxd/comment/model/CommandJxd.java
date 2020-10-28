package com.jxd.comment.model;

/**
 * @ClassName CommandJxd
 * @Description TODO
 * @Author lxz
 * @Date 2020/10/28 0028
 * @Version 1.0
 */
public class CommandJxd {
    private int commentId;      //评价编号
    private String commentName; //评价名称

    public CommandJxd() {
    }

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public String getCommentName() {
        return commentName;
    }

    public void setCommentName(String commentName) {
        this.commentName = commentName;
    }
}
