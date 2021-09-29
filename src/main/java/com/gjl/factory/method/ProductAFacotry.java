package com.gjl.factory.method;

import com.gjl.factory.ProductA;
import com.gjl.factory.simple.Product;

/**
 * @author Seachal
 * @create 2019-03-16 23:40
 **/
public class ProductAFacotry implements MethodFacotry{
    public Product getProduct() {
        return new ProductA();
    }
}
