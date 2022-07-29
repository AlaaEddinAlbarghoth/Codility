package codility.lesson13

import codility.utils.printArray
import java.awt.Point

/*
* Count the minimum number of jumps required for a frog to get to the other side of a river.
* */
/**
 * Example:
 *   [0 ,0 ,0 ,1 ,1 ,0 ,1 ,0 ,0 ,0, 0], Result ==> 3
 * */
fun fibFrog(a: IntArray): Int {

    val fibonacci = ArrayList<Int>()
    fibonacci.add(0)  // note: f(0) = 0 (as in the question)
    fibonacci.add(1)

    // note: using "while" is better than "for" (avoid errors)
    while (true) {
        val temp1 = fibonacci[fibonacci.size - 1]
        val temp2 = fibonacci[fibonacci.size - 2]
        fibonacci.add(temp1 + temp2)

        if (temp1 + temp2 > a.size) break
    }

    // use "queue" with "point"
    // point(x,y) = point("position", "number of steps")
    val queue = ArrayList<Point>()
    queue.add(Point(-1, 0))
    println("point => -1, 0")
    printArray(a)

    // index: the current index for queue element
    var index = 0
    while (true) {

        // cannot take element from queue anymore
        if (index == queue.size)
            return -1
        println("size => " + queue.size)

        // take element from queue
        val current = queue[index]
        println("current => x= ${current.x}, y= ${current.y}")

        // from big to small
        for (n in fibonacci) {
            val nextPosition = current.x + n
            println("nextPosition => $nextPosition")

            // case 1: "reach the other side"
            // return the number of steps
            if (nextPosition == a.size)
                return current.y + 1
            else if (nextPosition > a.size || nextPosition < 0 || a[nextPosition] == 0) {
                // note: do nothing
            } else {
                // jump to next position, and step+1
                val temp = Point(nextPosition, current.y + 1)
                // add to queue
                queue.add(temp)
                println("Add to queue point => x= ${temp.x}, y= ${temp.y}")
                a[nextPosition] = 0 // key point: for high performance~!!
                printArray(a)
            }
        }

        index++ // take "next element" from queue
    }
}
