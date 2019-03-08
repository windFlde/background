package com.jk.background.mapper;

import com.jk.background.bean.Example;
import com.jk.background.bean.Exprent;

import java.util.List;

public interface BckMapper {
    void updateEx(Integer id);

    void addEx(Example example);

    List<Example> queryEx();

    List<Exprent> quertAu();

    Example getEx(Integer id);

    void delEx(String ids);
}
