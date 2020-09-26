package com.example.kotlintest.fifthstage

/**
 * Description : 委托(delegation)
 * Time : 2020/9/15
 * 9:14
 * Author : zengkun
 */

/*
 类委托
 */
interface Delegation {
    fun myPrint()
}
class DelegationImpl(private var str: String): Delegation{
    override fun myPrint() {
        println("print $str")
    }
}

/*
    MyClass类实现Delegation接口，但没有主动实现myPrint方法，委托给其他类来实现，通过'by'关键字
    委托原理：
    by关键字后面的对象实际上会被存储在类的内部，编译器会将父接口的所有方法实现出来
    并且将实现转移给委托对象去进行
 */
class MyClass: Delegation by DelegationImpl("delegation") {

}

fun main() {
    var myClass = MyClass()
    myClass.myPrint()
}