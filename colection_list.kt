package collectionclass

//collection adalah suatu object yang dapat menyimpan beberapa object lainnya termasuk sebuah data class
/*
->list=>menyimpan banyak data menjadi satu object
->map=>collection degan akses nilai  key-value
->set=>menyimpan banyak data yang tidak boleh sama valuenya
 */
data class  dataclass(val nama:String, val nilai:Int)

fun main(){
//list->adalah imutable => tidak bisa dirubah
    //->dapat dirubah jika mengcall methode mutable
    val anylist1 = listOf<Int>(1,2,3,4,5)//listof 1 tipe data
    println(anylist1)

    val anylist2 = listOf(1,2,true,"KONTOL", dataclass("teguh",10))
    println(anylist2)

    val anymutable= mutableListOf('a',"TEGUH",10,true)
    anymutable.add(0,'A')//replace
    anymutable.add(false)
    anymutable[1]="TEGAR"//menyisipkan
    anymutable.removeAt(3)//hapus

    println(anymutable)

}