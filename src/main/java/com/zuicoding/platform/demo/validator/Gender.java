package com.zuicoding.platform.demo.validator;

/**
 * Created by <a href="mailto:Stephen.lin">Stephen.lin</a> on 2018/1/9.
 * <p>
 * <p>
 *     性别枚举
 * </p>
 */
public enum Gender {

    WOMAN(1,"女人"),

    MAN(2,"男人");

    private int code;
    private String text;

    Gender(int code, String text) {
        this.code = code;
        this.text = text;
    }

    public static Gender valueOf(int code){
        switch (code){
            case 1:
                return WOMAN;
            case 2:
                return MAN;
            default:
                throw new IllegalArgumentException("unknow code:"+code);
        }
    }
    public int getCode() {
        return code;
    }

    public String getText() {
        return text;
    }
}
