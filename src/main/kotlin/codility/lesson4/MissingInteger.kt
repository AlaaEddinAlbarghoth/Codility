package codility.lesson4

/**
 * A = [1, 3, 6, 4, 1, 2] ==(Result)==> 5.
 * */
/* Find the smallest positive integer that does not occur in a given sequence. */
fun missingInteger(a: IntArray): Int {

    // Add all array elements to an array list
    val list = arrayListOf<Int>()

    // In case zero elements, return smallest positive integer, which is 1
    if (a.isEmpty())
        return 1

    // Fill the list to get array list functionalities
    for (element in a)
        list.add(element)

    for (i in 1 until a.size) {
        if (!list.contains(i))
            return i
    }

    return a.size + 1
}
