package codility.lesson4

import codility.utils.printArray
import kotlin.math.max

/**
 * A[0] = 3, A[1] = 4, A[2] = 4, A[3] = 6, A[4] = 1, A[5] = 4, A[6] = 4 ==(Result)==>
 * */
/*
* Calculate the values of counters after applying all alternating operations: increase counter by 1; set value of all counters to current maximum.
* */
fun maxCounters(n: Int, a: IntArray): IntArray {

    // First Condition: increase(X) − counter X is increased by 1,
    // Second Condition: max counter − all counters are set to the maximum value of any counter.

    // We need it to manage assigning max counter to all counters in second condition
    var max = 0

    // We need simplify the complexity
    var min = 0

    // The result Array
    val resultArray = IntArray(n) { 0 }

    /* Our logic here */
    /* We need to loop over the (First Loop) */
    for (index in a.indices) {
        // Current element, I made it because it's more simple to type other than a[i]
        val currentElement = a[index]

        if (currentElement in 1..n) { // First Condition
            // Case of condition too, set all counters to max, we made it to simplify the complexity
            if (resultArray[currentElement - 1] < min)
                resultArray[currentElement - 1] = min
            resultArray[currentElement - 1]++ // First Condition
            max = max(max, resultArray[currentElement - 1])
        } else if (currentElement == (n + 1)) // Second Condition
            min = max
    }

    // Move the loop out of (First Loop)
    for (index in resultArray.indices)
        if (resultArray[index] < min)
            resultArray[index] = min

    // Print the result
    print("The result counters array is ")
    printArray(resultArray)

    return resultArray
}