package com.ecom.service;

import java.util.List;

import com.ecom.model.OrderRequest;
import com.ecom.model.ProductOrder;

public interface OrderService {

	public void saveOrder(Integer userid, OrderRequest orderRequest);

	public List<ProductOrder> getOrdersByUser(Integer userId);

	public Boolean updateOrderStatus(Integer id, String status);

	public List<ProductOrder> getAllOrders();
}
