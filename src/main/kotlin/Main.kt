import codility.lesson16.tieRopes
import codility.lesson17.numberSolitaire

fun main() {

    /* region Lesson1: Iterations */
    // binaryGap(1041)
    /* endregion */

    /* region Lesson2: Arrays */
    // cyclicRotation(intArrayOf(3, 8, 9, 7, 6), 3)

    // oddOccurrencesInArray(intArrayOf(9, 3, 9, 3, 9, 7, 9))
    /* endregion */

    /* region Complexity */
    //frogJmp(10, 85, 30)

    //missingElement(intArrayOf(2,3,1,5))

    //tapeEquilibrium(intArrayOf(3, 1, 2, 4, 3))
    /* endregion */

    /* region Counting Elements */
    //frogRiverOne(5, intArrayOf(1, 3, 1, 4, 2, 3, 5, 4))

    //permCheck(intArrayOf(4, 1, 3, 2))

    //maxCounters(5, intArrayOf(3,4,4,6,1,4,4))

    //println("Minimum value is ${missingInteger(intArrayOf(1, 2, 3))}")
    //println("Minimum value is ${missingInteger(intArrayOf(-1, -3))}")
    //println("Minimum value is ${missingInteger(intArrayOf(1, 3, 6, 4, 1, 2))}")
    /* endregion */

    /* region Prefix Sums */
    //println("Num of passed cars: " + passingCars(intArrayOf(0, 1, 0, 1, 1)))
    //println("Num of passed cars: " + passingCars(intArrayOf(1, 1,0,1,1,1,1,1,0,1)))

    //println("The number of integers within the range [A..B] is: " + countDiv(6, 11, 2))

    //println("genomicRangeQuery")
    //val array1 = intArrayOf(2, 5, 0)
    //val array2 = intArrayOf(4, 5, 6)
    //print("P : ")
    //printArray(array1)
    //print("Q : ")
    //printArray(array2)
    //printArray(genomicRangeQuerySol2("CAGCCTA", array1, array2))
    //printArray(genomicRangeQuerySol1("CAGCCTA", array1, array2))

    //val l = ArrayList<Int>()
    //for (i in 1..10)
    //    l.add(i)
    //for (i in 0..(l.size - 2)) {
    //    println(i)
    //}
    //println(
    //    "The starting position of the slice with the minimal average = "
    //            + minAvgTwoSlice(intArrayOf(4, 2, 2, 5, 1, 5, 8))
    //)
    /* endregion */

    /* region Sorting */
    //distinct(intArrayOf(2, 1, 1, 2, 3, 1))

    //println("Max product of three: " + maxProductOfThree(intArrayOf(-3, 1, 2, -2, 5, 6)))

    //println("Triangle result is : " + triangle(intArrayOf(10, 2, 5, 1, 8, 20)))
    //println("Triangle result is : " + triangle(intArrayOf(10, 50, 5, 1)))

    //val array = intArrayOf(1, 5, 2, 1, 4, 0)
    //print("Array = ")
    //printArray(array)
    //println("numberOfDiscIntersections = " + numberOfDiscIntersections(array))
    /* endregion */

    /* region Stack and Queues */
    //println("Brackets result is = " + brackets("{[()()]}"))
    //println("Brackets result is = " + brackets("([)()]"))
    //println("Brackets result is = " + brackets("(((((((((()))))))"))


    //val array1 = intArrayOf(4, 3, 2, 1, 5)
    //val array2 = intArrayOf(0, 1, 0, 0, 0)
    //println("Number of fish that will stay alive = " + fish(array1, array2))

    //println("Nesting result is = " + nesting("(()(())())"))
    //println("Nesting result is = " + nesting("(((((((((()))))))"))

    //println(
    //    "(Stone Wall) Minimum number of blocks needed here is = " +
    //            stoneWall(intArrayOf(8, 8, 5, 7, 9, 8, 7, 4, 8))
    //)
    /* endregion */

    /* region Lead */
    //println("The dominator is = " + dominator(intArrayOf(3, 4, 3, 2, 3, -1, 3, 3)))

    //println("The equiLeader count is = " + equiLeader(intArrayOf(4, 3, 4, 4, 4, 2)))

    //println("The maxProfit is = " + maxProfit(intArrayOf(23171, 21011, 21123, 21366, 21013, 21367)))

    //println("The MaxSliceSum is = " + maxSliceSum(intArrayOf(3, 2, -6, 4, 0)))

    //println("The MaxDoubleSliceSum is = " + maxDoubleSliceSum(intArrayOf(3, 2, 6, -1, 4, 5, -1, 2)))
    /* endregion */

    /* region Prime and composite numbers */
    //println("The Count of the factors is = " + countFactors(24))

    //println("The MinPerimeterRectangle is = " + minPerimeterRectangle(30)

    // println("The maximum number of blocks in A is = " + peeks(intArrayOf(1, 2, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2)))
    /* endregion */

    /* region Sieve of Eratosthenes */
//    println("The CountNonDivisible (sequence of integers representing the amount of non-divisors) is: ")
//    printArray(countNonDivisible(intArrayOf(3, 1, 2, 3, 6)))

//    println("The M elements specifying the consecutive answers to all the queries. is: ")
//    printArray(countSemiprimes(26, intArrayOf(1, 4, 16), intArrayOf(26, 10, 20)))
    /* endregion */

    /* region Euclidean algorithm */
//    println("The number of chocolates that you will eat is = " + chocolatesByNumbers(10, 4))
    /* endregion */

    /* region Fibonacci numbers */
//    val a = intArrayOf(4, 4, 5, 5, 1)
//    val b = intArrayOf(3, 2, 4, 3, 1)
//    println("The array consisting of ${a.size} integers specifying the consecutive answers: ")
//    printArray(ladder(a, b))

//    fibFrog(intArrayOf(0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0)).let {
//        if (it == -1)
//            println("The frog cannot reach the other side of the river")
//        else
//            println("The minimum number of jumps by which the frog can get to the other side of the river is = $it")
//    }

    /* endregion */


    /* region Binary Search Algorithm */
//    println("The minimal large sum = ${minMaxDivision(3, 5, intArrayOf(2, 1, 5, 1, 2, 2, 2))}")
    /* endregion */

    /* region */
//    println("The absolute distinct count is ${absDistinct(intArrayOf(-5, -3, -1, 0, 3, 6))}")

//    println("The number of distinct slices is ${countDistinctSlices(6, intArrayOf(3, 4, 5, 5, 2))}")

//    println("The number of triangular triplets in this array is ${countTriangles(intArrayOf(10, 2, 5, 1, 8, 12))}")
    /* endregion */

    /* region Greedy algorithms */
//    println(
//        "The number of triangular triplets in this array is ${
//            maxNonOverlappingSegments(
//                intArrayOf(1, 3, 7, 9, 9),
//                intArrayOf(5, 6, 8, 9, 10)
//            )
//        }"
//    )

    println(
        "The maximum number of ropes of length greater than or equal to 4 that can be created is ${
            tieRopes(
                4,
                intArrayOf(1, 2, 3, 4, 1, 1, 3)
            )
        }"
    )

    /* endregion */

    /* region Dynamic Programming */
    println(
        "The maximal result that can be achieved on the board represented by array A is ${
            numberSolitaire(
                intArrayOf(1, -2, 0, 9, -1, -2)
            )
        }"
    )
    /* endregion */
}
