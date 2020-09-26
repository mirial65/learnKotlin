package com.example.kotlintest.sixthstage

/**
 * Description : 带接收者的参数字面值
 * Time : 2020/9/18 15:05
 * Author : zengkun
 */
/*
    Kotlin中提供了这样一种功能：可以通过指定的接收者对象来调用一个函数字面值
    在函数字面值内部，你可以调用接收者对象的方法，而无需使用任何额外的修饰符
    这一点非常类似于扩展函数
 */

fun main() {
    val subtract: Int.(other: Int) -> Int = {
        other -> this - other
    }

    //类似于'until'关键字,写一下这个方法
    infix fun Int.subtract2(other: Int): Int {
        return this - other
    }
    println(1.subtract(1))
    println("----------")

    println(3 subtract2 1)
    println("----------")
    /*
        匿名函数就是没有函数名的函数
        eg. fun(a: Int, b: Int) = a + b
        匿名函数语法可以然我们指定函数字面值的接收者类型，这样，我们就可以先去声明一个带有接收者的函数类型变量，然后再去使用它
     */
    //再来看一个这个，别搞混了
    var sum = fun Int.(other: Int):Int = this + other
    println(1.sum(2))
}