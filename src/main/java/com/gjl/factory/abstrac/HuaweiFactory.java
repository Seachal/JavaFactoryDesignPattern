package com.gjl.factory.abstrac;

/**
 * @author Seachal
 * @create 2019-03-16 23:53
 **/
public class HuaweiFactory implements PhoneFactory{

    public IProductA createProductA() {
        return new HuaweiProductA();
    }

    public IProductB createProductB() {
        return new HuaweiProductB();
    }
}
