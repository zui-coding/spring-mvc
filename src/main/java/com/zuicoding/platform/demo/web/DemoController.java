package com.zuicoding.platform.demo.web;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zuicoding.platform.demo.module.User;

/**
 * Created by <a href="mailto:stephen.linicoding@gmail.com">Stephen.lin</a> on 2018/1/9.
 * <p>
 * <p>
 * </p>
 */
@Controller
@RequestMapping("/demo")
public class DemoController {
    private Logger logger = LoggerFactory.getLogger(DemoController.class);
    @RequestMapping("index.json")
    @ResponseBody
    public Object index(
//            基本类型的验证必须要用全局异常去捕获
//            @Validated
//            @NotBlank(message = "参数不能为空!")
//            String params
            @Valid
            User user,
            BindingResult result){
        List<FieldError> errors = result.getFieldErrors();
        errors.forEach(e -> {
            logger.info("field:{},message:{}",e.getField(),e.getDefaultMessage());
        });

        return errors;
    }
}
