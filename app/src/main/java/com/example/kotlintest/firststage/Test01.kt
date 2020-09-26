package com.example.kotlintest.firststage

import android.os.Build
import androidx.annotation.RequiresApi

/**
 * Description : kotlin中函数的关键字为fun
 * Time : 2020/8/12 11:03
 * Author : zengkun
 */


@RequiresApi(Build.VERSION_CODES.N)
fun first() {
    //集合
    val list: List<String> = listOf("hello", "world", "hello world")
    //for循环
    for (str in list) {
        println("test: $str")
    }
    //it是语法糖
    //函数式编程,里面是一个lambda表达式，后面会详细说明
    list.forEach{ println(it) }
}

//返回类型写在最后，第三个Int
fun add(a: Int, b: Int): Int {
    return a + b
}

//单表达式可以直接返回
fun add2(a: Int, b: Int) = a + b

//如果函数不返回结果，可以在末尾加上一个Unit, 可以不加
fun myPrint(a: Int, b: Int): Unit {
    print("hello world")
    //比如要输出 a + b = ?，
    //传统的java方式  print(a + "+" + b + "=" + a + b)
    //kotlin, 有字符串模板
    println("$a + $b = $(a + b)")
    //这个也能不写
    return Unit
}
fun main() {
    add(1, 3)
    add2(2, 5)
    myPrint(2, 1)
}
