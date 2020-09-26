package com.example.kotlintest.thirdstage

/**
 * Description : Kotlin数据类 --data class
 * Time : 2020/8/14 14:20
 * Author : zengkun
 */

//对于数据类，编译器会自动为我们生成如下内容：
// 1. equals/hashCode对
// 2. toString(), copy()方法
// 3. 针对属性的componentN方法，并且是按属性的声明顺序来生成的
//在数据类中不允许显示的提供componentN方法,copy方法
/*
    数据类需要满足如下要求:
    1. 主构造方法中至少要有一个参数
    2. 所有的主构造方法参数都需要用var或者val修饰
    3. 数据类不能是抽象的，open的，sealed的以及inner的
    解构声明
    在主构造方法中有多少个参数，就是依次生成component1, component2...方法
    这些方法返回的就是对应字段的值，componentN方法是用来实现解构声明的
 */
//能进行嵌套
data class Data(val name: String, var age: Int, var address: String) {
    /**
     * 在jvm平台上 ，如果生成的类需要拥有无参的构造方法，那么就需要为所有属性指定默认值
     */
    data class Data2(
        var name: String = "wang wu",
        var age: Int = 21,
        var address: String = "shanghai"
    ) {

    }
}



fun main() {
    val data = Data("zhangsan", 20, "hu nan")
    println(data)
    val data2 = data.copy(address = "beijing")
    data2.age = 1000
    println(data2)
    //解构
    val (name, age, address) = data
    println("$name, $age, $address")
    val data3 = Data.Data2()
    println(data3)

}