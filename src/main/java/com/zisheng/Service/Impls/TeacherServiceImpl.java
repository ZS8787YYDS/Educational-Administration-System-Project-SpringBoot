package com.zisheng.Service.Impls;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zisheng.Mapper.TeacherMapper;
import com.zisheng.Pojo.Entity.Teacher;
import com.zisheng.Service.TeacherService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TeacherServiceImpl extends ServiceImpl<TeacherMapper, Teacher> implements TeacherService {
    private static final Logger log = LoggerFactory.getLogger(TeacherServiceImpl.class);
    @Resource
    private TeacherMapper teacherMapper;
}
