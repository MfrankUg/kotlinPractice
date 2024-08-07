import java.lang.Math.*
import kotlin.math.abs
import kotlin.math.floor

// Practice of Kotlin Fundamentals
fun main() {
    // Write your code below ☀️

    // variable initialization
    val namePlayer: String

    // variable declaration
    namePlayer = "Rags"
    println(namePlayer)

    val typeTest = true
    // Declare your variable above ⬆️
    val landmark = "Statue of Liberty 🗽"
    println(landmark)

    println("${typeTest::class.simpleName}")
    // string concatenation
    val firstName = "Frank"
    val secondName = "Muhindo"
    println(firstName + " " + secondName)

    // math library

    val ceil = ceil(3.5)
    println(ceil)
    // Add your notes below
    // It returns the closest double value of a mathematical integer

    val sqrt = sqrt(25.0)
    println(sqrt)
    // Add your notes below

    val abs = abs(-20)
    println(abs)
    // Add your notes below
    // It returns the absolute value

    val floor = floor(6.9)
    println(floor)
    // Add your notes below
    // returns the closest value that is less than the mathematical integer

    println(pow(5.0, 3.0)) // 125.0
    // prints the power of a value
    // prints a random number between 0 - 1

    println(random())     // 0.3335735290527727


    // nested if condition
    var orbitsStar = true // Rule 1
    var hydrostaticEquilibrium = true // Rule 2
    var clearedOrbit = false // Rule 3

    // Write your code below

    if ((orbitsStar && hydrostaticEquilibrium) == true) {
        if (clearedOrbit) {
            println("Celestial body is a planet")
        }
        else {
            println("Celestial body is a dwarf planet.")
        }
    }
    // when try condition
    val wealth = "Rainy"

    when (wealth) {
        "Rainy" -> println("Wear sweater")
        "Sunny" -> println("Wear a Tie-shirt")
        else -> println("Invalid")
    }

    // Range in conditionals

    // using if
    var num = 5
    if (num in 1..10) {
        println("This value is between 1 and 10.")
    }

    //using Ranges with when
    var letter = 'c'

    when (letter) {
        in 'a'..'m' -> println("Letter is in 1st half of alphabet.")
        in 'n'..'z' -> println("Letter is in 2nd half of alphabet.")
        else -> println("Not a valid value")
    }

    // Using Range in if

    var sHU = 17000
    var pungency: String

    // Write your code below
    if (sHU in 0..699) {
        pungency = "very mild"
    }
    else if (sHU in 700..2999){
        pungency = "mild"
    }
    else if (sHU in 3000..24999){
        pungency = "moderate"
    }
    else if  (sHU in 25000..69999){
        pungency = "high"
    }
    else {
        pungency = "very high"
    }
    println("A pepper with $sHU Scoville Heat Units has a $pungency pungency.")

    // Practice on ListOf

    // Write your code below 🏊‍♀️
    val waterSports = listOf("Wind Surfing","Sailing","Swimming","Jet Skiing","Water Skiing")
    println(waterSports)
    val districtsInUg: List<String> =listOf("Kampala","Kasese","Kanungu","Masaka")
    println()
    println(districtsInUg)
    val favNum: List<Int> = listOf(1,2,3,4,5,6,7,9)
    println()
    println(favNum)

    val favLetters: List<Char> = listOf('A','B','C')
    println()
    println(favLetters)

    val favs: List<Any> = listOf("Father",1,'A')
    println()
    println(favs)

    // Handling mutable in listOf
    var openBroadwayShows = mutableListOf("The Lion King","Chicago","The Cher Show","Les Miserables")
    openBroadwayShows[2] ="Wicked"
    println(openBroadwayShows)
    println()
    var courseUnits = mutableListOf("Electronic","Fundamentals Of Ict","Microprocessor Tech","Workshop","Engineering Mathematics")
    courseUnits[0] = "Digital Electronics"
    println(courseUnits)

}

