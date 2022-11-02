package com.yc.dao.good;

import com.yc.domain.Good;
import com.yc.domain.Merchant;

import java.sql.Connection;
import java.util.List;

public interface GoodDao {
    /**
     * 增加商品
     * @param connection
     * @param good
     * @return
     * @throws Exception
     */
    public int addGood(Connection connection, Good good)throws Exception;

    /**
     * 删除商品通过id
     * @param connection
     * @param id
     * @throws Exception
     */
    public int deleteById(Connection connection,Integer id)throws Exception;

    /**
     * 修改商品
     * @param good
     * @throws Exception
     */
    public int  update(Connection connection,Good good)throws Exception;

    /**
     *根据id查询商品
     * @param connection
     * @param id
     * @return
     * @throws Exception
     */
    public Good getById(Connection connection, Integer id) throws Exception;

    /**
     * 根据商品名称获得商品
     * @param connection
     * @param name
     * @return
     * @throws Exception
     */
    public Good getByName(Connection connection, String name,Integer merId) throws Exception;

    /**
     * 模糊查询商品名称
     * @param connection
     * @param name
     * @return
     * @throws Exception
     */
    public List<Good> searchByName(Connection connection, String name,Integer merId) throws Exception;

    /**
     * 调用此方法返回商品信息列表
     * @param connection
     * @param merId
     * @return
     * @throws Exception
     */
    public List<Good> getAll(Connection connection,Integer merId) throws Exception;
}
