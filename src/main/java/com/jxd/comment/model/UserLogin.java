package com.jxd.comment.model;

/**
 * @ClassName UserLogin
 * @Description TODO
 * @Author lxz
 * @Date 2020/10/28 0028
 * @Version 1.0
 */
public class UserLogin {
    private int userId;         //用户id
    private String userName;    //用户名称
    private String password;    //用户密码
    private int role;           //用户权限1-学生，2-老师，3-员工，4-经理，0-admin

    public UserLogin() {
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }
}
