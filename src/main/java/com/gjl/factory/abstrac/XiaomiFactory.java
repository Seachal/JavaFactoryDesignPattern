package com.gjl.factory.abstrac;

/**
 * @author Seachal
 * @create 2019-03-16 23:51
 **/
public class XiaomiFactory implements PhoneFactory{
    public IProductA createProductA() {
        return new XiaomiProductA();
    }

    public IProductB createProductB() {
        return new XiaomiProductB();
    }
}
