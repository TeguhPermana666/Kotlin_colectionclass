package collectionclass

fun main (){
    val set1 = setOf(1,2,1,2,3,4,5,4,5)
    println(set1)
    //yang duplicate tidak akan dimasukan dalam satu set
    val set2 = mutableSetOf(1,2,"ASU",false)
    println(set2)

    //set2.add(6)
    set2.remove(0)
    println(set2)

    val setA= setOf<Int>(1,2,3,4,5)
    val setB= setOf<Int>(2,1,2,3,3,4,4,5,5,5,1)
    println(setB)
    println(setA==setB)//dilihat valuenya

    val setC= setOf<Int>(6,7,9)
    val union = setC.union(setA)
    println(union)

    val interesct= setC.intersect(setA)
    println(interesct)



}