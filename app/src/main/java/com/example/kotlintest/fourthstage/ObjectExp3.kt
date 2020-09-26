package com.example.kotlintest.fourthstage

/**
 * Description : kotlin的对象表达式中的代码可以访问到最外层的变量，因为默认就是final的
 * 而java中的匿名内部类若要访问外层的变量，则要声明为final
 * Time : 2020/9/15 15:27
 * Author : zengkun
 */

fun main() {
    var i = 1
    val myObject = object {
        fun method() {
            i++
        }
    }
    myObject.method()
    println(i)
}

