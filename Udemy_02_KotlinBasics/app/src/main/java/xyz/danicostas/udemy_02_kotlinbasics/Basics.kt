package xyz.danicostas.udemy_02_kotlinbasics

fun main() {

    /*
    En Kotlin, la diferencia entre val y var está en la mutabilidad:
    val: Es una referencia inmutable, similar a una constante en otros lenguajes. No puedes reasignar un valor a una variable declarada con val después de haberle asignado uno. Nota importante: el contenido de lo que apunta el val puede ser mutable si es un objeto mutable (como una lista).

    val name = "Dani"
    name = "Juan" // Error: Val cannot be reassigned

    Sin embargo, si el contenido del objeto es mutable, puedes modificarlo:

    val numbers = mutableListOf(1, 2, 3)
    numbers.add(4) // Esto funciona porque la lista es mutable

    var: Es una referencia mutable, lo que significa que puedes reasignar un nuevo valor a la variable.

    var age = 28
    age = 29 // Esto funciona

    ¿Cuándo usar cada uno?

    Usa val siempre que sea posible. Esto ayuda a evitar errores al hacer que las variables sean inmutables y facilita el mantenimiento del código.
    Usa var solo cuando necesites cambiar el valor de la variable durante su ciclo de vida.

    Si vienes de Java, piensa en val como final y en var como una variable normal. Aunque Kotlin promueve un enfoque más funcional, con preferencia por la inmutabilidad (val), tienes la flexibilidad de usar var cuando sea necesario.
     */

    val number1 = 1
    // number1 = 2 (you can't reassign values to a val)

    var myAge : Byte = 28
    println(myAge)
    myAge = 29
    println(myAge)

    println("---")

    val pi = 3.141592654f // Te deja definir el dato como float, pero te avisa de que no va a caber en un float por la profundidad de bits.
    println(pi) // Aquí imprime una aproximación 3.1415927

    var pi2 = 3.141592654 // Si no pones la f, se infiere que es un Double
    println(pi2)

    // UNSIGNED NUMBERS (the same amount of numbers than in a regular number type (Byte, Short, Int, etc.) but only with 0 and positive numbers. No negative numbers allowed for Unsigned Numbers. Note that you have to put the letter u at the end of the number for the compiler to know.

    var age : UByte = 28u

    // BOOLEANS
    val myTrue = true;
    val myFalse = false;
    val booleanNull: Boolean? = null; // Para que sea nulleable, hay que declararlo con el símbolo ? después del tipo que quieras que sea nulleable

    println(myTrue || myFalse)
    println(myTrue && myFalse)
    println(!myTrue)

    // CHARACTERS
    val myChar = 'a'
    val myCharUnicode = '\u00AE' // ® in Unicode

    println(myCharUnicode)


}