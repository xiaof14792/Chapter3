package my.demo.kotlin.`class`

fun foo() {
    val adHoc = object {
        var x: Int = 0
        var y: Int = 0
    }

    print("adHoc.x = ${adHoc.x}, adHoc.y = ${adHoc.y}")
}

fun main(args: Array<String>) {
    foo()
}