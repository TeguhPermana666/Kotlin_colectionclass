package collectionclass

fun main (){
    //filter or filternot =>ngambilnya bolean true/false setiap index collection
    val filterr= listOf(1,2,3,4,5,6,7,8,9,10)
    val genap = filterr.filter { it % 2 ==0 }//it itu indexing memory listof

    val ganjil = filterr.filterNot { it %2 !=0 }//dibalik anjir wkwk

    val ganjil2 = filterr.filterNot{it %2 ==0}

    println(genap)
    println(ganjil)
    println(ganjil2)

    //map=>membuat collection baru dari data collection lama
    val mapp= listOf(1,2,3,4,5,6,7,8,9,10)
    val mapgenap=mapp.map { it *2 }//it adalah indexing yang merepresentasikan data mapp
    println(mapgenap)

    //count=>menghitung jumla item yang ada pada collection
    val countt= listOf(1,2,3,4,5,6,7,8,9)
    val jumlah= countt.count()
    println(jumlah)

    val jumlah2=countt.count { it % 3==0 }//mengjitung jumlah nilai pada object countt yang berkelipatan 3
    println(jumlah2)
    //find ,firstOrnull, lastOrnull
    val cari = listOf(1,2,3,4,5,6,7,8,9,10)
    val find_cari= cari.find { it %2 ==1 }//dari depan index
    val frist_cari= cari.firstOrNull { it % 2 ==3 }//dari depan index
    val last_cari=cari.lastOrNull{it %2 ==1}//dari belakang index
    println("$find_cari $frist_cari $last_cari")

    val first= cari.first{it >5}
    val last = cari.last { it >5 }
    println ("$first $last")//tidak dtemuka dia akan menjadi execption beda dengan first of null atau last or null
    /*val exep = cari.first{it>10}
    println(exep)*/

    //sum
    val summ = cari.sum()
    println(summ)

    val naik = cari.sorted()
    val turun =cari.sortedDescending()



}