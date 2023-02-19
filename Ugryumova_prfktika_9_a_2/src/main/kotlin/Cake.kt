import Products.*
class Cake (var gramm: Int, var cream: String, empname: String, empprise: Int, empunits: String, emptype: String, empquantity: Int) : Product(empname, empprise,  empunits, emptype, empquantity){
    open fun Wright(){
        println("$name весит $gramm $units")
    }
    open fun Filling(){
        println("торт $name $type и имеет $cream крем")
    }
}