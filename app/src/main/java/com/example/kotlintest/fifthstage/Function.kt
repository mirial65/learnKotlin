package com.example.kotlintest.fifthstage

import com.example.kotlintest.firststage.test

/**
 * Description : 带默认参数值的函数
 * 1.对于重写带默认参数的函数时，子类会使用父类的默认参数值
 * 2.在重写一个默认参数的函数时，子类的方法签名中需要省略默认参数值
 * 3.如果一个方法中默认参数位于非默认参数的前面，那么非默认参数的使用就要用具名参数,如果最后一个参数为lambda表达式，那么这条规则无效
 * Time : 2020/9/16 15:16
 * Author : zengkun
 */

fun test(a: Int = 1, b: Int = 0) = println(a - b)

fun test2(a: Int = 3, b: Int) = println(a + b)

fun test3(a: Int = 2, b: Int = 3, compute: (x: Int, y: Int) -> Unit) {
    compute(a, b)
}

//vararg(可变参数)
fun test4(vararg strings: String) {
    println(strings::class.java) //数组类型
    strings.forEach { println(it) }

}

fun main() {
    test()
    test(2)
    //只想传一个b的值  --- 显示指定参数名(具名参数)
    test(b = 2)
    println("------------")
    test2(2, 3)
    test2(b = 4)
    println("------------")
    test3 { x, y -> println(x + y) }
    test3(2, 3, ::test)
    //前提：如果一个方法的最后一个参数为lambda表达式，那么可以将lambda写在函数外面
    //注意lambda表达式中的参数不需要'()'
    test3(2, 3) { a, b -> println(a - b) }
    println("------------")
    test4("a", "b", "c")
    //但是不能将数组直接赋给可变参数,需要一个分散运算符"*"(spread operator)
    test4(strings = *arrayOf("a", "b", "c"))
}