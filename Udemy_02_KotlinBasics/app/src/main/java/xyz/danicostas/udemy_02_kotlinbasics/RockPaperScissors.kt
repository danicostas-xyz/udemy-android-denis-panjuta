package xyz.danicostas.udemy_02_kotlinbasics

fun main() {

    var computerChoice = ""
    var myChoice = ""
    println("Rock, Paper or Scissors? Enter your choice!")
    myChoice = readln()

    val randomNumber = (1..3).random()

    if (randomNumber == 1) {
        computerChoice = "Rock"
    }

    if (randomNumber == 2) {
        computerChoice = "Paper"
    }

    if (randomNumber == 3) {
        computerChoice = "Scissors"
    }

    println("Computer choice: $computerChoice")

    if((myChoice.equals("Rock") &&  computerChoice.equals("Rock")) || (myChoice.equals("Paper") && computerChoice.equals("Paper")) || (myChoice.equals("Scissors") && computerChoice.equals("Scissors"))) {
        print("Draw")
    }

    if((myChoice.equals("Rock") &&  computerChoice.equals("Paper")) || (myChoice.equals("Paper") && computerChoice.equals("Scissors")) || (myChoice.equals("Scissors") && computerChoice.equals("Rock"))) {
        print("Computer Won")
    }

    if((myChoice.equals("Rock") &&  computerChoice.equals("Scissors")) || (myChoice.equals("Paper") && computerChoice.equals("Rock")) || (myChoice.equals("Scissors") && computerChoice.equals("Paper"))) {
        print("You won")
    }










}