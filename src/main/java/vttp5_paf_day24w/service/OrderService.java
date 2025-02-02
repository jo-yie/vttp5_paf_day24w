package vttp5_paf_day24w.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vttp5_paf_day24w.model.Order;
import vttp5_paf_day24w.repo.OrderRepo;

@Service
public class OrderService {

    @Autowired
    private OrderRepo orderRepo; 

    public int insertOrder(Order order) {

        return orderRepo.insertOrder(order);

    }
    
}
