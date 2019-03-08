package com.jk.background.service;

import com.jk.background.bean.Example;
import com.jk.background.bean.Exprent;
import com.jk.background.bean.ReceivePage;
import com.jk.background.bean.SendPage;

import java.util.List;

public interface BckService {
    void addEx(Example example);

    SendPage queryEx(ReceivePage receivePage);

    List<Exprent> quertAu();

    Example getEx(Integer id);

    void delEx(String ids);

}
