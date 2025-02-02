package vttp5_paf_day24w.repo;

public class Queries {

    public static final String SQL_INSERT_ORDER = 
    """
        INSERT INTO orders (order_date, customer_name, ship_address, notes, tax)
            VALUES (?, ?, ?, ?, ?);
    """;

    public static final String SQL_INSERT_ORDER_DETAIL = 
    """
        INSERT INTO order_details (product, unit_price, discount, quantity, order_id)
            VALUES (?, ?, ?, ?, ?);
    """;

}

