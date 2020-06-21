// Variabel constant wajib menggunakan val dan berada di luar dari scope local
const val VERSION = "1.0.0"

fun main() {
    /*
    *  - Format dalam pendeklarasian variable pada Kotlin
    *      var/val namaVariable: TipeData = value
    *  - Style yang digunakan dalam penamaan sebuah variable cameCase
    *  - Tipe data tidak wajib di tuliskan secara eksplisit saat deklarasi
    */

    // Mutable Variable (Bisa berubah)
    var bisaBerubah: String = "Hello world!"
    bisaBerubah = "Hello Kotlin!"

    var firstName = "Abdul"

    // Immutable Variable (Tidak bisa berubah)
    val tidakBerubah = "Kotlin is Awesome!"
    //  tidakBerubah = "Val tidak bisa berubah" // Error

    // Nullable Variabel
    var name: String? = null

    println(name?.length) // null safety
    println(name ?: "Nilai Default") // elvis operator untuk memberi nilai default ketika variable bernilai null
    name = "Kemal"
    println(name)

    // Constant Variable
    println("$VERSION")
}