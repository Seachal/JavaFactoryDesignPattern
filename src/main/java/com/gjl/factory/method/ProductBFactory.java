package com.gjl.factory.method;

import com.gjl.factory.Product;
import com.gjl.factory.ProductB;

/**
 * @author Seachal
 * @create 2019-03-16 23:41
 **/
public class ProductBFactory implements MethodFactory {
    public Product getProduct() {
        return new ProductB();
    }
} 
