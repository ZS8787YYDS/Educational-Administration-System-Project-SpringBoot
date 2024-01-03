package com.zisheng.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zisheng.Pojo.Entity.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookMapper extends BaseMapper<Book> {
    List<Book> selectAll();
}
