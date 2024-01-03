package com.zisheng.Controller;

import com.zisheng.Results.Result;
import com.zisheng.Service.AdminService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
@Api(tags = "管理员相关接口")
@RequestMapping(value = "/admin")
public class AdminController {
    @Resource
    private AdminService adminService;
    @GetMapping(value = "/insert")
    public Result<String> get()
    {
        return Result.success("aa");
    }

}
