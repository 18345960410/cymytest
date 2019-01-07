package com.example.demo.dao;

import com.example.demo.model.Tblcourse;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Component;


@Mapper
@Component
//@MapperScan("com.example.demo.dao")
public interface TblcourseMapper {
    int deleteByPrimaryKey(String courseid);

    int insert(Tblcourse record);

    int insertSelective(Tblcourse record);

    Tblcourse selectByPrimaryKey(String courseid);

    int updateByPrimaryKeySelective(Tblcourse record);

    int updateByPrimaryKey(Tblcourse record);
}