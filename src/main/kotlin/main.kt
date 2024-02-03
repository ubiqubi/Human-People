fun main() {
    val likes = 40

    if (likes % 10 == 1 && likes % 100 != 11) {
        println("понравилось $likes человеку")
    } else {
        println("понравилось $likes людям")
    }
}