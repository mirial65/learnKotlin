package com.example.kotlintest.secondstage

/**
 * Description : interface及抽象类的简讲
 * Time : 2020/8/13 17:18
 * Author : zengkun
 */
//interface不需要open关键字用于继承，但其实现类中的override还是需要的
interface A {

    fun method() {
        println("A")
    }
}

open class B {
    open fun method() {
        println("B")
    }
}

//实现接口也是用":"
//A后面是没有"()",就是代表不能实例化接口
//如果这里实现A接口和继承B类，那么super会实现哪个method方法呢，应该怎么写？
class C : A, B() {
    override fun method() {
        super<A>.method()
        super<B>.method()
        println("C")
    }
}

/*
   抽象类和抽象方法都要用abstract关键字修饰
 */
abstract class BaseClass {
    abstract fun method()
}

//这里也需要override关键字
class ChildClass : BaseClass() {
    override fun method() {

    }
}

