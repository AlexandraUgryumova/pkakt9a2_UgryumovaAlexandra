package Products
open class Product (var name: String, var prise: Int, var units: String, var type: String,var quantity: Int){
    open fun ProductBaseInfo(){
        println("название товара: $name. Цена: $prise")
    }
    open fun ProductCharactes(){
        println("единицы измерения: $units. Вид товара: $type ")
    }
    open fun Sum(){
        println("Количество: $quantity")
    }
}