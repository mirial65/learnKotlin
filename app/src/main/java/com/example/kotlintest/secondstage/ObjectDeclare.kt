package com.example.kotlintest.secondstage

/**
 * Description : object declaration: 对象声明。直接声明一个对象
 * Time : 2020/9/13 10:50
 * Author : zengkun
 */

/*
    object declaration 对象声明,object后面接对象名字
    可以有属性及方法
 */
object MyObject {
    fun method() {
        println("method")
    }
}

fun main() {
    //因为MyObject本身就是对象，所以不需要实例化了
    MyObject.method()
}