package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoApplication

fun main(args: Array<String>) {
    runApplication<DemoApplication>(*args)

    println(max(1, 2))
    val name = if (args.size > 0) args[0] else "Kotlin"
    println("Hello, $name")

    val person = Person("Bob", true)
    println(person.name)

    val rectangle = Rectangle(50, 50)
    println(rectangle.isSquare)

    println(Color.RED.rgb())

    println(mix(Color.RED, Color.YELLOW))
}

/* 블록이 본문인 함수, 반드시 반환 타입을 지정하고 return 문을 사용해 반환 값을 명시해야 한다.
fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}
*/

//식이 본문인 함수
//fun max(a: Int, b: Int): Int = if (a > b) a else b

//반환 타입을 생략할 수도 있음, 타입 추론(type inference), 식이 본문인 함수의 반환 타입만 생략 가능
fun max(a: Int, b: Int) = if (a > b) a else b

fun getMnemonic(color: Color) =
        when (color) {
            Color.RED -> "Richard"
            Color.YELLOW -> "Test"
            Color.ORANGE -> "Of"
        }

fun mix(c1: Color, c2: Color) =
        when (setOf(c1, c2)) {
            setOf(Color.RED, Color.YELLOW) -> Color.ORANGE
            else -> throw Exception("Dirty color")
        }