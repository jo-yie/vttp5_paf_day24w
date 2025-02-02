package vttp5_paf_day24w.model;

public class OrderDetail {

    private int id; 
    private String product; 
    private long unitPrice; 
    private long discount; 
    private int quantity;
    private int orderId; 
    public OrderDetail() {
    }
    public OrderDetail(int id, String product, long unitPrice, long discount, int quantity) {
        this.id = id;
        this.product = product;
        this.unitPrice = unitPrice;
        this.discount = discount;
        this.quantity = quantity;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getProduct() {
        return product;
    }
    public void setProduct(String product) {
        this.product = product;
    }
    public long getUnitPrice() {
        return unitPrice;
    }
    public void setUnitPrice(long unitPrice) {
        this.unitPrice = unitPrice;
    }
    public long getDiscount() {
        return discount;
    }
    public void setDiscount(long discount) {
        this.discount = discount;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    } 

}
