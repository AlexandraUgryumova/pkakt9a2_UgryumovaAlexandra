import java.lang.Math
import java.lang.NumberFormatException
//23
fun main(){
    while(true) {
        try {
            println("введите количество углов")
            val n: Int = readln()!!.toInt()
            println("введите радиус описанного радиуса")
            val r: Double = readln()!!.toDouble()
            val p: Double = 2*n*r* java.lang.Math.tan(java.lang.Math.PI/n)
            println("периметр равен: " + p)
            break
        }
        catch (error: NumberFormatException){
            println("данные введены некорректно")
        }
    }
}