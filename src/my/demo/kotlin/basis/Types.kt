package my.demo.kotlin.basis

import java.lang.IllegalArgumentException

//内建数值类型
//Double Float Long Int Short Byte, 没有字符类型

//字面值常量
//16进制
val a = 0x0f
//2进制
val b = 0b0100110

//数值常量中可以添加下划线分割
val oneMillion = 1_000_000
val cretitCardNumber = 1294_1984_2492_4824L


//表示
//"=="比较两个数值是否相等 "==="比较两个对象地址是否相等
val c: Int = 10000

fun main(args: Array<String>) {
    println(c === c)
    val boxedC: Int? = c
    val anotherBoxedC: Int? = c

    println(boxedC === anotherBoxedC)
    println(boxedC == anotherBoxedC)


    //短类型不是长类型的子类型
    val a: Int = 1
    val b: Long = 1
//    println(a == b) //Long类型的equals()只有和Long类型的比较才会相等

    val c: Byte = 1
    val d: Int = c.toInt() //必须显示转换

    val s = "good is ${1 == 3}"
    println("s is $s")

    if (a in 3..5) {

    }

    //隐式转换，使用上下文推断出类型
    val l = a.toLong() + 1 //Long + Int = Long

    //运算符
    //位运算
    val x = (1 shl 2) or 0x000FF000

    //shl shr ushl ushr or and xor 按位翻转 inv

    //字符
    //字符是由单引号包裹的'1',特殊的字符通过反斜杠转义，
    //\t \r \' \" \\ \$

    println("字符'8'转换为数字为：${decimalDigitValue('8')}")

    //数组
    //数组在Kotlin中由Array表示，有get和set方法（运算符[]重载），size以及其它方法
    //提供一个通过索引产生数组元素值的工厂函数
    val asc = Array(5, { i -> (i * i).toString() })
    println(asc.get(3))

    //Kotlin提供专门的原始类型避免过度装箱
    val a1: IntArray = intArrayOf(1, 2, 3)
    a1[0] = a1[1] + a1[2]

    //字符产
    //是由String表示，可以通过索引操作
    val str: String = "轻轻地敲打我的窗"
    for (c in str){
        println(c)
    }

    //字符串字面量，一种是带转义符的，一种是可以包含新行及任意文本的
    val s1 = "Hello World\n"

    val text = """for (c in "foo"){
        |println(c)
        |}""".trimMargin()
    println(text)

    //字符串模版
    val i = 10
    val s2 = "i=$i"
    println(s2)

    val s3 = "abc"
    val s4 = "$s3.length is ${s3.length}"
    println(s4)

    val price = """
        ${'$'}9.99
    """.trimIndent()
    println("打印价格：$price")
}

fun decimalDigitValue(c: Char): Int {
    if (c !in '0'..'9') {
        throw IllegalArgumentException("Out of range.")
    }
    return c.toInt()
}