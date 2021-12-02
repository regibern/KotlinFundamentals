fun main () {
    val myMessage = "Happy Birthday! Justin!"
    val anotherMessage = "Happy Birthday! Justin!"
    println(myMessage)

    println(myMessage.substring(16, 22))
    println(myMessage.compareTo(anotherMessage))

    println(myMessage.plus(anotherMessage))
    println(myMessage.subSequence(6, 22))
    println(myMessage.drop(16))
    println(myMessage.length)
    println(myMessage.dropLast(10))

    val givenName = "Reginald Joselito"
    val surName = "Bernabe"
    val middleName = "Penafiel"
    println("My full name is $givenName ${middleName.get(0)}. $surName")

    val myAge=0
    println("My age 10 yrs from now is ${myAge + 10}")

    val nickName = "regi"
    val product = 100
    val amount = 10
    println("${nickName.get(0).uppercase()}${nickName.drop(1)}, the amount you need to pay is ${product*amount}")
}
