package com.gjl.factory.method;

import com.gjl.factory.simple.Product;

/**
 * @author Seachal
 * @create 2019-03-16 23:41
 **/
public class MethodFacotryTest {
    public static void main(String[] args) {
        MethodFacotry facotry = new ProductAFacotry();
        Product product = facotry.getProduct();
        product.getProduct();

        MethodFacotry facotry1 = new ProductBFacotry();
        Product product1 = facotry1.getProduct();
        product1.getProduct();
    }
}
