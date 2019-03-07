package com.jk.background.service;

import com.jk.background.bean.Example;
import com.jk.background.bean.Exprent;
import com.jk.background.bean.ReceivePage;

import java.util.List;

public interface BckService {
    void addEx(Example example);

    List<Example> queryEx(ReceivePage receivePage);

    List<Exprent> quertAu();
}
