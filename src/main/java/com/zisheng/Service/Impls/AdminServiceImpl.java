package com.zisheng.Service.Impls;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zisheng.Mapper.AdminMapper;
import com.zisheng.Pojo.Entity.Admin;
import com.zisheng.Service.AdminService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {
    private static final Logger log = LoggerFactory.getLogger(AdminServiceImpl.class);
    @Resource
    private AdminMapper adminMapper;

}
