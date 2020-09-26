package com.example.kotlintest.sixthstage

/**
 * Description : 可变集合
 * kotlin严格区分可变集合与不可变集合
 * 要清楚的一点是：区分开可变集合的只读视图与实际上真正的不可变集合
 * Time : 2020/9/19 9:55
 * Author : zengkun
 */
fun main() {
    val stringList = mutableListOf("hello", "world", "welcome")
    //readOnlyList是可变集合的只读视图
    val readOnlyList: List<String> = stringList
    stringList.add("bye")
    println(readOnlyList)
    //readOnlyList是不可变的集合，所以下面这句会编译不通过
//    readOnlyList.add("good")
    //只读类型是协变的，它只能从集合中获取数据，而不会修改集合中的数据
    val s = listOf("a", "b", "c")
    val str = s[0]
//    s.add("d")


}
