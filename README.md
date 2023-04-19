# 设计模式
## UML
[UML](https://github.com/baijiangLai/DesignPattern/tree/master/UML)
## 设计原则
[设计原则](https://github.com/baijiangLai/DesignPattern/tree/master/principle)
## 创建型
### 单例模式
定义：确保一个类只有一个实例，而且自行实例化并向整个系统提供这个实例。

前半句：构造方法只能是private，因为只有一个实例，那么这个实例应该是当前类的类成员变量(static)

后半句：提供一个静态方法，以便于提供这个实例。
### 简单工厂模式
其实该模式并不属于设计模式23个设计模式的类型。但是由于使用较多，因此本仓库加入

定义：在该模式中，可以根据参数的不同从而返回不同类的实例。

专门定义一个类负责创建其他类的实例，被创建的实例通常都有共同的父类。

类图：
![简单工厂类图](https://raw.githubusercontent.com/baijiangLai/DesignPattern/master/images/creationType/%E7%AE%80%E5%8D%95%E5%B7%A5%E5%8E%82%E7%B1%BB%E5%9B%BE.png)

优点：
实现了对象的创建和使用分离。
创建交给专门的工厂类负责，程序员不需要关心如何去创建的，直接使用即可。

缺点：
不够灵活，如果新增一个产品就需要去修改工厂类。

### 原型模式
### 工厂模式
![工厂模式直观.png](https://raw.githubusercontent.com/baijiangLai/DesignPattern/master/images/creationType/%E5%B7%A5%E5%8E%82%E6%A8%A1%E5%BC%8F%E7%9B%B4%E8%A7%82.png)

定义一个用于创建对象的接口，让子类决定实例化哪个类。工厂方法使一个类的实例化延迟到其子类。

接口：就是工厂的抽象接口

让子类决定实例化哪个类：即让具体的某个工厂去实例化具体的产品。 

类图：

![工厂模式类图.png](https://raw.githubusercontent.com/baijiangLai/DesignPattern/master/images/creationType/%E5%B7%A5%E5%8E%82%E6%A8%A1%E5%BC%8F%E7%B1%BB%E5%9B%BE.png)

#### 个人理解
定义两个接口，一个接口用来规范工厂的行为，一个接口用来规范实际产品的行为。
具体的工厂实现工厂接口，具体的产品实现产品接口。
每个工厂生产指定的产品

角色：
1. 抽象工厂
2. 具体工厂A
3. 具体工厂B...
4. 产品体系

### 抽象工厂模式
![抽象工厂直观.png](https://raw.githubusercontent.com/baijiangLai/DesignPattern/master/images/creationType/%E6%8A%BD%E8%B1%A1%E5%B7%A5%E5%8E%82%E7%9B%B4%E8%A7%82.png)

由于工厂模式只能生产一个大类的产品，所有的产品都必须产品的接口。
抽象工厂模式使得工厂不仅仅可以生产某一个大类的产品，还可以生产其他大类的产品。
抽象工厂打破了一个具体工厂只能生产一个大类的限制。


抽象工厂模式只是工厂模式的一个扩展，当只有一个产品体系的时候就退回工厂模式。

如果新增一个产品体系，就必须在工厂类进行修改。

类图：

![抽象工厂类图](https://raw.githubusercontent.com/baijiangLai/DesignPattern/master/images/creationType/%E6%8A%BD%E8%B1%A1%E5%B7%A5%E5%8E%82%E7%B1%BB%E5%9B%BE.png)

#### 个人理解
就是一个工厂模式的变形，只是在工厂里面生产的东西不仅仅局限于一类了。

角色：
1. 抽象工厂
2. 具体工厂A
3. 具体工厂B...
3. 产品体系A
4. 产品体系B...

### 建造者模式


## 行为型
### 代理模式
### 适配器模式
定义：将一个类的接口变换程客户端所期待的另一种接口，从而使原本因接口不匹配而无法在一起工作的两个类能在一起工作。

举例：
新闻播放中会有一个手语老师，这个手语老师对于听力障碍人士就是一个很好的适配器。


类图：
![适配器模式类图](https://raw.githubusercontent.com/baijiangLai/DesignPattern/master/images/behavioralType/%E9%80%82%E9%85%8D%E5%99%A8%E6%A8%A1%E5%BC%8F%E7%B1%BB%E5%9B%BE.png)

与装饰器模式的区别：

1. 装饰器模式会对原有接口进行扩展，需要修改原来的接口。
2. 适配器模式的原有接口没有问题，只是需要去兼容客户端，因此进行一个转换，不会改变原有接口。

### 桥接模式
### 装饰器模式
定义：动态给一个对象添加一些额外的功能。就新增功能来说，装饰器模式比生成子类更加灵活。

生成子类要求写一个新的子类，从而对类层级进行扩展。

类图：
![装饰器模式类图](https://raw.githubusercontent.com/baijiangLai/DesignPattern/master/images/behavioralType/%E8%A3%85%E9%A5%B0%E5%99%A8%E6%A8%A1%E5%BC%8F%E7%B1%BB%E5%9B%BE.png)

### 外观模式
![外观模式直观图.png](https://raw.githubusercontent.com/baijiangLai/DesignPattern/master/images/behavioralType/%E5%A4%96%E8%A7%82%E6%A8%A1%E5%BC%8F%E7%9B%B4%E8%A7%82%E5%9B%BE.png)

定义：
要求一个子系统的外部与其内部的通信必须通过一个统一的对象进行。外观模式提供一个高层次的接口，使得子系统更容易使用。

类图：

![外观模式类图.png](https://raw.githubusercontent.com/baijiangLai/DesignPattern/master/images/behavioralType/%E5%A4%96%E8%A7%82%E6%A8%A1%E5%BC%8F%E7%B1%BB%E5%9B%BE.png)

缺点：
不符合开闭原则。子系统一旦发生扩展的话，那么就必须修改外观模式的类(必须要修改代码，才能适应子系统的变更)。


### 享元模式
### 组合模式

## 结构型
### 模板方法模式
### 策略模式
### 命令模式
### 责任链模式
### 状态模式
举例：
如果你是一个财富自由的人，那么上班完全就是看心情。如果今天晴天，心情好你选择了上班；阴天，心情一般你选择了在家睡觉；雨天，心情糟糕你选择休假。
此时，你的心情就是你的状态。


定义：
允许一个对象在其内部状态改变的时候改变它的行为，对象看起来似乎修改了它的类。其别名为状态对象，状态模式是一种行为型模式。

类图：

![状态模式类图.png](https://raw.githubusercontent.com/baijiangLai/DesignPattern/master/images/behavioralType/%E7%8A%B6%E6%80%81%E6%A8%A1%E5%BC%8F%E7%B1%BB%E5%9B%BE.png)

### 观察者模式
举例：
借钱还钱，张三找李四、王五、孙六...借钱，等张三有钱了之后就通知他们自己有钱可以开始还钱了。

![img.png](https://raw.githubusercontent.com/baijiangLai/DesignPattern/master/images/strcturalType/%E8%A7%82%E5%AF%9F%E8%80%85%E6%A8%A1%E5%BC%8F%E7%9B%B4%E8%A7%82%E5%9B%BE.png)

定义：
对象间一种一对多依赖关系，使得每当一个对象状态发生改变的时候，其相关依赖的对象都能都通知并被自动更新。

类图：

![观察者模式类图.png](https://raw.githubusercontent.com/baijiangLai/DesignPattern/master/images/strcturalType/%E8%A7%82%E5%AF%9F%E8%80%85%E6%A8%A1%E5%BC%8F%E7%B1%BB%E5%9B%BE.png)


### 中介者模式
### 迭代器模式
### 访问者模式
### 备忘录模式
### 解释器模式