package vttp5_paf_day24w.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import vttp5_paf_day24w.model.Order;

@Repository
public class OrderRepo {

    @Autowired
    private JdbcTemplate template; 

    public int insertOrder(Order order) {

        return template.update(Queries.SQL_INSERT_ORDER, 
            order.getOrderDate(),
            order.getCustomerName(),
            order.getShipAddress(),
            order.getNotes(),
            order.getTax());

    }

}
