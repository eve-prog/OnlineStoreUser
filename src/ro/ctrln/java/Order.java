package ro.ctrln.java;

import java.util.ArrayList;
import java.util.Objects;

public class Order {
     private int orderId;
     private String orderName;
     private ArrayList<Product> products;

     public Order(int orderId, String orderName, ArrayList<Product> products) {
          this.orderId = orderId;
          this.orderName = orderName;
          this.products = products;
     }

     public int getOrderId() {
          return orderId;
     }

     public void setOrderId(int orderId) {
          this.orderId = orderId;
     }

     public String getOrderName() {
          return orderName;
     }

     public void setOrderName(String orderName) {
          this.orderName = orderName;
     }

     public ArrayList<Product> getProducts() {
          return products;
     }

     public void setProducts(ArrayList<Product> products) {
          this.products = products;
     }

     @Override
     public String toString() {
          return "Order{" +
                  "orderId=" + orderId +
                  ", orderName='" + orderName + '\'' +
                  ", products=" + products +
                  '}';
     }

     @Override
     public boolean equals(Object o) {
          if (this == o) return true;
          if (o == null || getClass() != o.getClass()) return false;
          Order order = (Order) o;
          return orderId == order.orderId && orderName.equals(order.orderName) && products.equals(order.products);
     }

     @Override
     public int hashCode() {
          return Objects.hash(orderId, orderName, products);
     }
}

