package com.hm.service;

import com.hm.domain.Orders;
import org.springframework.core.annotation.Order;

import java.util.List;

public interface OrdersService {

    List<Orders> findAll(int page,int size) throws Exception;

    Orders findById(String ordersId)throws Exception;
}
