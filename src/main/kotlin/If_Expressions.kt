fun main() {
    val nilai = 45
    val hasil: String
    hasil = if (nilai >= 75) {
        "Selamat! Nilai kamu $nilai. Tuntas!"
    } else {
        "Yah.. Nilai kamu $nilai :(\nMinggu depan remidi."
    }

    println(hasil)
}