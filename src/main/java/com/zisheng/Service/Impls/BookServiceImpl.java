package com.zisheng.Service.Impls;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zisheng.Mapper.BookMapper;
import com.zisheng.Pojo.Entity.Book;
import com.zisheng.Service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements BookService {
    private static final Logger log = LoggerFactory.getLogger(BookServiceImpl.class);
    @Resource
    private BookMapper bookMapper;
}
