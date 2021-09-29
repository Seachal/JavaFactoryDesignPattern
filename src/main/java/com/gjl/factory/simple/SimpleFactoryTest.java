package com.gjl.factory.simple;

/**
 * @author Seachal
 * @create 2019-03-16 23:31
 **/
public class SimpleFactoryTest {
    public static void main(String[] args) {
      com.gjl.factory.simple.Product product = SimpleFactory.getProduct("A");
        product.getProduct();
    }
}
