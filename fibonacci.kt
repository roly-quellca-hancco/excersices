/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */

//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597
fun main() {
    val fibonacci = Array(20) { 0 } // Cambié a 20 para incluir más elementos
    fibonacci[0] = 0
    fibonacci[1] = 1

    for (i in 2 until fibonacci.size) {
        fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2]
    }

    fibonacci.forEach { print("$it ") }
}