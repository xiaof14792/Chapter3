package my.demo.kotlin.start

import java.io.File
import java.lang.ArithmeticException
import java.nio.file.Files
import java.nio.file.Paths

//单例模式
object Resource {
    val name = "Name"
}


val files = File("Test").listFiles()
fun main(args: Array<String>) {
    //如果不为空则...的简写
    println(files?.size)

    //如果不为空则...否则...的缩写
    println(files?.size ?: "empty")

    //如果声明为空执行某操作
    val map = mapOf<Int, String>(2 to "4")
    val email = map[2] ?: throw IllegalArgumentException("Email is missing")

    //如果不为空执行某项操作
    val date = "123"
    date?.let {
        println("如果不为空执行这段")
    }

    println(transform("yellow"))

    drawCircle(myTurtle)

    //产生一个可能为空的布尔值
    val b: Boolean? = goo(-3)
    if (b == true){
        println("b为true")
    }else{
        //b为false或null
        println("b为false或null")
    }
}

//返回when判断
fun transform(color: String): Int {
    return when (color) {
        "red" -> 1
        "yellow" -> 2
        "green" -> 3
        else -> throw IllegalArgumentException("Invalid color param value.")
    }
}

//tray-catch表达式
fun test() {
    val result = try {
        transform("")
    } catch (e: ArithmeticException) {
        throw IllegalStateException(e)
    }
    //处理result
}


//if表达式
fun foo(param: Int) {
    val result = if (param == 1) {
        "one"
    } else if (param == 2) {
        "two"
    } else {
        "three"
    }

}

//方法使用生成器模式返回Unit
fun arrOfMinusOnes(size: Int): IntArray {
    return IntArray(size).apply { fill(-1) }
}

//只有一个表达式的函数
fun theAnswer() = 42

fun theanswer(): Int {
    return 42
}

//与when表达式结合
fun transform2(color: String): Int = when (color) {
    "red" -> 1
    "blue" -> 2
    else -> -1
}

//利用with调用一个对象实例的多个方法
class Turtle {
    fun penDown() {
        println("落笔")
    }

    fun penUp() {
        println("提笔")
    }

    fun turn(degrees: Double) {
        println("转向${degrees}度")
    }

    fun forward(pixels: Double) {
        println("画了${pixels}像素")
    }
}

val myTurtle = Turtle()
//with是一个逻辑块，必须定义一个方法来兜住它
fun drawCircle(a: Turtle) = with(a) {
    // 画一个100像素的正方形
    penDown()
    for (i in 1..4) {
        forward(100.0)
        turn(90.0)
    }
    penUp()
}

fun doo() {
    val stream = Files.newInputStream(Paths.get("/some/file.txt"))
    stream.buffered().reader().use { reader ->
        println(reader.readText())
    }
}

fun goo(i: Int): Boolean? {
    if (i > 0){
        return true
    }
    else{
        return null
    }
}