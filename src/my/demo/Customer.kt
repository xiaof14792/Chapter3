package my.demo

//创建DTOs数据类
data class Customer(val name: String, val email: String)

fun main(args: Array<String>) {
    val customer: Customer = Customer("Bob", "Bob@zerophil.com")
    println("name:" + customer.name)
    println(map[3])

    //遍历map
    for((k, v) in map){

    }

    //使用ranges
    for (x in 1 until 100){

    }

    for (x in 10 downTo  0){

    }

    val a:Int = 4;
    if (a in 1 until 10){

    }

    //只读list
    val list = listOf<Int>(1, 2)

    //只读map
    var map = mapOf('a' to 1, 'b' to 3, "c" to 5)

    //访问map
    println(map['b'])


    //拓展函数
    fun String.spaceToCamelCase(){
        println("这简单的话语to camel case")
    }

    "Convert this to camel case".spaceToCamelCase()

}

//函数默认值
fun foo(a: Int = 0, b: String = ""){

}

//过滤list
val list = listOf(1, 2, 5)
val positivers = list.filter { x -> x > 0 }

val positivers2 = list.filter { it > 0 }

//遍历map/list
val map = mapOf(Pair(1, "a"), Pair(2,"b"), Pair(3,"chonghua"))
