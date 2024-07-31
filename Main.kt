fun main(){
    val burger = Burger("Cheeseburger", 45.0)
    val pizza = Pizza("Hawaiana", 88.0)
    val iceCream = IceCream("SeaSalt Caramel IceCream", 15.0)
    val juice = Juice("Grape Juice", 19.0)

    //Imprimir info de las comidas
    println("El ${burger.name} cuesta Q.${burger.price} y se cocina así: ${burger.cook()}")
    println("La ${pizza.name} cuesta Q.${pizza.price} y se cocina así: ${pizza.cook()}")
    println("El ${iceCream.name} cuesta Q.${iceCream.price} y se cocina así: ${iceCream.cook()}")
    println("El ${juice.name} cuesta Q.${juice.price} y se cocina así: ${juice.cook()} y ${juice.pour()}")

    //Usar funcion eat
    println("-----------------")
    println(iceCream.eat())
    println("-----------------")

    // Calcular e imprimir el precio con descuento de la hamburguesa
    val descuento = 15.0 //
    println("El precio de la ${burger.name} con ${descuento}% de descuento es Q.${burger.discountPrice(descuento)}")
}
