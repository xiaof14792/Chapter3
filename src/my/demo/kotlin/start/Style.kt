package my.demo.kotlin.start

//冒号
//冒号区分类型和父类型中要有空格，在实例和类型之间是没有空格的
interface Foo<out T : Any> : Bar {
    fun foo(a: Int): T
}

interface Bar {

}

//lambda表达式
val aList = listOf(1, 3, 5, -2)

fun main(args: Array<String>) {
    aList.filter { it > 10 } //使用it
        .map { e -> e * 2 } //显示的声明参数
        .forEach { println(it) }
}

//类声明格式
class Person(id: Int, name: String)

open class Human(id: Int, name: String)

class Person2(
    id: Int,
    name: String,
    surname: String
) : Human(id, name),
    KotlinMaker {
    override fun go(): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}

interface KotlinMaker {
    fun go(): String
}

//如果函数返回Unit，返回类型应该省略
fun foo(){// "Unit"被省略类

}
