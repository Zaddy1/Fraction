fun main() {
    val f1 = Fraction(27,81)
    val f2 = Fraction(39,65)
    val f3 = Fraction(68,102)
// SHEKVECA(RTULI IYO)
    println(f1.cut())
    println(f2.cut())
    println(f3.cut())
// GAMRAVLEBA (martlac rom unda gavmravldet)
    println("_____")
    println(f1.multication(f3))
    println(f1.multication(f2))
    println(f2.multication(f3))
// MIMATEBA (RTULI IYO MIMATEBAC)
    println("____")
    println(f1.addition(f2))
    println(f1.addition(f3))
    println(f2.addition(f3))
}

class Fraction(private var numerator: Int, private var denominator: Int) {
    fun cut():String{
        //(ZEDA-MRICXVELI, QVEDA-MNISHVNELI)
        var zeda:Int = numerator
        var qveda:Int = denominator
        for (i in 2 .. zeda){
            while (zeda%i==0 && qveda%i==0){
                zeda /= i
                qveda /= i
            }
        }
        return "$zeda / $qveda"
    }

    fun multication(kargi:Fraction): String {
// GAMRAVLEBEBIS KODEBI VAWARMOE DA BOLOS CUTIS FUNQCIIT SHEVKVECE RO AR SHEVKVECO ZUST RICXVEBS ITVLIS MAINC,
// TT-GADAMRAVLEBIS SHEDEGAD MIGHEBULI DIDI RICXVEBI
        val a : Int = numerator*kargi.numerator
        val b : Int = denominator*kargi.denominator
        var tt = Fraction(a,b)
        return  tt.cut()
    }

    fun addition(cudi:Fraction):String {
// (C-PIRVELI WILADIS MRICXVELI, D-PIRVELI WILADIS MNISHVNELI, M-MEORE WILADIS MRICXVELI, N- MEORE WILADIS MNISHVNELI,
// SAWYISI-PIRVELI WILADIS SAWYISI MNISHVNELI, PP-SHEKREBA MRICXVELEBIS, LL-SABOLOO PASUXI, BOLOS CUTIS FUNQCIIT SHEVKVECE)
        var c:Int = numerator
        var d:Int = denominator
        var m:Int = cudi.numerator
        var n:Int = cudi.denominator
        val sawyisi:Int = denominator
        if (denominator!=cudi.denominator){
            c*=n
            d*=n
            m*=sawyisi
            n*=sawyisi
        }
        var pp :Int = c+m
        var ll = Fraction(pp, n)
        return ll.cut()
    }

}

