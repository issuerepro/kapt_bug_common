package kapt.bug.backend

import kapt.bug.common.TestClass
import kapt.bug.common.TestEnum

fun main(args: Array<String>) {

    TestEnum.values().forEach { println(it) }

    println(TestClass("peng"))

}
