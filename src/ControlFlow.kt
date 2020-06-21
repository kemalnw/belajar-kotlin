fun main() {
    /* If Expression */
    val nilai = 90
    if (nilai > 90) {
        println("Excellent!")
    } else if (nilai > 70){
        println("Good Job!")
    } else if (nilai > 60) {
        println("Not Bad")
    } else {
        println("Opps..")
    }

    val sayHello = "Hello"
    if (sayHello is String) {
        println("Variable is String")
    }
    val ranges = 1..5
    if (4 in ranges) {
        println("4 is in ranges")
    }
    val openOffice = 8
    val now = 9
    val office = if (now > openOffice) "Office already open" else "Office still closed"
    println(office)

    /* When Expression */
    val value = 7
    when(value) {
        5 -> println("Value is 5")
        6 -> println("Value is 6")
        7 -> println("Value is 7")
    }

    val nilaiLulus = arrayOf("A", "AB", "B")
    val nilaiSiswa = "A"
    when(nilaiSiswa) {
        in nilaiLulus -> println("Congrats!")
        !in nilaiLulus -> println("Sorry..")
    }

    /* While Loop */
    var counter = 0
    while (counter < 5) {
        println("Hello")
        counter++
    }

    var i = 0
    do {
        println("Kotlin Awesome")
        i++
    } while (i < 5)

    /* For Loop */
    for (i in 1..5 step 2){
        println("value is $i!")
    }

    val fruits: Array<String> = arrayOf("Banana", "Apple", "Mango", "Orange")
    for (buah in fruits) {
        println(buah)
    }

    /* Label */
    loop@ for (i in 1..4) {
        println("Outside Loop")

        for (j in 1..3) {
            println("Inside Loop")
            if ( j > 2) break@loop
        }
    }
}