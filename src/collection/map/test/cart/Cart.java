package collection.map.test.cart;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    Map<Product, Integer> cart = new HashMap<>();

    public void add(Product product, Integer quantity) {
        Integer existingQuantity = cart.getOrDefault(product, 0);
        cart.put(product, existingQuantity+quantity);
    }

    public void printAll() {
        System.out.println("==모든 상품 출력==");
        for (Map.Entry<Product, Integer> entry : cart.entrySet()) {
            System.out.println("상품: " + entry.getKey() + " 수량: " + entry.getValue());
        }
    }

    public void minus(Product product, Integer quantity) {
        int existingquantity = cart.getOrDefault(product, 0);
        int changedQuantity = existingquantity - quantity;
        if (changedQuantity <= 0) {
            cart.remove(product);
        } else {
                cart.put(product, changedQuantity);
        }
    }
}
