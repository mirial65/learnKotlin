package com.example.kotlintest.secondstage

/**
 * Description :  kotlin中的属性，及延迟初始化特性
 * Time : 2020/8/14 10:06
 * Author : zengkun
 */
/*
 *  kotlin提供了四种可见的修饰符：private, protected, internal,public
 * 在java中，如果不加修饰符，代表的是default级别，而kotlin中代表的是public级别的
 * internal代表是级别是：只能在同一个模块(module)下使用
 * protected 不能用于修饰顶层的类或方法
 */
//默认不写就是public，如果没有body，可以不写花括号
class Property(address: String, name: String) {
    //val：可读（只有get方法）， var即可读又可写
    //get方法前面的修饰符要和属性的修饰符一样，默认不写是public级别的
    val age get() = 20
    var address: String = address
        get() {
            println("get invoked")
            //用于真正指代它的值
            //这里如果return address，就会堆栈溢出，因为我在不断的循环访问address
            return field
        }
        set(value) {
            println("set invoke")
            field = value
        }

    //常规写法，set，get方法会隐式的生成
    var name: String = name
        //编译器会提示这是冗余的写法
        get() {
            //用于真正指代它的值
            return field
        }
        set(value) {
            field = value
        }

    //lateinit：延迟初始化
    //基本类型的属性上不允许使用“ lateinit”修饰符, 比如说Int就不能加lateinit修饰符
    //kotlin要求非空的属性必须要进行初始化
    //不过，有时这种要求不太方便，比如可以通过  依赖注入  的情况下进行属性的赋值
    //通过lateinit关键字标识属性为延迟初始化，需要满足三个条件
    // 1. lateinit只能用在类体中的声明var属性上，不能用在primary constructor声明的属性上
    // 2. 属性不能拥有自定义的setter和getter
    // 3. 属性类型需要为非空，且不能是原生数据类型
    lateinit var grade: String
}

fun main() {
    val person = Property("shanghai", "zhangsan")
    //实际上调用的age的get方法
    println(person.age)
    //实际上调用的address的get方法
    println(person.address)

}
