import Products.*
open class Textile (var summetr: Int, var colorfastness: String, var impregnation: String, empname: String, empprise: Int, empunits: String, emptype: String, empquantity: Int) : Product(empname, empprise,  empunits, emptype, empquantity){
    open fun Long(){
        println("ткань $name имеется в длине: $summetr $units")
    }
    open fun Characteristics(){
        println("выцветаемость: $colorfastness. Пропитка: $impregnation")
    }
}