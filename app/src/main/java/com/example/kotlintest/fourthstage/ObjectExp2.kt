package com.example.kotlintest.fourthstage

/**
 * Description :
 * Time : 2020/9/15 14:45
 * Author : zengkun
 */

/*
    对象表达式只能在  局部变量范围(方法内)  内或  被private修饰的成员变量范围   内才能被识别出其真正的类型
    如果将对象表达式当作一个public方法的返回类型，或是public属性的类型，那么该方法或是属性的真正类型
    就是该对象表达式的父类型，如果没有声明任何父类型，那么其类型就是Any；在这种情况下，对象表达式中的任何成员都是无法访问的
 */
interface ObjectExp2 {
    fun myPrint2()
    fun addOtherMethod()
}

class MyClass {
    private var myObject = object {
        fun output() {
            println("output invoked")
        }
    }
    //如果接口中有两个方法，直接这样就行
    //而如果是java的话，就要new两个回调
    private fun myTest2(): ObjectExp2 = object : ObjectExp2 {
        override fun addOtherMethod() {

        }

        override fun myPrint2() {
            println("myPrint2 invoked")
        }
    }

    fun myTest() {
        println(myObject::class.java)
        myObject.output()
        //注意是方法调用myPrint2方法
        myTest2().myPrint2()
    }
}

fun main() {
    var myClass = MyClass()
    myClass.myTest()
}