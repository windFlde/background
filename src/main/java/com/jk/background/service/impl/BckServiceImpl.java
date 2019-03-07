package com.jk.background.service.impl;

import com.github.pagehelper.PageHelper;
import com.jk.background.bean.Example;
import com.jk.background.bean.Exprent;
import com.jk.background.bean.ReceivePage;
import com.jk.background.mapper.BckMapper;
import com.jk.background.service.BckService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BckServiceImpl implements BckService {


    @Resource
    BckMapper bckMapper;

    @Override
    public void addEx(Example example) {

        if(example.getId()!=null){
            bckMapper.updateEx();
        }else {
            bckMapper.addEx();
        }


    }

    @Override
    public List<Example> queryEx(ReceivePage receivePage) {
        List <Example> sum = bckMapper.queryEx(); //计算数据库符合条件的总条数 条数是固
        PageHelper.startPage(receivePage.getPage(),receivePage.getRows());
        List <Example> list = bckMapper.queryEx(); //当前页面数据 其大小取决于 每页多少条
        return list;
    }

    @Override
    public List<Exprent> quertAu() {
        return bckMapper.quertAu();
    }

}
