package com.gjl.factory.simple;

import com.gjl.factory.ProductA;
import com.gjl.factory.ProductB;
import com.gjl.factory.ProductC;
import com.gjl.factory.simple.Product;

/**
 * @author Seachal
 * @create 2019-03-16 23:23
 **/
public class SimpleFactory {
    public static Product getProduct(String productName){
        if("A".equals(productName)){
            return new ProductA();
        }else if("B".equals(productName)){
            return new ProductB();
        }else if("C".equals(productName)){
            return new ProductC();
        }
        return null;
    }
}
