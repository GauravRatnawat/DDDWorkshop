package com.thoughtworks.ddd;

import com.thoughtworks.ddd.domain.Cart;
import com.thoughtworks.ddd.domain.Product;

public class Application {

    public static void main(String[] args) {
        Cart cart = new Cart();
        Product ipad = new Product("Ipad");
        Product heroInkPen = new Product("Hero Ink Pen");
        Product gmCricketBat = new Product("GM Cricket bat");

        cart.addProduct(ipad, 1 );
        cart.addProduct(heroInkPen,1);
        cart.addProduct(gmCricketBat,2);
        cart.removeProduct(ipad);
    }

}
