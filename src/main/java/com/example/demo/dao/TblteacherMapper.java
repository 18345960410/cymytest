package com.example.demo.dao;

import com.example.demo.model.Tblteacher;

public interface TblteacherMapper {
    int deleteByPrimaryKey(String teaid);

    int insert(Tblteacher record);

    int insertSelective(Tblteacher record);

    Tblteacher selectByPrimaryKey(String teaid);

    int updateByPrimaryKeySelective(Tblteacher record);

    int updateByPrimaryKey(Tblteacher record);
}