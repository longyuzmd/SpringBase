package com.atguigu.base.controller;

import com.atguigu.base.service.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ComputerController {

//    @Qualifier("computerServiceImplFirst")
//    @Autowired
//    private ComputerService computerService;

    @Autowired
    private ComputerService computerServiceImplSecond;

    public void save(){
        computerServiceImplSecond.save();
    }
}
