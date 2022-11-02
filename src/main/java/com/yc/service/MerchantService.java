package com.yc.service;

import com.yc.domain.Merchant;

import java.util.List;

public interface MerchantService {

    public boolean addMerchant(Merchant merchant);

    public boolean deleteById(Integer id);

    public boolean update(Merchant merchant);

    public Merchant getByUserName(String username);

    public Merchant getById(Integer id);

    public List<Merchant> getByName(String name);

    public List<Merchant> getList();
}
