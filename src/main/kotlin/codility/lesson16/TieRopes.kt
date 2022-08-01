package codility.lesson16

/*
* Tie adjacent ropes to achieve the maximum number of ropes of length >= K.
* */
/**
 * Example: [ 1, 2, 3, 4, 1, 1, 3], Result => 3
 * */
fun tieRopes(k: Int, a: IntArray): Int {

    // notice that only "adjacent ropes" can be tied
    // so, the problem is simple; we can use "greedy" method
    var total = 0
    var currentLength = 0

    for (element in a) {
        currentLength += element
        if (currentLength >= k) {
            total++
            currentLength = 0 // update
        }
    }
    return total
}
