fun fibonacci(n: Int): List<Int> {
    var a = 0
    var b = 1
    val d = mutableListOf(0, 1)
    
    if (n < 0) {
        println("Incorrect input")
    } else if (n == 0) {
        return listOf(a)
    } else if (n == 1) {
        return listOf(b)
    } else {
        for (i in 2..n) {
            val c = a + b
            a = b
            b = c
            if (b <= n) {
                d.add(b)
            }
        }
    }
    return d
}

fun main() {
    println(fibonacci(9))
}
