package com.jk.background.controller;

import com.jk.background.bean.Example;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("bck")
public class BckController {

    @ResponseBody
    @RequestMapping("addEx")
    public void  addEx(Example example){



    }


}
