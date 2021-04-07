import MyInterface as MyInterface

fun main(args: Array<String>) {
    println("Hello World!")
    val b=1;
    println(b);
    for (i in 1..4) print("循环："+i+" ") // 输出“1234”
    println();

    val c = MyInterfaceImpl();
    c.bar();
    c.foo();
}