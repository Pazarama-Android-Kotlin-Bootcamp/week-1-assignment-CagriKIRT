package Odev2

class SumArray {

    fun aVeryBigSum(input: Array<Int>): Long {

        var result: Long = 0
        input.forEach {
            result += it.toLong()
        }
        return result
    }
}