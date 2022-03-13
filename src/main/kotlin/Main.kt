const val PRICE = 100_00
fun main() {
    val musicLover = false
    var lastBuy = 0
    var trekSum: Int
    while (true) {
        println("Введите количество треков для покупки")
        while (true) {
            try {
                trekSum = (readLine()?.toInt() ?: return)
                if (trekSum < 0) error(0)
                break
            } catch (e: Exception) {
                println("Ошибка ввода, попробуйте еще раз")
            }
        }
        var totalPrice = trekSum * PRICE
        when (lastBuy) {
            in 10001_00..Int.MAX_VALUE -> totalPrice = (totalPrice-totalPrice * 0.05).toInt()
            in 1001_00..10000_00 -> totalPrice -= 100_00
        }
        totalPrice = if (musicLover == true) (totalPrice-totalPrice * 0.01).toInt() else totalPrice
        lastBuy = totalPrice
        println("Cумма покупки " + totalPrice / 100 + ".руб " + totalPrice % 100 + "коп.")
    }
}
