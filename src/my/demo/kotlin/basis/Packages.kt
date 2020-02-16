package my.demo.kotlin.basis

//一个源文件从包声明开始


//默认导入
//许多包被默认导入到Kotlin文件中

//一些增强包会根据平台来决定是否导入


//import如果命名有冲突，可以使用as关键字局部重命名解决冲突
/*
import foo.Bar // Bar 可以使用
import bar.Bar as bBar // bBar 代表 'bar.Bar'
 */

//可见性
/*
-private means visible inside this class only (including all its members);//只在本文件内可见
-protected — same as private + visible in subclasses too;//本文件及子类中可见
-internal — any client inside this module who sees the declaring class sees its internal members;//只在同moudle内可见
-public — any client who sees the declaring class sees its public members.//默认，都可见
 */