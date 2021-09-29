package com.gjl.factory.simple;
import com.gjl.factory.simple.Product;
/**
 * @author Seachal
 * @create 2019-03-16 23:31
 **/
public class SimpleFacotryTest {
    public static void main(String[] args) {
        Product product = SimpleFacotry.getProduct("A");
        product.getProduct();
    }
}
