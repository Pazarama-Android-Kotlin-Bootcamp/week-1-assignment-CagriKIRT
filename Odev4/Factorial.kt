package Odev4

class Factorial {

    fun FirstFactorial(num: Int): Long {
        var result:Long = 1
        for (x in 1..num) {
            result *= x

        }
        return result

    }

}