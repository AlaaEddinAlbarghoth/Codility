package codility.lesson7

import java.util.Stack

fun nesting(s: String): Int {

    when {
        s.isEmpty() -> return 1
        s.length % 2 == 1 -> return 0
    }

    val stack = Stack<Char>()

    for (i in s.indices) {
        when {
            s[i] == '(' -> stack.push(')')
            else -> {
                when {
                    stack.isEmpty() -> return 0
                    else -> {
                        stack.pop().let { char ->
                            if (char != ')') return 0
                        }
                    }
                }
            }
        }
    }

    return when {
        stack.isEmpty() -> 1
        else -> 0
    }
}
