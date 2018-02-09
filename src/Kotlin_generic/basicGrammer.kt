package Kotlin_generic

/**
 * Created by Administrator on 2018/2/9.
 */
fun sum(a:Int,b: Int):Int{
    return a+b
}

//自推导型函数
//fun sum(a: Int, b: Int) = a + b

fun main(args:Array<String>){
    val a: Int = 1; //立即赋值
    val b = 2; //b是自推导型
    val c: Int  // 没有初始化器时要指定类型
    c = sum(a,b);
    println(c)
}