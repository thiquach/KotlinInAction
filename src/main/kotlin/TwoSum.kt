package main.kotlin

fun main () {
    val arrays = arrayOf(2,7,11,15)
    val target = 9
    val result = twoSum(arrays, target)
    println("twoSum result: [${result[0]}, ${result[1]}]")
}

fun twoSum(arrays: Array<Int>, target: Int) : Array<Int> {
    val result = arrayOf(0,0)
    for (i in arrays.indices) {
        for (j in i + 1 until arrays.size)
            if (arrays[i]+arrays[j] == target) {
                result[0] = i
                result[1] = j
                return result
            }
    }
    return result
}
