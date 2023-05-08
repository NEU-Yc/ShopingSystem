package com.yc.dao.good;

import com.yc.dao.BaseDao;
import com.yc.domain.Good;
import com.yc.domain.Merchant;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class GoodDaoImpl implements GoodDao{
    @Override
    public int addGood(Connection connection, Good good) throws Exception {
        int row = 0;
        String sql = "insert into goods(merid,name,price,inventory,description) values(?,?,?,?,?)";
        PreparedStatement pstm = null;
        Object[] param = {good.getMerId(),good.getName(),good.getPrice(),good.getInventory(),good.getDescription()};
        if (null != connection) {
            row = BaseDao.executeUpdate(connection, pstm, sql, param);
        }
        return row;
    }

    @Override
    public int deleteById(Connection connection, Integer id) throws Exception {
        PreparedStatement pstm = null;
        int row=0;
        if (null != connection) {
            String sql = "delete  from goods where id=?";
            Object[] params = {id};
            row = BaseDao.executeUpdate(connection, pstm, sql, params);
        }
        return row;
    }

    @Override
    public int update(Connection connection, Good good) throws Exception {
        PreparedStatement pstm=null;
        int row=0;
        if (null != connection) {
            String sql = "update goods set name=?,price=?,inventory=?,description=? where id=?";
            Object[] params = {good.getName(),good.getPrice(),good.getInventory(),good.getDescription(),good.getId()};
            row = BaseDao.executeUpdate(connection, pstm, sql, params);
        }
        return row;
    }

    @Override
    public Good getById(Connection connection, Integer id) throws Exception {
        PreparedStatement pstm = null;
        ResultSet resultSet = null;
        Good good = null;
        if (null != connection) {
            String sql = "select  * from goods where id=?";
            Object[] params = {id};
            resultSet = BaseDao.execute(connection, pstm, resultSet, sql, params);
            if (resultSet.next()) {
                good = new Good();
                good.setId(resultSet.getInt("id"));
                good.setMerId(resultSet.getInt("merid"));
                good.setName(resultSet.getString("name"));
                good.setPrice(resultSet.getInt("price"));
                good.setInventory(resultSet.getInt("inventory"));
                good.setDescription(resultSet.getString("description"));
            }
            BaseDao.closeResource(null, null, null);
        }

        return good;
    }

    @Override
    public Good getByName(Connection connection, String name,Integer merId) throws Exception {
        PreparedStatement pstm = null;
        ResultSet resultSet = null;
        Good good = null;
        if (null != connection) {
            String sql = "select  * from goods where name=? and merid=?";
            Object[] params = {name,merId};
            resultSet = BaseDao.execute(connection, pstm, resultSet, sql, params);
            if (resultSet.next()) {
                good = new Good();
                good.setId(resultSet.getInt("id"));
                good.setMerId(resultSet.getInt("merid"));
                good.setName(resultSet.getString("name"));
                good.setPrice(resultSet.getInt("price"));
                good.setInventory(resultSet.getInt("inventory"));
                good.setDescription(resultSet.getString("description"));
            }
            BaseDao.closeResource(null, null, null);
        }
        return good;
    }

    @Override
    public List<Good> searchByName(Connection connection, String name,Integer merId) throws Exception {
        List<Good> goods = new ArrayList<>();
        PreparedStatement preparedStatement = null;
        ResultSet rs =null;
        Good good = null;
        if(null!= connection){
            String sql = "select * from goods where name like ? and merid = ?";
            Object[] param = {name,merId};
            ResultSet resultSet = BaseDao.execute(connection, preparedStatement, rs, sql, param);
            while (resultSet.next()){
                good = new Good();
                good.setId(resultSet.getInt("id"));
                good.setMerId(resultSet.getInt("merid"));
                good.setName(resultSet.getString("name"));
                good.setPrice(resultSet.getInt("price"));
                good.setDescription(resultSet.getString("description"));
                good.setInventory(resultSet.getInt("inventory"));
                goods.add(good);
            }
        }
        System.out.println("dao"+goods);
        return goods;
    }

    @Override
    public List<Good> getAll(Connection connection,Integer merId) throws Exception {
        List<Good> goods = new ArrayList<>();
        PreparedStatement preparedStatement = null;
        ResultSet rs =null;
        Good good = null;
        if(null!= connection){
            String sql = "select * from goods where merid=?";
            Object[] param = {merId};
            ResultSet resultSet = BaseDao.execute(connection, preparedStatement, rs, sql, param);
            while (resultSet.next()){
                good = new Good();
                good.setId(resultSet.getInt("id"));
                good.setMerId(resultSet.getInt("merid"));
                good.setName(resultSet.getString("name"));
                good.setPrice(resultSet.getInt("price"));
                good.setDescription(resultSet.getString("description"));
                good.setInventory(resultSet.getInt("inventory"));
                goods.add(good);
            }
        }
        return goods;
    }
}
