- 所有代码都是基于Android studio运行的，当然，idea上也能运行
- 有时需要查字节码，看看对应Java代码是怎么写的
- AndroidStudio-->Tools-->Kotlin-->Show Kotlin ByteCode
- Android Studio的版本：4.0.0

1.firstStage: test01 -> test02 -> test03 -> test04 -> test05
- 主要介绍了kotlin的基本知识，讲了一下kotlin中的集合和数组，及一些常规操作（遍历，查询）等基本操作


2.secondStage：property -> constructor -> inherit -> companion -> extension
- 从属性 到 构造方法 到 继承 到 伴生对象 到 扩展
- 有两个很重要的概念，伴生对象---扩展方法

3.thirdStage: data -> generics -> sealed
- 数据类 --- 泛型 协变与逆变 --- 密封类
- 主要重点分析了协变与逆变
- 有一个很重要的概念，协变与逆变，但我在实际代码中没怎么遇到过，但在源码中应该很常见


4.fourthStage: inner -> nested -> objectDeclare -> objectExp
- 内部类---嵌套类 ----对象声明-----对象表达式
- 分析了内部类与嵌套类的区别，解决了Java中的什么问题，对象表达式的使用
- 重要概念：对象表达式


5.fifthStage: delegation -> function -> infix
- 委托 --- lambda表达式和函数式编程 -- 中缀表达式
- 这三个都是重点，在实际编码中使用的很多，最重要的就是function小结，与Java的函数式编程的差别比较大


### 补充：
#### 1.kotlin中的一些常见的语法糖,主要是针对于Standard.kt中的方法
[详情可见](https://blog.csdn.net/u013064109/article/details/78786646)
#### 2.kotlin中的常见的符号操作，"!!", "?", "?:"等
[详情可见](https://blog.csdn.net/Sindyue/article/details/99625012)
 
