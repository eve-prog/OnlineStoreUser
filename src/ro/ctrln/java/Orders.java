package ro.ctrln.java;

import java.util.ArrayList;
import java.util.Objects;

public class Orders {

     private int orderNumber;
     private String orderDescription;
     private ArrayList<String> products;

     public Orders(int orderNumber, String orderDescription, ArrayList<String> products) {
          this.orderNumber = orderNumber;
          this.orderDescription = orderDescription;
          this.products = products;
     }

     public int getOrderNumber() {
          return orderNumber;
     }

     public void setOrderNumber(int orderNumber) {
          this.orderNumber = orderNumber;
     }

     public String getDescription() {
          return orderDescription;
     }

     public void setDescription(String description) {
          this.orderDescription = description;
     }

     public ArrayList<String> getProducts() {
          return products;
     }

     public void setProducts(ArrayList<String> products) {
          this.products = products;
     }

     @Override
     public String toString() {
          return "Orders{" +
                  "orderNumber=" + orderNumber +
                  ", orderDescription=" + orderDescription +
                  ", products=" + products +
                  '}';
     }

     @Override
     public boolean equals(Object o) {
          if (this == o) return true;
          if (o == null || getClass() != o.getClass()) return false;
          Orders orders = (Orders) o;
          return orderNumber == orders.orderNumber && orderDescription.equals(orders.orderDescription) && products.equals(orders.products);
     }

     @Override
     public int hashCode() {
          return Objects.hash(orderNumber, orderDescription, products);
     }
}

