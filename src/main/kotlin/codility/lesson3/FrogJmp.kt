package codility.lesson3

/**
 * Example:  X = 10, Y = 85, D = 30 ==(Result)==> 3
 * */
/* Count minimal number of jumps from position X to Y. */
fun frogJmp(x: Int, y: Int, d: Int): Int {

    if (x < 1 || y < 1 || d < 1)
        throw Exception("X, Y, and D must be greater than zero")

    /* We need less complexity as we can */
    /* Simply you can calculate the number of hops by dividing the difference on distance,
    *  And you can check if there is a fraction to add 1 extra jump or not
    *  */

    /* Define difference variable to calculate the distance between x and y */
    val difference = y - x // difference
    var plus = 0 // extra step for fractions case

    if (difference % d != 0) // check if there is a fractions
        plus = 1 // if yes then add 1 jump

    var hop: Int = difference / d // jumps counter // number of jumps
    hop += plus // add the extra jump

    // print the number of jumps
    println("Jumps count is {$hop}")

    // return the number of jumps
    return hop
}