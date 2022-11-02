package com.yc.service.impl;

import com.yc.dao.BaseDao;
import com.yc.dao.good.GoodDao;
import com.yc.dao.good.GoodDaoImpl;
import com.yc.domain.Good;
import com.yc.domain.Merchant;
import com.yc.service.GoodService;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class GoodServiceImpl implements GoodService {

    private GoodDao goodDao=new GoodDaoImpl();
    @Override
    public boolean addGood(Good good) {
        Connection connection = null;
        int row=0;
        try {
            connection = BaseDao.getConnection();
            row = goodDao.addGood(connection,good);
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
        try {
            connection = BaseDao.getConnection();
            row=goodDao.deleteById(connection,id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            BaseDao.closeResource(connection, null, null);
        }
        return row==1;
    }

    @Override
    public boolean update(Good good) {
        Connection connection = null;
        int row=0;
        try {
            connection = BaseDao.getConnection();
            row=goodDao.update(connection,good);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            BaseDao.closeResource(connection, null, null);
        }
        return row==1;
    }

    @Override
    public Good getById(Integer id) {
        Connection connection = null;
        Good good = null;
        try {
            connection = BaseDao.getConnection();
            good = goodDao.getById(connection, id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            BaseDao.closeResource(connection, null, null);
        }
        return good;
    }

    @Override
    public Good getByName(String name, Integer merId) {
        Connection connection = null;
        Good good = null;
        try {
            connection = BaseDao.getConnection();
            good = goodDao.getByName(connection,name,merId);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            BaseDao.closeResource(connection, null, null);
        }
        return good;
    }

    @Override
    public List<Good> searchByName(String name,Integer merId) {
        Connection connection = null;
        List<Good> goods=new ArrayList<>();
        try {
            connection = BaseDao.getConnection();
            goods=goodDao.searchByName(connection,name,merId);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            BaseDao.closeResource(connection, null, null);
        }
        return goods;
    }

    @Override
    public List<Good> getList(Integer merId) {
        Connection connection = null;
        List<Good> goods=new ArrayList<>();
        try {
            connection = BaseDao.getConnection();
            goods=goodDao.getAll(connection,merId);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            BaseDao.closeResource(connection, null, null);
        }

        return goods;
    }
}
