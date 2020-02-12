package my.demo

/**
//定义一个函数接受两个Int型参数，返回值为Int
fun sum(a: Int, b: Int) : Int{
return a + b
}

fun main(args: Array<String>) {
print("sum of 3 and 5 is ")
println(sum(3, 5))
}
 */


/**
//该函数只有一个表达式的函数体、自推导的返回值
fun sum(a: Int, b: Int) = a + b

fun main(args: Array<String>) {
println("sum of 19 and 23 is ${sum(19, 23)}")
}
 */


/*
//返回一个没有意义的值
fun printSum(a: Int, b:Int): Unit{
    println("sum of $a and $b is ${a + b}")
}

fun main(args: Array<String>) {
    printSum(-1, 8)
}
*/


/*
//Unit的返回类型可以省略
fun printSum(a: Int, b: Int){
    println("sum of $a and $b is ${a + b}")
}

fun main(args: Array<String>) {
    printSum(-1, 9)
}
 */


/*
//声明常量
fun main(args: Array<String>) {
    val a: Int = 1 //立即初始化
    val b = 2 //推导出Int型
    val c: Int //当没有初始化值的时候必须声明类型
    c = 3
    println("a = $a, b = $b, c = $c")

}
 */


/*
//声明 变量
fun main(args: Array<String>) {
    var x = 5 //推导出Int类型
    x += 1
    println("x is $x")
}
 */


/*
//使用字符串模版
fun main(args: Array<String>) {
    var a = 1
    val s1 = "a is $a" //使用变量名作为模版

    a = 2
    val s2 = "${s1.replace("is", "was")}, but now is $a" //使用表达式作为模版
    println(s2)
}
 */


/*
//使用条件表达式
fun maxOf(a: Int, b: Int): Int{
    if (a > b)
        return a
    else
        return b
}

fun main(args: Array<String>) {
    println("max of 0 and 42 is ${maxOf(0, 42)}")
}
 */


/*
//把if当表达式
fun maxOf(a: Int, b: Int) = if (a > b) a else b

fun main(args: Array<String>) {
    println("max of 2 and 42 is ${maxOf(2, 42)}")
}
 */

/*
//当空值可能出现时，应该明确指出该引用可空
fun parseInt(str: String): Int?{
    return str.toIntOrNull()
}

fun printProduct(arg1: String, arg2: String){
    val x: Int? = parseInt(arg1)
    val y: Int? = parseInt(arg2)

    if (x != null && y != null){
        println(x*y)
    }else{
        println("Either $arg1 or $arg2 is not a number")
    }
}

fun main(args: Array<String>) {
    printProduct("6", "7")
    printProduct("a", "7")
    printProduct("6", "b")
}
 */

/*
//使用值检查并自动转换
//使用is表达式检查一个表达式是否是某个类型的实例，如果已经进行了类型检查就没必要明确转换
fun getStringLength(obj: Any): Int?{
    if (obj is String)
        return obj.length

    return null
}

fun main(args: Array<String>) {
    fun printLength(obj: Any){
        println("'$obj' string length is ${getStringLength(obj) ?: " ... err, not a string"} ")
    }
    printLength("Incomprehensibilities")
    printLength(1000)
    printLength(listOf(Any()))
}
 */

/*
//使用循环
fun main(args: Array<String>) {
    val items = listOf("apple", "banana", "kiwi")
    for (item in items){
        println(item)
    }
}
 */

/*
//循环
fun main(args: Array<String>) {
    val items = listOf("apple", "banana", "kiwi")
    for (index in items.indices){
        println("item at $index is ${items[index]}")
    }
}
 */

/*
//使用while循环
fun main(args: Array<String>) {
    val items = listOf("apple", "banana", "kiwi")
    var index = 0
    while (index < items.size){
        println("item at $index is ${items[index]}")
        index++
    }
}
 */

/*
//使用when表达式
fun describe(obj: Any): String =
    when (obj) {
        1       -> "one"
        "Hello" -> "Greeting"
        is Long -> "Long"
        !is String -> "Not a String"
        else    -> "Unknown"

    }

fun main(args: Array<String>) {
    println(describe(1))
    println(describe("Hello"))
    println(describe(1000L))
    println(describe(2))
    println(describe("Other"))
}
 */


/*
//使用ranges，使用in操作服检查数值是否在某个范围内
fun main(args: Array<String>) {
    val x = 10
    val y = 9
    if (x in 0..y + 1){
        println("fits in range")
    }

    if (-1 !in 0..x){
        println("-1 is out of range.")
    }
}
 */

/*
//使用in范围内迭代
fun main(args: Array<String>) {
    for (x in 1..5){
        println(x)
    }
}
 */

/*
//使用in范围内迭代、步进
fun main(args: Array<String>) {
    for (x in 0..10 step 2){
        println(x)
    }
}
 */


//使用集合
/*
//对一个集合进行迭代
fun main(args: Array<String>) {
    val items = listOf("apple", "banana", "kiwi")
    for (item in items){
        println(item)
    }
}
 */

/*
//使用in操作符检查集合中是否包含某个元素
fun main(args: Array<String>) {
    val items = listOf("apple", "banana", "kiwi")
    when{
        "orange" in items -> println("has orange")
        "apple" in items -> println("has apple")
    }
}
 */

/*
//使用lambda表达式过滤和映射集合
fun main(args: Array<String>) {
    val fruits = listOf("avocado", "kiwi","apple", "banana")
    fruits
        .filter { it.startsWith('a') }
        .sortedBy { it }
        .map { it.toUpperCase() }
        .forEach { println(it) }
}
 */








