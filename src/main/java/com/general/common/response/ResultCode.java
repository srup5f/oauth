package com.general.common.response;



public enum ResultCode {

    /* 成功状态码 */
    SUCCESS(0,"操作成功！"),

    /* 错误状态码 */
    FAIL(-1,"操作失败！"),
    PARAM_IS_INVALID(10001, "参数无效"),
    USER_NOT_LOGGED_IN(20001, "请先登录"),
    SYSTEM_INNER_ERROR(40001, "系统繁忙，请稍后重试"),
    PERMISSION_TOKEN_EXPIRED(70004, "token已过期"),
    PERMISSION_TOKEN_INVALID(70006, "无效token"),
    PERMISSION_SIGNATURE_ERROR(70007, "签名失败");

    //操作代码
    int code;
    //提示信息
    String message;
    ResultCode(int code, String message){
        this.code = code;
        this.message = message;
    }

    public int code() {
        return code;
    }

    public String message() {
        return message;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
