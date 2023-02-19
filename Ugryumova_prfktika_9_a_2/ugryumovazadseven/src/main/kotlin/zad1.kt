//3
fun main(){
    println("ведите первый член прогрессии")
    val k: Double = readLine()!!.toDouble()
    println("введите знаменатель прогрессии")
    val q: Double = readLine()!!.toDouble()
    println("введите количество чисел в прогрессии")
    val n: Int = readLine()!!.toInt()
    val sum: Double
    val qn: Double
    if(q!= 1.0){
        if(q>0){
            qn = Math.exp(Math.log10(q)*n)
            sum = k *(1-qn)/(1-q)
            println("сумма прогрмессии = " + sum)
        }
        else{
            if(q<0){
                qn = -Math.exp(Math.log10(q)*n)
                sum = k *(1-qn)/(1-q)
                println("сумма прогрмессии = " + sum)
            }
        }
    }
    else{
        sum = n*k
        println("сумма прогрмессии = " + sum)
    }
}