package com.example.kotlintest.fifthstage

/**
 * Description : 闭包
 * Time : 2020/9/18 14:59
 * Author : zengkun
 */
/*
    闭包：
    在lambda表达式或匿名函数中，可以访问或**修改**作用域以外的属性，java是不行的
 */
fun main() {
    var sum = ""
    val strings = arrayOf("hello", "world", "bye")
    //闭包
    strings.filter { it.length > 3 }.forEach {
        sum += it
    }
}