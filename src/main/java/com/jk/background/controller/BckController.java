package com.jk.background.controller;

import com.jk.background.bean.Example;
import com.jk.background.bean.Exprent;
import com.jk.background.bean.ReceivePage;
import com.jk.background.service.BckService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("bck")
public class BckController {

    @Resource
    BckService bckService;

    @ResponseBody
    @RequestMapping("addEx")
    public void  addEx(Example example){

        bckService.addEx(example);

    }

    @ResponseBody
    @RequestMapping("queryEx")
    public List<Example> queryEx(ReceivePage receivePage){
       return bckService.queryEx(receivePage);
    }

    @ResponseBody
    @RequestMapping("quertAu")
    public List<Exprent> quertAu(){
        return bckService.quertAu();
    }

}
