package ro.ctrln.java;

import java.util.ArrayList;
import java.util.Objects;

public class Wishlist {
     private int productUnit;
     private ArrayList<Product> wishlistProducts;

     public Wishlist(int productUnit, ArrayList<Product> wishlistProducts) {
          this.productUnit = productUnit;
          this.wishlistProducts = wishlistProducts;
     }

     public int getProductUnit() {
          return productUnit;
     }

     public void setProductUnit(int productUnit) {
          this.productUnit = productUnit;
     }

     public ArrayList<Product> getWishlistProducts() {
          return wishlistProducts;
     }

     public void setWishlistProducts(ArrayList<Product> wishlistProducts) {
          this.wishlistProducts = wishlistProducts;
     }

     @Override
     public String toString() {
          return "Wishlist{" +
                  "productUnit=" + productUnit +
                  ", wishlistProducts=" + wishlistProducts +
                  '}';
     }

     @Override
     public boolean equals(Object o) {
          if (this == o) return true;
          if (o == null || getClass() != o.getClass()) return false;
          Wishlist wishlist = (Wishlist) o;
          return productUnit == wishlist.productUnit && wishlistProducts.equals(wishlist.wishlistProducts);
     }

     @Override
     public int hashCode() {
          return Objects.hash(productUnit, wishlistProducts);
     }
}
