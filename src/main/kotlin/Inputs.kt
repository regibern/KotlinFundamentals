import java.util.*

fun main(){
    println("What is your name?")
    val yourName = readLine()
    println("What is your year of birth?")
    val yourYearOfBirth = Integer.valueOf(readLine())

    println("$yourName is ${2021-yourYearOfBirth} years old")
}