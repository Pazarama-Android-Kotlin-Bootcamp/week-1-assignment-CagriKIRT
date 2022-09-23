package Odev1

class UsernameValidation {

    fun usernameValidation(username: String): String {

        if (username.length < 4 || username.length > 25) {
            return "false"
        }
        if (!username[0].isLetter()) {
            return "false"
        }
        if (username.last() == '_') {
            return "false"
        }

        if (!username.all { it.isDigit() || it.isLetter() || it == '_' }) {
            return "false"
        }
        return "true"
    }
}