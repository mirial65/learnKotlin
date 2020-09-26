package com.example.kotlintest.sixthstage

/**
 * Description : 集合中好用的一些扩展方法 与 Range
 * Time : 2020/9/19 10:20
 * Author : zengkun
 */

fun main() {
    val items = listOf(1, 2, 3, 4, 5, 6)
    println(items.first())
    //找到集合中的偶数
    items.filter { it % 2 == 0 }
    val myList = mutableListOf(1, 3, 6, 7)
    println(myList.requireNoNulls())
    //Returns `true` if no elements match the given
    if (myList.none{
            it > 10
        }) {
        println("没有大于10的元素")
    }
    val myMap = hashMapOf("hello" to 1, "world" to 2)
    println(myMap["hello"])
    println("-----------")


    val i = 4
    //闭区间
    if (i in 1..5) {
        println("in this range")
    }
    for (a in 1..5) {
        println(a)
    }
    println("-----------")
    for (a in 5 downTo 2) {
        println(a)
    }
    println("-----------")
    for (a in 1..8 step 2) {
        println(a)
    }
    println("-----------")
    //左闭右开
    for (a in 1 until 5) {
        println(a)
    }
}
