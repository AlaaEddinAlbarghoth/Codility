package codility.lesson12

/*
* There are N chocolates in a circle. Count the number of chocolates you will eat.
* */
/**
 * Example: N = 10 and M = 4. Result ==> 5
 * */
fun chocolatesByNumbers(n: Int, m: Int): Int {

    val list = ArrayList<Int>()

    var numChocolate = 1
    var currentNumber = 0
    list.add(currentNumber)

    while (true) {
        currentNumber = (currentNumber + m) % n
        if (list.contains(currentNumber))
            break
        else {
            numChocolate++
            list.add(currentNumber)
        }
    }

    return numChocolate
}
