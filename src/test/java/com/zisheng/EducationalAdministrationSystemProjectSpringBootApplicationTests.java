package com.zisheng;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.zisheng.Mapper.AdminMapper;
import com.zisheng.Mapper.BookMapper;
import com.zisheng.Pojo.Entity.Admin;
import com.zisheng.Pojo.Entity.Book;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;
import java.util.function.Consumer;

@SpringBootTest
@Slf4j
class EducationalAdministrationSystemProjectSpringBootApplicationTests {
    @Resource
    private AdminMapper adminMapper;
    @Resource
    private BookMapper bookMapper;
    @Test
    public void selectAdmin()
    {
        List<Admin> admins = adminMapper.selectList(null);
        admins.forEach(System.out::println);
    }
    @Test
    public void testBook()
    {
        LambdaQueryWrapper<Book> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        List<Book> books = bookMapper.selectList(lambdaQueryWrapper);
        books.forEach(System.out::println);
    }
    @Test
    public void testBookTwo()
    {
        List<Book> books = bookMapper.selectAll();
        books.forEach(book -> log.info(book+" "));
    }
}
