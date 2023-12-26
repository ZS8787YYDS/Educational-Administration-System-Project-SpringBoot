package com.zisheng.Service.Impls;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zisheng.Mapper.GradeMapper;
import com.zisheng.Pojo.Entity.Grade;
import com.zisheng.Service.GradeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class GradeServiceImpl extends ServiceImpl<GradeMapper, Grade> implements GradeService {
    private static final Logger log = LoggerFactory.getLogger(GradeServiceImpl.class);
    @Resource
    private GradeMapper gradeMapper;
}
