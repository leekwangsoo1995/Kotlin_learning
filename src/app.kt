
package ssample

fun  main(){
    val half = Rational(16,24)
    println(half);
}

class Rational(val n:Int , val d:Int){
    init{
        require(d != 0,{"denominator must not be null"})
    }
    private val g = gcd(Math.abs(n),Math.abs(d));
    val numerator: Int = n / g;
    val denominator: Int = d / g;
    override fun toString(): String = "${numerator}/${denominator}"
    tailrec private fun gcd(a:Int,b:Int): Int =
        if(b == 0)a
        else gcd(b, a%b)

}

