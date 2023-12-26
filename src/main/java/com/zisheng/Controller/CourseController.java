package com.zisheng.Controller;

import com.zisheng.Service.CourseService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
@Api(tags = "课程相关接口")
public class CourseController {
    @Resource
    private CourseService courseService;
}
