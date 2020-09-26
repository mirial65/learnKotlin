package com.example.kotlintest.firststage

/**
 * Description : when关键字，运算符重载'..'的用法
 * Time : 2020/8/13 9:56
 * Author : zengkun
 */

fun main() {
    println(myPrint("hello"))
    println(myPrint("welcome"))
    println("-----------")
    println(myPrint2("world"))
    println("-----------")
    test2(50)
    println("-----------")
    range(3, 8)
}

/*
  when 关键字，和java中的if else及switch case类似
  但when必须穷尽它所能取到的情况，即总需要else，除非是密封类
 */
fun myPrint(str: String): String {
    return when (str) {
        "hello" -> "HELLO"
        "world" -> "WORLD"
        "hello world" -> "HELLO WORLD"
        else -> "other input"
    }
}
//更简洁的写法
fun myPrint2(str: String) = when(str) {
    "hello" -> "HELLO"
    "world" -> "WORLD"
    "hello world" -> "HELLO WORLD"
    else -> "other input"
}

fun test2(a: Int): Int {
    return when (a) {
        1 -> {
            println("a = 1")
            //把10赋给result
            10
        }
        2 -> {
            println("a = 2")
            20
        }
        3, 4, 5 -> {
            println("a = 3 or 4 or 5")
            30
        }
        //和java不同，kotlin右边也是闭区间
        // '..'是运算符重载，代表6~60之间
        in 6..60 -> {
            println("a is between 6 and 60")
            40
        }
        else -> 50
    }
}

/*
   in在kotlin中代表区间，"..",运算符重载,左闭右闭
 */
fun range(a: Int, b: Int) {
    if (a in 2..b) {
        println("in the range")
    }
    // '!in' 表示不在某个范围
    if (a !in 2..b) {
        println("not in the range")
    }
    //可以用于遍历输出值
    //java是for循环
    for (i in 2..10) {
        print("$i ")
    }
    println()
    for (i in 2.rangeTo(10)) {
        print("$i ")
    }
    println()
    //步进值为2
    //step是一个中缀表达式
    for (i in 2..10 step 2) {
        println(i)
    }
    //downTo也是一个中缀表达式
    for (i in 10 downTo 2 step 2) {
        println(i)
    }
}
