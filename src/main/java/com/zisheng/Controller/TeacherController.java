package com.zisheng.Controller;

import com.zisheng.Service.TeacherService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
@Api(tags = "教师相关接口")
public class TeacherController {
    @Resource
    private TeacherService teacherService;
}
