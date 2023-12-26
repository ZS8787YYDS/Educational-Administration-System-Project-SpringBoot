package com.zisheng.Service.Impls;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zisheng.Mapper.DemoMapper;
import com.zisheng.Pojo.User;
import com.zisheng.Service.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@Slf4j
public class DemoServiceImpl extends ServiceImpl<DemoMapper, User> implements DemoService {
    @Resource
    private DemoMapper demoMapper;
    @Override
    public void insert(User user) {
        demoMapper.insert(user);
    }
}
