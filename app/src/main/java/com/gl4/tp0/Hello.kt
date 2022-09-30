package com.gl4.tp0

import kotlin.math.abs

fun main(args: Array<String>) {
    println("Hello")

    val p = Point(1, 1);
    val q = Point(2, 2);

    arrayOf(Rectangle(), Rectangle(p = Point(2, 3)), Rectangle(q = Point(4, 5))).forEach {
        println(it.surface())
    }
}

fun distance(p: Point, q: Point): Int = (abs((p.x - q.x)) + abs((p.y - q.y)))

fun sayMyName(name: String) = " $name "

fun sum(a: Int, b: Int): Int = a + b;

fun sayHello(): String = "Hello"
