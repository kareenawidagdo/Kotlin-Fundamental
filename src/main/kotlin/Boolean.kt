fun main() {
    val nilai = 86
    val hasil = if (nilai > 90 && nilai <= 100) {
        'A'
    } else if (nilai > 80 && nilai <= 90) {
        'B'
    } else if (nilai > 70 && nilai <= 80) {
        'C'
    } else if (nilai > 60 && nilai <= 70) {
        'D'
    } else if (nilai >= 0 && nilai <= 60) {
        'E'
    } else {
        "Inputan Anda salah."
    }

    println("Skor Anda adalah $hasil")
}