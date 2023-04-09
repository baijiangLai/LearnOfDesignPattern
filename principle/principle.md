# 软件设计原则
七大原则的目的：
1. 降低对象之间的耦合性。
2. 增加程序的可复用性、可扩展性以及可维护性。

## 单一职责原则 (Single Responsibility Principle)
就一个类而言，应该仅有一个引起它变化的原因，否则类应该呗拆分。



单一职责原则和信就是解耦和增强内聚性。


## 开放-关闭原则 (Open-Closed Principle)
对外扩展开放，对修改关闭。在程序需要进行拓展的时候，不能修改原有的代码。

可以使得程序的扩展性好，易于维护和升级。

换句话：在对一个类进行升级的时候，对于已经有的比较稳定的代码尽量不要进行改动，而是创建一个子类，通过重写父类的部分逻辑来实现新的行为。



## 里氏替换原则 (Liskov Substitution Principle)

## 依赖倒转原则 (Dependence Inversion Principle)
## 接口隔离原则 (Interface Segregation Principle)
## 迪米特法则（Law Of Demeter）
## 合成复用原则 (Composite/Aggregate Reuse Principle)