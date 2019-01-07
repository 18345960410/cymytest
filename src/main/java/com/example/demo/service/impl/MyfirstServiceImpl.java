package com.example.demo.service.impl;

import com.example.demo.dao.TblcourseMapper;
import com.example.demo.model.Tblcourse;
import com.example.demo.service.MyfirstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyfirstServiceImpl implements MyfirstService {
    @Autowired
    public TblcourseMapper tblcourseMapper;

    @Override
    public String getfirst() {
        Tblcourse tblcourse = tblcourseMapper.selectByPrimaryKey("001");
        System.out.println(tblcourse.getCourseid());
        return "cc";
    }

    @Override
    public Tblcourse getfirst(String id) {
        try {
            //Tblcourse tblcourse = tblcourseMapper.selectByPrimaryKey("001");
            //System.out.println(tblcourse.getCourseid());
            Tblcourse tblcourse = new Tblcourse();
            tblcourse.setCourseid("8081");
            return tblcourse;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }


    }
}
