fun main() {
    val likes = 22
    val people = if (likes % 10 == 1 && likes != 11) "человеку" else "людям"
    println("Понравилось $likes $people")
}