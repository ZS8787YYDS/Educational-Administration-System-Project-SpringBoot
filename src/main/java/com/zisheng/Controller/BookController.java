package com.zisheng.Controller;

import com.zisheng.Service.BookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j

public class BookController {
    @Resource
    private BookService bookService;
}
