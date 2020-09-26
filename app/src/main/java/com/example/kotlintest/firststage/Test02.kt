package com.example.kotlintest.firststage


/**
 * Description :
 * Time : 2020/8/12 11:14
 * Author : zengkun
 */
fun main() {
    //常量，相当于Java中的final,
    val a = 1
    //会根据类型推断b是Int类型
    val b = 2
    //变量
    var c: Int = 3
    test()
    test1()
    test2(1,2 )
}

//kotlin中的类型转换比较严谨，不允许将小范围的类型赋给大范围的(并不是指java中的多态)，而java是允许的
fun test() {
    val x: Int = 10
    var y: Long = 20
    //在kotlin中，所有类型都是 对象
    val z: Byte = 14
//    val zz: byte = 14
    //不能把小范围的变量额赋给大范围的变量，kotlin中只能两个变量类型相等才能赋值,下面是错误的
    //y = x
    //但可以这样
    y = x.toLong()
    println(y)

}

fun test1() {
    //val是指这个引用是不可变的，但它的内容是可变的
    //intArrayOf传的是可变参数，返回的是一个数组
    val m = intArrayOf(1, 2, 3)
    m[0] = 4
    //在编译时，下面这行会报错
//    m[4] = 5
}

/**
 * 最大最小值
 */
fun test2(a: Int, b: Int) {
    //传统的做法,java式做法
    //        if (a < b) {
    //            max = b
    //            min = a
    //        }else {
    //            max = a
    //            min = b
    //        }

    //kotlin做法，一切皆表达式
    val max = if (a > b) a else b
    //如果是代码块，需要加”{}“
    val max2 = if (a > b) {
        //代码块中的最后一个语句作为结果赋给max2
        a
    } else b
    val min = if (a > b) b else a
    println("min = $min, max = $max")
}


