package com.zisheng.Service.Impls;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zisheng.Mapper.CourseMapper;
import com.zisheng.Pojo.Entity.Course;
import com.zisheng.Service.CourseService;
import org.apache.ibatis.annotations.Mapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl extends ServiceImpl<CourseMapper, Course> implements CourseService {
    private static  final Logger log = LoggerFactory.getLogger(CourseServiceImpl.class);
    @Mapper
    private CourseMapper courseMapper;
}
