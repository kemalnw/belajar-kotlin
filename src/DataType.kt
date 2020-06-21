fun main() {
    /* Char */
    val k: Char = 'k' // Hanya bisa satu karakter, dituliskan dengan petik satu
    val e: Char = 'e'
    val m: Char = 'm'

    print(k)
    print(e)
    print(m)
    println()


    /* String */
    var firstName: String = "Abdul" // Bisa multiple karakter, dituliskan dengan petik dua atau tiga
    var lastName: String = "Kemal"

    val lorem: String = """
        Lorem ipsum dolor sit amet, consectetur adipiscing elit, 
        sed do eiusmod tempor incididunt ut 
        labore et dolore magna aliqua
    """.trimIndent()

    println(firstName)
    println(lorem)

    /* String Template */
    val fullName: String = "$firstName $lastName"
    println(fullName)
    println("Panjang karakter dari variabel fullName: ${fullName.length}")


    /* Boolean */
    var benar: Boolean = true
    var salah: Boolean = false

    println(benar)
    print(salah)

    /* Number */
    val age: Int = 23
    println(age)

    val phi: Double = 3.14
    val phiInFloat: Float = 3.14F
    println(phi)
    println(phiInFloat)

    val price: Long = 10_000_000L
    println(price)

    /* Konversi Tipe Data */
    println(age.toByte())
    println(phi.toFloat())
    println(phiInFloat.toString())


    /* Array */
    val fruits: Array<String> = arrayOf("Banana", "Apple", "Mango", "Orange")
    fruits[1] = "mangosteen"
    println(fruits[1])

    var mixArray = arrayOf("Kemal", 354, null, true)
    println(mixArray[0])

    /* Range */
    val range = 1 .. 5
    val oneToTen = 1.rangeTo(10)
    val rangeStep = 1 .. 10 step 2
    val tenToOne = 10 downTo 1
    val downRange = 10.downTo(1) step 2

    println(range.count())
    println(rangeStep.step)
}