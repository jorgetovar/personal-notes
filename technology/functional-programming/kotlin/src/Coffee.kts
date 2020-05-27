class CreditCard(private val cardNumber: Int) {
    fun charge(price: Int) {
        println("Web Service call! --> $$ price: $price and  card [$cardNumber]")
    }
}


class User() {

    fun buyCoffee(cc: CreditCard): Coffee {
        val cup = Coffee()
        cc.charge(cup.price)
        return cup
    }

    fun buyCoffees(cc: CreditCard, n: Int): List<Coffee> {
        println("Request for $n coffees")
        val purchases = List(n) {
            val cup = Coffee()
            cc.charge(cup.price)
            cup
        }
        val total = purchases.map { it.price }.reduce { acc, v -> acc + v }
        println("total is $total")
        return purchases
    }

}

class Coffee() {
    val price: Int = 5000
}

println(User().buyCoffee(CreditCard(232332)))
val userCoffee = User().buyCoffees(CreditCard(232332), 10)
println("Coffees: ${userCoffee.size}")