package Odev5

class QuestionsMark {

    fun QuestionsMarks(str: String): String {

        var result = "false"

        val digitIndexes = arrayListOf<Int>()

        if(str==""){
            return result
        }

        for (index in 0.. str.length-1) {
            if (str[index].isDigit()) {
                digitIndexes.add(index)
            }
        }

        for (i in digitIndexes) {
            for (y in digitIndexes) {
                if (i > y) continue
                if ((str[i].digitToInt() + str[y].digitToInt() != 10)) continue

                if (str.substring(i, y).count { it == '?' } >= 3) {
                    result = "true"
                }
            }
        }

        return result
    }
}