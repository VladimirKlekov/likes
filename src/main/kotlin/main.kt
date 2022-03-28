fun main() {
    while (true) {
        println("Введите количество лайков: ")
        val likes = readln().toInt()
        if (likes %10 == 1 && likes %100 != 11 ) {
            println("Понравилось $likes человеку")
        } else {
            println("Понравилось $likes людям")

        }

    }
}