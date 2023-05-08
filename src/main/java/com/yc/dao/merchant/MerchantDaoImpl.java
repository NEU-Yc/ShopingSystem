package com.yc.dao.merchant;

import com.yc.dao.BaseDao;
import com.yc.domain.Merchant;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MerchantDaoImpl implements MerchantDao {

    @Override
    public int addMerchant(Connection connection,Merchant merchant) throws Exception {
        int row = 0;
        String sql = "insert into merchant(username,password,name,phone) values(?,?,?,?)";
        PreparedStatement pstm = null;
        Object[] param = {merchant.getUserName(),merchant.getPassword(),merchant.getName(),merchant.getPhone()};
        if (null != connection) {
            row = BaseDao.executeUpdate(connection, pstm, sql, param);
        }
        return row;
    }

    /**
     * 根据id删除商家
     * @param connection
     * @param id
     * @throws Exception
     */
    @Override
    public int deleteById(Connection connection, Integer id) throws Exception {
        PreparedStatement pstm = null;
        int row=0;
        if (null != connection) {
            String sql = "delete  from merchant where id=?";
            Object[] params = {id};
            row = BaseDao.executeUpdate(connection, pstm, sql, params);
        }
        return row;
    }

    /**
     * 修改商家
     * @param connection
     * @param merchant
     * @throws Exception
     */
    @Override
    public int update(Connection connection, Merchant merchant) throws Exception {
        PreparedStatement pstm=null;
        int row=0;
        if (null != connection) {
            String sql = "update merchant set name=?,phone=?,description=? where id=?";
            Object[] params = {merchant.getName(),merchant.getPhone(),merchant.getDescription(),merchant.getId()};
            row = BaseDao.executeUpdate(connection, pstm, sql, params);
        }
        return row;
    }

    /**
     * 调用BaseDao中的excute方法，返回一个结果集并从中获取数据
     *
     * @param connection
     * @param username
     * @return
     * @throws Exception
     */
    @Override
    public Merchant getByUerName(Connection connection, String username) throws Exception {
        PreparedStatement pstm = null;
        ResultSet resultSet = null;
        Merchant merchant = null;
        if (null != connection) {
            String sql = "select  * from merchant where username=?";
            Object[] params = {username};
            resultSet = BaseDao.execute(connection, pstm, resultSet, sql, params);
            if (resultSet.next()) {
                merchant = new Merchant();
                merchant.setId(resultSet.getInt("id"));
                merchant.setUserName(resultSet.getString("username"));
                merchant.setPassword(resultSet.getString("password"));
                merchant.setPhone(resultSet.getString("phone"));
                merchant.setName(resultSet.getString("name"));
                merchant.setDescription(resultSet.getString("description"));
            }
            BaseDao.closeResource(null, null, null);
        }

        return merchant;
    }

    @Override
    public List<Merchant> getByName(Connection connection, String name) throws Exception {
        List<Merchant> merchants = new ArrayList<>();
        PreparedStatement preparedStatement = null;
        ResultSet rs =null;
        Merchant merchant = null;
        if(null!= connection){
            String sql = "select * from merchant where name like ?";
            Object[] param = {name};
            ResultSet resultSet = BaseDao.execute(connection, preparedStatement, rs, sql, param);
            while (resultSet.next()){
                if(resultSet.getInt("id")==1){
                    continue;
                }
                merchant = new Merchant();
                merchant.setId(resultSet.getInt("id"));
                merchant.setUserName(resultSet.getString("username"));
                merchant.setPassword(resultSet.getString("password"));
                merchant.setName(resultSet.getString("name"));
                merchant.setPhone(resultSet.getString("phone"));
                merchant.setDescription(resultSet.getString("description"));
                merchants.add(merchant);
            }
        }
        return merchants;
    }

    @Override
    public Merchant getById(Connection connection, Integer id) throws Exception {
        PreparedStatement pstm = null;
        ResultSet resultSet = null;
        Merchant merchant = null;
        if (null != connection) {
            String sql = "select  * from merchant where id=?";
            Object[] params = {id};
            resultSet = BaseDao.execute(connection, pstm, resultSet, sql, params);
            if (resultSet.next()) {
                merchant = new Merchant();
                merchant.setId(resultSet.getInt("id"));
                merchant.setUserName(resultSet.getString("username"));
                merchant.setPassword(resultSet.getString("password"));
                merchant.setPhone(resultSet.getString("phone"));
                merchant.setName(resultSet.getString("name"));
                merchant.setDescription(resultSet.getString("description"));
            }
            BaseDao.closeResource(null, null, null);
        }

        return merchant;
    }

    /**
     * 返回一个List<Merchant>集合
     * @param connection
     * @return
     * @throws Exception
     */
    @Override
    public List<Merchant> getAll(Connection connection) throws Exception {
        List<Merchant> merchants = new ArrayList<>();
        PreparedStatement preparedStatement = null;
        ResultSet rs =null;
        Merchant merchant = null;
        if(null!= connection){
            String sql = "select * from merchant";
            Object[] param = {};
            ResultSet resultSet = BaseDao.execute(connection, preparedStatement, rs, sql, param);
            while (resultSet.next()){
                if(resultSet.getInt("id")==1){
                    continue;
                }
                merchant = new Merchant();
                merchant.setId(resultSet.getInt("id"));
                merchant.setUserName(resultSet.getString("username"));
                merchant.setPassword(resultSet.getString("password"));
                merchant.setName(resultSet.getString("name"));
                merchant.setPhone(resultSet.getString("phone"));
                merchant.setDescription(resultSet.getString("description"));
                merchants.add(merchant);
            }
        }
        return merchants;
    }


}