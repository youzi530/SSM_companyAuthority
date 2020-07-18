package com.hm.service.impl;

import com.github.pagehelper.PageHelper;
import com.hm.dao.OrdersDao;
import com.hm.domain.Orders;
import com.hm.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class OrdersServiceImpl implements OrdersService {

    @Autowired
    private OrdersDao ordersDao;

    @Override
    public List<Orders> findAll(int page,int size) {
        PageHelper.startPage(page,size); //参数pageNum是页码值，pageSize就是每页显示条数
        return ordersDao.findAll();
    }

    @Override
    public Orders findById(String ordersId) throws Exception {
        return ordersDao.findById(ordersId);
    }
}
