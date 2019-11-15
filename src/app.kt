fun main(){
    println("Hola Mundo")
    println(sum(2,3))
println(sum1(4,5))

}
fun sum(a: Int, b: Int): Int{
    return a + b
}
fun sum1(c: Int, d: Int)= c +d
fun printSum(a: Int, b:Int): Unit{
    println("sum of $a and $b is ${a + b}")
}