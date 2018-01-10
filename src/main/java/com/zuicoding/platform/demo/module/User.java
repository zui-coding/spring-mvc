package com.zuicoding.platform.demo.module;

import java.io.Serializable;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import com.zuicoding.platform.demo.validator.Gender;
import com.zuicoding.platform.demo.validator.GenderAnnotation;

/**
 * Created by <a href="mailto:stephen.linicoding@gmail.com">Stephen.lin</a> on 2018/1/9.
 * <p>
 * <p>
 * </p>
 */
public class User implements Serializable {
    private static final long serialVersionUID = -7419443891100664402L;

    @NotBlank(message = "昵称不能为空")
    private String nikeName;
    @NotEmpty(message = "账号不能为空")
    private String userName;
    @NotBlank(message = "密码不能为空")
    private String password;
    @Min(value = 18,message = "年龄不能小于18岁")
    private int age;
    /**
     * 必须是女人
     */
    @GenderAnnotation(message = "必须是女人")
    private Gender sex;

    public String getNikeName() {
        return nikeName;
    }

    public void setNikeName(String nikeName) {
        this.nikeName = nikeName;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getSex() {
        return sex;
    }

    public void setSex(Gender sex) {
        this.sex = sex;
    }
}
