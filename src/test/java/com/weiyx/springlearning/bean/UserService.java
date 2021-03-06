package com.weiyx.springlearning.bean;

public class UserService {

    private String uId;

    private UserDao userDao;

    public void queryUserInfo() {
        System.out.println("查询用户信息：" + userDao.queryUserName(uId));
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append(":").append(uId);
        return sb.toString();
    }

}
