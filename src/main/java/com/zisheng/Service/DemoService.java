package com.zisheng.Service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zisheng.Pojo.User;

public interface DemoService extends IService<User> {
    void insert(User user);
}
