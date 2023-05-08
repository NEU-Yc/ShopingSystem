package com.yc.service;

import com.yc.domain.Good;

import java.util.List;

public interface GoodService {

    public boolean addGood(Good good);

    public boolean deleteById(Integer id);

    public boolean update(Good good);

    public Good getById(Integer id);

    public Good getByName(String name,Integer merId);

    public List<Good> searchByName(String name,Integer merId);

    public List<Good> getList(Integer merId);

}
