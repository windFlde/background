package com.jk.background.mapper;

import com.jk.background.bean.Example;
import com.jk.background.bean.Exprent;

import java.util.List;

public interface BckMapper {
    void updateEx();

    void addEx();

    List<Example> queryEx();

    List<Exprent> quertAu();
}
