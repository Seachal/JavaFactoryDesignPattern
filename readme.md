## 1 
在简单工厂中，
SimpleFactory 负责了具体的创建，现在想个问题，如果要扩展一个新产品线D，那么
就要修改SimpleFactory， 不符合对扩展开发，对修改关闭。

那么就换个模式，采用工厂方法模式，就可以扩展了，现在要扩展新的产品 D，
那么创建 ProductDFactory 实现MethodFactory就可以用了。

## 2 工厂方法已经满足扩展了
~~工厂方法已经满足扩展了，现在再想个问题，如果以前的产品线A，
要对 A 增加一些特色，  使可以生产 A1型号(XiaomiProductA)，  A2 型号(XiaomiProductB)的产品，
并且以后还可以再扩展，可以生成更多Axx 型号的产品。那么咱么办呢？~~
刚刚总结的上面的情况不一定对， 还要结合《研磨设计模式》再学习下。

抽象工厂具有 工厂方法的扩展功能， 例如，新增加一个收常常，三星也是可以扩展，不用修改工厂方法。
PhoneFactory IProductA ，IProductB ，可以理解为 IProductA（假设为android9 系统的手机），IProductB
（假设为android 10系统的手机）
， 

未来如果要扩展 android  11系统的手机，修改 PhoneFactory 增加 IProductC（假设为 android  11系统的手机的手机）。 但是感觉有个问题， 如果小米
说 android 9系统太老了，我要停掉，但是仍然要实现 createProductA（假设为android9 系统的手）方法呀。




