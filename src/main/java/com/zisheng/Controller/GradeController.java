package com.zisheng.Controller;

import com.zisheng.Service.GradeService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
@Api(tags = "成绩相关接口")
public class GradeController {
    @Resource
    private GradeService gradeService;
}
