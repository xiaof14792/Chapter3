package my.demo.kotlin.basis

//break和continue标签
fun main(args: Array<String>) {
    loop@ for (i in 1..10) {
        //...

    }

    //可以用标签实现break和continue的快速跳转
    loop2@ for (i in 1..100) {
        for (j in i..100) {
            println("i = $i, j = $j")
            if (i == 2 && j == 5) {
                break@loop2 //可以利用标签跳过外面的循环
            }
        }
    }

    //返回到标签
    foo()

}


//返回到对应标签 return
val ints = intArrayOf(1, 2, 3, 4, 5, 6, 7)

fun foo() {
    ints.forEach {
        if (it == 3) return //return表达式返回到最近的闭合函数
        print("$it> ")
    }

    println("跳过闭合函数")
}

fun foo2() {
    ints.forEach lit@{
        if (it == 3) return@lit //从一个字面函数返回
        print("$it >")
    }

    println("跳过闭合函数？")
}

fun foo3() {
    ints.forEach {
        if (it == 3) return@forEach //从字面函数返回：使用和lambda表达式相同的标签
        print("$it>>")
    }

    println("跳过闭合函数？")
}

//我们可以用函数表达式替代匿名函数，在函数表达式中使用return可以从函数表达式中返回
fun foo4(){
    ints.forEach(fun(value: Int){
        if (value == 3) return
        print("$value 、")
    })

    println("跳过闭合函数？")
}


//命名函数自动定义标签
fun outer() {
    fun inner() {
        println("123")
        return
    }
    inner()
}


