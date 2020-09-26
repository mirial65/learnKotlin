package com.example.kotlintest.fifthstage

/**
 * Description :
 * Time : 2020/9/18 13:35
 * Author : zengkun
 */

/*
    在默认情况下，lambda表达式中最后一个表达式的值会隐式作为lambda表达式的返回值，
    当然，我们也可以通过return语句来显示的指定返回的值
 */
fun main() {
    val strings = arrayOf("hello", "world", "welcome")
    //1.
    strings.filter {
        it.length > 6
    }
    //2.
//    strings.filter {
//        var may = it.length > 6
//        return@filter may
//    }

}