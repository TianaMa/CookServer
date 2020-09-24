package com.demo.cook.common.response;


public enum Rtn {

    //common Rtn
    serviceException(-2,"server error"),
    missingParameter(-3,"缺少必要的参数"),


    success(0,"success"),

    //business Rtn

    userAlreadyExists(1001,"该用户名已经存在"),
    registerFail(1002,"注册失败"),

    userOrPasswordError(1011,"用户名不存在或密码错误"),

    editUserInfoError(1021,"修改用户信息失败"),
    noData(0001,"暂无信息"),

    cannotSubscribe(1031,"cannotSubscribe"),

            ;




    
    private int code;

    private String msg;

    Rtn(int code,String msg){
        this.code=code;
        this.msg=msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
