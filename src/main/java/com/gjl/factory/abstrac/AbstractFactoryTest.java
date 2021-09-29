package com.gjl.factory.abstrac;

/**
 * @author Seachal
 * @create 2019-03-16 23:55
 **/
public class AbstractFactoryTest {
    public static void main(String[] args) {
        HuaweiFactory huaweiFactory = new HuaweiFactory();
        huaweiFactory.createProductA().editProduct();
        huaweiFactory.createProductB().addProdcut();
//        huaweiFactory.createProductC();

        XiaomiFactory xiaomiFactory = new XiaomiFactory();
        xiaomiFactory.createProductA().editProduct();
        xiaomiFactory.createProductB().addProdcut();
    }
}
