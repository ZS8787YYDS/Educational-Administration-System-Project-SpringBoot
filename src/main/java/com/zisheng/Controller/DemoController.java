package com.zisheng.Controller;

import com.zisheng.Pojo.User;
import com.zisheng.Results.Result;
import com.zisheng.Service.DemoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
@Api(tags = "用户相关接口")
@RequestMapping(path = "/user")
public class DemoController {
    @Resource
    private DemoService demoService;
    @GetMapping(path = "/insert")
    @ApiOperation(value = "插入员工")
    public Result<Object> insertUser(User user){
        log.info("收到的用户信息为：" + user);
        demoService.insert(user);
        return Result.success(null,"插入成功");
    }
}
