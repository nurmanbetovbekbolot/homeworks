package com.company;

import java.util.Date;

public class UserLogs {
    private int id;
    private String userName;
    private Date loginTime;
    private Success success;

    public UserLogs(String userName, Date loginTime, Success success) {
        this.userName = userName;
        this.loginTime = loginTime;
        this.success = success;
    }

    public UserLogs() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public Success getSuccess() {
        return success;
    }

    public void setSuccess(Success success) {
        this.success = success;
    }

    @Override
    public String toString() {
        return "UserLogs{" +
                "id=" + id +
                ", userName=" + userName +
                ", loginTime=" + loginTime +
                ", success=" + success +
                '}';
    }
}
