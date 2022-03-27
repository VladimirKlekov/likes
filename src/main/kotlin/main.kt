fun main() {
    while (true) {

        println("Введите количество лайков: ")
        val likes = readln().toInt()
        if (likes == 1 || likes == 21 || likes == 31 || likes == 41 || likes == 51 || likes == 61 || likes == 71
            || likes == 81 || likes == 91 || likes == 101 || likes == 121 || likes == 131 || likes == 141 || likes == 151 ||
            likes == 161 || likes == 171 || likes == 181 || likes == 191 || likes == 201 || likes == 221 || likes == 231
            || likes == 241 || likes == 251 || likes == 261 || likes == 271 || likes == 281 || likes == 291 ||
            likes == 301 || likes == 321 || likes == 331 || likes == 341 || likes == 351 || likes == 361 || likes == 371
            || likes == 381 || likes == 391 || likes == 401 || likes == 421 || likes == 431 || likes == 441 || likes == 451 ||
            likes == 461 || likes == 471 || likes == 481 || likes == 491 || likes == 501 || likes == 521 || likes == 531 ||
            likes == 541 || likes == 551 || likes == 561 || likes == 571 || likes == 581 || likes == 591
            //можно продолжать до бесконечности
        ) {
            println("Понравилось $likes человеку")
        } else {
            println("Понравилось $likes людям")

        }

    }
}