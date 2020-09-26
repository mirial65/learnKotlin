package com.example.kotlintest.secondstage

/**
 * Description : 扩展的作用域
 * 1. 扩展函数   所定义   在的类实例叫做分发接受者(dispatch receiver)
 * 2. 扩展函数   所扩展   的那个类的实例叫做扩展接收者(extension receiver)
 * 3. 当以上两个名字出现冲突时，扩展接收者的优先级最高
 *
 * 扩展可以更好的解决java中充斥的各种辅助类的问题
 *
 * isEmpty其实就是Array的扩展方法
 * _Arrays类中的方法都是扩展函数
 *
 * Time : 2020/8/14 12:11
 * Author : zengkun
 */
class Extension1 {
    fun method1() {
        println("method_1")
    }
}


class Extension2 {
    private fun method2() {
        println("method_2")
    }

    //扩展没有定义在同一级别上，所以外面的Extension1的对象是访问不到这个方法的
    private fun Extension1.method3() {
        //能够使用Extension1类中的方法
        method1()
        method2()
    }

    fun method4(extension: Extension1) {
        extension.method3()
    }

    private fun Extension1.output() {
        //这里的toString方法会调用哪个类的toString呢？
        //当以上两个名字出现冲突时，扩展接收者的优先级最高
        println(toString())
        println(this.toString())
        println(this@Extension2.toString())
    }

    fun test() {
        val extension = Extension1()
        extension.method3()
        extension.output()
    }

}

fun Extension2.hello() {
    println("hello")
}

fun main() {
//    var extension = Extension1()
    //访问不了,因为扩展类和所扩展的那个方法不在同一层次上
    //extension.method3()
    val extension2 = Extension2()
    extension2.test()
    extension2.hello()
    println("-----------------")
    list.swap(2, 5)
    println(list)

}

var list = listOf(1, 2, 3, 5, 6, 9)

