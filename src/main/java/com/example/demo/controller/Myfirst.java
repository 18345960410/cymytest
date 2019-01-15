package com.example.demo.controller;

import com.example.demo.model.Tblcourse;
import com.example.demo.service.MyfirstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class Myfirst {
    @Autowired
    private MyfirstService myfirstService;
    //private Logger logger = LogManager.getLogger(Myfirst.class);
    @RequestMapping("/first")
    public String first() {
        try {
            String getfirst = myfirstService.getfirst();
       //     logger.info("dddddddd");
            //
            return getfirst;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @RequestMapping("/getFirst")
    @ResponseBody
    public Tblcourse getFirst(String id,String name) {
        try {

            Tblcourse getfirst = myfirstService.getfirst(id);
            return getfirst;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
