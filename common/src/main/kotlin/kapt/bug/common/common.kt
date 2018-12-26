package kapt.bug.common

enum class TestEnum {
    A, B, C
}

class TestClass(private val p1: String) {
    override fun toString(): String {
        return "TestClass(p1='$p1')"
    }
}
