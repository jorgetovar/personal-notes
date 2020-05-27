class CreditCard(private val cardNumber: Int) {

    fun charge(price: Int) {
        println("Web Service call! --> $$ price: $price and  card [$cardNumber]")
    }

}


class Charge(val cc: CreditCard, val price: Int) {

    fun combine(other: Charge): Charge {
        return Charge(cc, price + other.price)
    }

    fun pay(): Unit = cc.charge(price)

}


class User() {

    fun buyCoffee(cc: CreditCard): Pair<Coffee, Charge> {
        val cup = Coffee()
        return Pair(cup, Charge(cc, cup.price))
    }

    fun buyCoffees(cc: CreditCard, n: Int): Pair<List<Coffee>, Charge> {
        println("Request for $n coffees")

        val purchases = List(n) {
            buyCoffee(cc)
        }

        val (coffees, charges) = purchases.unzip()

        return Pair(coffees, charges.reduce { c1, c2 -> c1.combine(c2) })
    }

}

class Coffee() {
    val price: Int = 5000
}


println(User().buyCoffee(CreditCard(232332)))
val userCoffee = User().buyCoffees(CreditCard(232332), 10)
val second = userCoffee.second
println("Total charge is ${second.price}")
println("Coffees: ${userCoffee.first.size}")
// If I want the side effect
userCoffee.second.pay()
