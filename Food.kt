abstract class Food(val name: String, var price: Double) {
    abstract fun cook(): String
}

class Burger(name: String, price: Double): Food(name, price){
    override fun cook(): String {
        return "Preparar la carne y los ingredientes para luego ponerlo sobre el pan"
    }
}

class Pizza(name: String, price: Double): Food(name, price){
    override fun cook(): String {
        return "Amasar la masa, colocarle los ingredientes y meterlo al horno"
    }
}

class IceCream(name: String, price: Double): Dessert, Food(name, price) {
    override fun cook(): String {
        return "Mezclar los ingredientes para vertir en un molde y enfriar a -20°C."
    }
    override fun eat(): String {
        return "Comer el helado con una cuchara."
    }
}

fun Food.discountPrice(discountPercentage: Double): Double {
    return price * (1 - (discountPercentage/100))
}
