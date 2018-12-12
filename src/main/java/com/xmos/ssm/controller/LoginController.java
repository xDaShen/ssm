package com.xmos.ssm.controller;

import com.xmos.ssm.dto.Result;
import com.xmos.ssm.entity.User;
import com.xmos.ssm.util.ResultUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
public class LoginController {
    @RequestMapping("/login")
    public Result login(User user) {
        if (Objects.equals(user.getName(),"xmos") && Objects.equals(user.getPwd(),"123456")) {
            return ResultUtil.success(null);
        }
        return ResultUtil.error(500, "账号或密码有误!");
    }
}
