package my.demo.basis

//if表达式
//在Kotlin中，if可以作为表达式，可以返回一个值；

//作为表达式
val max = if (a > b) a else b//所以不需要condition ? a : b三元操作符

//if分支可以作为块，最后一个表达式是该块的值
val max2 = if (a > b) {
    println("Choose a")
    a
} else {
    println("Choose b")
    b
}
val x: Int = 7

fun Int.isOdd(i: Int): Boolean {
    return i % 2 == 1
}

fun Int.isEven(i: Int): Boolean {
    return i % 2 == 0
}

fun main(args: Array<String>) {
    //when表达式
    //when取代了switch,最简单的用法
    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> {
            println("x is neither 1 nor 2")
        }
    }

    //when可以作为表达式或声明
    //如果作表达式，满足条件的分支就是总表达式
    //如果作声明，那么分支的值会被忽略，每个分支都是一个语句块，并且它的值就是最后一个表达式的值

    //分支的条件可以连在一起
    when (x) {
        1, 2 -> println("x is 1 or 2")
        else -> println("x is neither 1 nor 2")
    }

    val validNumbers = arrayOf(1, 3, 5, 7)
    //可以用in判断是否在一个范围或集合中
    when (x) {
        in 1..10 -> println("x is in the range")
        in validNumbers -> println("x is valid number")
        !in 10..20 -> println("x is out of range")
        else -> println("none of above")
    }

    //is判断是某个类型
    val str = "prefix沟"
    val bol = when (str) {
        is String -> {
            println("$str is a String")
            str.startsWith("prefix")//作为声明，最后一个表达式即为它的值
        }
        else -> false
    }

    //when也可替代if-else if
    when {
        x.isOdd(x) -> print("x is odd")
        x.isEven(x) -> print("x is even")
        else -> print("x is funny")
    }


    println()
    //For循环，一共有3种
    for (i: Int in validNumbers){
        print("$i,")
    }
    println()

    for (index in validNumbers.indices){
        print("validNumbers[$index] = ${validNumbers[index]}  ")
    }
    println()

    for ((index, value) in validNumbers.withIndex()){
        print("下标$index 的值是$value  ")
    }
    println()



}