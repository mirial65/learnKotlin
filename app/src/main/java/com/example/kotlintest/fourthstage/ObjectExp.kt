package com.example.kotlintest.fourthstage

/**
 * Description : 对象表达式(object expression)，特别特别重要。主要是针对匿名内部类的一些缺陷而产生的
 *  可以赋给一个变量
 * Time : 2020/8/17 15:26
 * Author : zengkun
 */

/*
    对象表达式的语法格式
    object [: 若干个父类，中间用逗号隔开] {
    }
 */

interface ObjectExp {
    fun myPrint(i: Int)
}

abstract class MyAbstract {
    abstract var age: Int
    abstract fun printInfo()
}

fun main() {
    //实现了一个接口
    val myObject = object : ObjectExp {
        override fun myPrint(i: Int) {
            println("i的值为：$i")
        }
    }
    myObject.myPrint(100)
    //并没有指定实现的类或接口
    val myObject2 = object {

    }
    //能实现多个接口，或抽象类，用逗号隔开
    val myObject3 = object : ObjectExp, MyAbstract() {
        override fun myPrint(i: Int) {
            println("i的值是：$i")
        }

        override var age: Int
            get() = 30
            set(value) { println("年龄为：${value}岁")}

        override fun printInfo() {
            println("printInfo invoked")
        }

    }
    myObject3.age = 19
    myObject3.myPrint(15)
    myObject3.printInfo()

}
