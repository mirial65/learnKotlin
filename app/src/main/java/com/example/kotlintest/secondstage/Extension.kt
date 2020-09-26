package com.example.kotlintest.secondstage

/**
 * Description :  扩展:extension(很重要)，就是动态地给类   扩充功能  。java的手段有：继承，实现接口，修饰模式
 * Time : 20214 10:52
 * Author : zengkun
 */

class Extension {
    fun add(a: Int, b: Int) = a + b
    fun sub(a: Int, b: Int) = a - b
}

//新需求，乘法操作，应用扩展函数
//注意：扩展并不会真正的修改目标类，扩展函数的解析是静态的
fun Extension.multiply(a: Int, b: Int) = a * b

//扩展函数的解析是静态分发的，而不是动态的，即 不   支   持   多   态，调用值取决于对象的   声明   类型
//调用是由对象声明类型所决定的，而不是由对象的实际类型决定的
//比如说
open class AA
class BB : AA()

//扩展
fun AA.a() = "a"
fun BB.a() = "b"

//这里的声明类型就是AA
fun myPrint(aa: AA) {
    println(aa.a())
}

/*
    扩展函数是支持重载的，
    对属性也支持扩展
    对可空类型也能进行扩展（?）
    对伴生对象也能进行扩展
 */
class ExtensionCompanion {
    companion object {
    }
}

fun ExtensionCompanion.print(i: Int) {
    println("myPrint: $i")
}

val ExtensionCompanion.name: String
    get() = "Hello"

fun Any?.toString(): String {
    return this?.toString() ?: "null"
}

fun ExtensionCompanion.Companion.method() {
    println("companion object method")
}

fun main() {
    val extension = Extension()
    println(extension.add(1, 3))
    println(extension.sub(3, 1))
    println(extension.multiply(3, 4))
    println("------------------")
    myPrint(AA())
    //如果是支持多态的话，那么应该是和它的实例化对象有关，那么这里会输出b
    myPrint(BB())
    println("------------------")
    ExtensionCompanion.method()
}