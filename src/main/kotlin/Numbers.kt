fun main() {
    val panjang = "20"
    val lebar = 12.6
    val tinggi = 10
    val volume: Double

    val p : Double = panjang.toDouble()
    val l : Double = lebar
    val t : Double = tinggi.toDouble()

    print(hitungVolume(p,l,t))
}

fun hitungVolume(p : Double, l : Double, t : Double) : String {
    val v = p * l * t
    val volume: Double = v
    return "Volume dari balok yang mempunyai panjang $p, lebar $l, dan tinggi $t ini adalah $volume"
}