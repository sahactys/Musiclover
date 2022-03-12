const val PRICE = 10000.0
fun main() {
    val musicLover = true
    var lastBuy: Double = 0.0
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
        var sum: Double = trekSum * PRICE
        when (lastBuy) {
            in 1000100.0..Double.MAX_VALUE -> sum *= 0.05
            in 100100.0..10000.0 -> sum -= 10000
        }
        sum = if (musicLover == true) sum * 0.01 else sum
        lastBuy = sum / 100
        println("Cумма покупки $lastBuy")
    }
}
/// TODO: 12.03.2022 перевести все в инт в копейках тожесамое сделать в money transfer  