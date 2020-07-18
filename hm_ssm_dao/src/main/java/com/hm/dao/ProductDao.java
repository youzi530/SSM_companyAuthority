package com.hm.dao;

import com.hm.domain.Product;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ProductDao {

    //查询所有的产品信息
    @Select("select * from product")
    public List<Product> findAll();

    //保存方法：
    @Insert("insert into product(productNum,productName,cityName,departureTime,productPrice,productDesc,productStatus) values(#{productNum},#{productName},#{cityName},#{departureTime},#{productPrice},#{productDesc},#{productStatus})")
    public void save(Product product);

    //根据id来查询产品信息
    @Select("select * from  product where id = #{id}")
    public Product findById(String id);
}
