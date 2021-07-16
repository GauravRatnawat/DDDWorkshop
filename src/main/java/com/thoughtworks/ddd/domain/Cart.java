package com.thoughtworks.ddd.domain;

import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class Cart {
    private List<CartItem> cartItems;

    public void addProduct(Product product, int quantity) {
        this.cartItems.add(new CartItem(product, quantity));
    }

    public void removeProduct(Product product) {
        this.cartItems.remove(new CartItem(product));
    }
}
