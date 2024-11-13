fun main() {
    println(Date(2006, month.June,27))
}

data class Date(
    var year: Int,
    var month: month,
    var day: Int
) {
    override fun toString(): String {
        return "$month/$day/$year"
    }
}

enum class month {
    January,
    February,
    March,
    April,
    May,
    June,
    July,
    August,
    September,
    October,
    November,
    December
}

