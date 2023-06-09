# UML
## UML表示方法
1.  +表示public
2.  -表示private
3.  #表示protected

### 类与类之间的表示方法

#### 关联关系
是对象之间的一种引用关系，用于表示一类对象与另一类对象之间的联系。
1. 单项关联
在UML类图中用一个带箭头的实线表示
![单项关联](https://mypc-1313021454.cos.ap-beijing.myqcloud.com/designPattern/base/202305031733820.png)
2. 双向关联
在UML类图中用一个不带箭头的实线表示
![双向关联](https://mypc-1313021454.cos.ap-beijing.myqcloud.com/designPattern/base/202305031734977.png)
3. 自关联
在UML类图中用一个带有箭头且指向自身的直线表示。
![自关联](https://mypc-1313021454.cos.ap-beijing.myqcloud.com/designPattern/base/202305031734667.png)

#### 聚合关系
是关联关系的一种，是强关联关系，是整体和部分之间的关系。

也是通过成员对象实现的，其中成员对象是整体对象的一部分，但是成员对象可以脱离整体而独立存在。

在UML类图中，使用带空心菱形的实现表示，菱形指向整体。
![聚合关系](https://mypc-1313021454.cos.ap-beijing.myqcloud.com/designPattern/base/202305031734104.png)

#### 组合关系
组合表示类之间整体与部分的联系，但是是一种更强烈的聚合关系。

组合关系中，整体对象可以控制部分对象的生命周期，一旦整体对象不存在了，部分对象也将不存在，部分对象不能脱离整体对象而存在。

在UML类图中，组合关系使用带实心菱形实现表示，菱形指向整体。
![组合关系](https://mypc-1313021454.cos.ap-beijing.myqcloud.com/designPattern/base/202305031734247.png)
#### 依赖关系
依赖关系是一种使用关系，是对象之间普合度最弱的一种关联方式，是临时性的关联。

在代码中某个类的方法通过局部变量、方法的参数或者对静态方法的调用来访问另一个类(依赖类)中的某些方法来完成一些指责。

在UML类图中，使用带箭头的虚线表示，箭头从实用类指向被依赖的类。
![依赖关系](https://mypc-1313021454.cos.ap-beijing.myqcloud.com/designPattern/base/202305031734731.png)

#### 继承关系
继承关系是对象之间耦合度最大的一种关系，表示一般与特殊的关系，是父类与子类的关系，是一种继承关系。

在UML类图中，继承关系用带空心三角箭头的实线表示，箭头从子类指向父类。
![继承关系](https://mypc-1313021454.cos.ap-beijing.myqcloud.com/designPattern/base/202305031734107.png)

#### 实现关系
实线关系是接口与实现类的关系。在该关系中，类实线了接口，类中的操作实线了接口中所声明的所有的抽象操作。

在UML类图中，实现关系使用带空心三角箭头的虚线来表示，箭头从实现类指向接口。
![实现关系](https://mypc-1313021454.cos.ap-beijing.myqcloud.com/designPattern/base/202305031734957.png)

