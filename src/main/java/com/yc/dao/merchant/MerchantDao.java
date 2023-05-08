package com.yc.dao.merchant;

import com.yc.domain.Merchant;
import java.sql.Connection;
import java.util.List;


/**
 * dao层抛出异常，让service层去捕获处理
 */
public interface MerchantDao {


    /**
     * 添加商家
     * @param connection
     * @param merchant
     * @return
     * @throws Exception
     */
    public int addMerchant(Connection connection,Merchant merchant)throws Exception;

    /**
     * 根据id删除商家
     * @param connection
     * @param id
     * @throws Exception
     */
    public int deleteById(Connection connection,Integer id)throws Exception;
    /**
     * 修改商家
     * @param merchant
     * @throws Exception
     */
    public int  update(Connection connection,Merchant merchant)throws Exception;
    /**
     *根据id查询商家
     * @param connection
     * @param id
     * @return
     * @throws Exception
     */
    public Merchant getById(Connection connection, Integer id) throws Exception;

    /**
     * 根据用户名查询商家
     * @param connection
     * @param username
     * @return
     * @throws Exception
     */
    public Merchant getByUerName(Connection connection, String username) throws Exception;

    /**
     * 模糊查询店铺名称
     * @param connection
     * @param name
     * @return
     * @throws Exception
     */
    public List<Merchant> getByName(Connection connection,String name) throws Exception;
    /**
     * 调用此方法返回用户信息列表
     * @param connection
     * @return
     * @throws Exception
     */
    public List<Merchant> getAll(Connection connection) throws Exception;
}
