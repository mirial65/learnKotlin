package com.example.kotlintest.fifthstage

/**
 * Description : 中缀符号 infix
 * Time : 2020/9/18 9:04
 * Author : zengkun
 */

/*
    函数还可以通过中缀符号的形式来调用，需要满足如下的3个条件
    1. 是成员函数或是扩展函数
    2. 拥有单个参数
    3. 声明时使用infix关键字
 */
class InfixTest(private val a: Int) {
    infix fun add (b: Int) = this.a + b
}

fun main() {
    val infixTest =  InfixTest(2);
    //对象， 方法， 唯一的参数
    println(infixTest add 5)
}
