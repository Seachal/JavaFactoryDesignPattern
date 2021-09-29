package com.gjl.factory.method;


import com.gjl.factory.Product;

/**
 * @author Seachal
 * @create 2019-03-16 23:41
 **/
public class MethodFactoryTest {
    public static void main(String[] args) {
        MethodFactory facotry = new ProductAFactory();
        Product product = facotry.getProduct();
        product.getProduct();

        MethodFactory facotry1 = new ProductBFactory();
        Product product1 = facotry1.getProduct();
        product1.getProduct();
    }
}
