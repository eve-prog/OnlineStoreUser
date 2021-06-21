package ro.ctrln.java;

import java.util.Objects;

public class Wishlist {

     private int productNumber;
     private String productName;

     public Wishlist(int productNumber, String productDescription) {
          this.productNumber = productNumber;
          this.productName = productDescription;
     }

     public int getProductNumber() {
          return productNumber;
     }

     public void setProductNumber(int productNumber) {
          this.productNumber = productNumber;
     }

     public String getProductDescription() {
          return productName;
     }

     public void setProductDescription(String productDescription) {
          this.productName = productDescription;
     }

     @Override
     public String toString() {
          return "Wishlist{" +
                  "productNumber=" + productNumber +
                  ", productName='" + productName + '\'' +
                  '}';
     }

     @Override
     public boolean equals(Object o) {
          if (this == o) return true;
          if (o == null || getClass() != o.getClass()) return false;
          Wishlist wishlist = (Wishlist) o;
          return productNumber == wishlist.productNumber && productName.equals(wishlist.productName);
     }

     @Override
     public int hashCode() {
          return Objects.hash(productNumber, productName);
     }
}