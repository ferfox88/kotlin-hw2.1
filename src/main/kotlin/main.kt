fun main() {
    val input = 81222.34 // сумма для перевода

    val discountStart1 = 30000 // в копейках
    val discountStart2 = 7500000 // в копейках
    val discountStart3 = 15000000 // в копейках
    val fixFee1 = 35 // в рублях
    val fixFee2 = 0.75 // в %

    val amount = (input * 100).toInt()
    val fee = input * fixFee2 / 100
    val fee1 = (fee * 100).toInt()
    val rub = fee1 / 100
    val cop = fee1 % 100

    if (amount < discountStart1) {
        println("Комиссия: $fixFee1 рублей")
    } else if (amount >= discountStart1 && amount <= discountStart2) {
        println("Перевод без комиссии")
    } else if (amount > discountStart2 && amount <= discountStart3) {
        println("Комиссия: $rub руб. $cop коп.")
    } else {
        println("Перевод невозможен")
    }
}
