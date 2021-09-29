package com.gjl.factory.method;

import com.gjl.factory.ProductB;
import com.gjl.factory.simple.Product;

/**
 * @author Seachal
 * @create 2019-03-16 23:41
 **/
public class ProductBFactory implements MethodFactory {
    public Product getProduct() {
        return new ProductB();
    }
} 
