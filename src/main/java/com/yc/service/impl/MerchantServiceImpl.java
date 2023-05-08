package com.yc.service.impl;

import com.yc.dao.BaseDao;
import com.yc.dao.good.GoodDao;
import com.yc.dao.good.GoodDaoImpl;
import com.yc.dao.merchant.MerchantDao;
import com.yc.dao.merchant.MerchantDaoImpl;
import com.yc.domain.Good;
import com.yc.domain.Merchant;
import com.yc.service.MerchantService;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MerchantServiceImpl implements MerchantService {

    private MerchantDao merchantDao;
    private GoodDao goodDao;

    public MerchantServiceImpl(){
        merchantDao=new MerchantDaoImpl();
        goodDao=new GoodDaoImpl();
    }

    @Override
    public boolean addMerchant(Merchant merchant)  {
        Connection connection = null;
        int row=0;
        try {
            connection = BaseDao.getConnection();
            Merchant temp = merchantDao.getByUerName(connection,merchant.getUserName());
            if(temp==null){
                 row = merchantDao.addMerchant(connection,merchant);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            BaseDao.closeResource(connection, null, null);
        }

        return row==1;

    }

    @Override
    public boolean deleteById(Integer id) {
        Connection connection = null;
        int row=0;
        boolean flag=false;
        try {
            connection = BaseDao.getConnection();
            List<Good> goods = goodDao.getAll(connection, id);
            if(!(goods.isEmpty())){
                System.out.println(id);
                System.out.println(goods);
                flag=false;
            }else{
                row=merchantDao.deleteById(connection,id);
                if(row==1){
                    flag=true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            BaseDao.closeResource(connection, null, null);
        }
        return flag;
    }

    @Override
    public boolean update(Merchant merchant) {
        Connection connection = null;
        int row=0;
        try {
            connection = BaseDao.getConnection();
            row=merchantDao.update(connection,merchant);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            BaseDao.closeResource(connection, null, null);
        }
        return row==1;
    }

    @Override
    public Merchant getByUserName(String username) {
        Connection connection = null;
        Merchant merchant = null;
        try {
            connection = BaseDao.getConnection();
            merchant = merchantDao.getByUerName(connection, username);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            BaseDao.closeResource(connection, null, null);
        }
        return merchant;
    }

    @Override
    public Merchant getById(Integer id){
        Connection connection = null;
        Merchant merchant = null;
        try {
            connection = BaseDao.getConnection();
            merchant = merchantDao.getById(connection, id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            BaseDao.closeResource(connection, null, null);
        }
        return merchant;
    }

    @Override
    public List<Merchant> getByName(String name) {
        Connection connection = null;
        List<Merchant> merchants=new ArrayList<>();
        try {
            connection = BaseDao.getConnection();
            merchants=merchantDao.getByName(connection,name);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            BaseDao.closeResource(connection, null, null);
        }

        return merchants;
    }
    @Override
    public List<Merchant> getList() {
        Connection connection = null;
        List<Merchant> merchants=new ArrayList<>();
        try {
            connection = BaseDao.getConnection();
            merchants=merchantDao.getAll(connection);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            BaseDao.closeResource(connection, null, null);
        }

        return merchants;
    }
}
