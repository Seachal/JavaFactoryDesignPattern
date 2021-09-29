package com.gjl.factory.simple;

import com.gjl.factory.Product;

/**
 * @author Seachal
 * @create 2019-03-16 23:31
 **/
public class SimpleFactoryTest {
    public static void main(String[] args) {
        Product product = SimpleFactory.getProduct("A");
        product.getProduct();
    }
}
