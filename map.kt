package collectionclass

fun main(){
    val capital = mapOf(
        "Jakarta" to "Indonesia",
        "Denpasar " to "Bali",
        "Bandung" to "Jawa Barat"
    )
    println(capital["Jakarta"])//kalau tidak terdapa di map dia akan menghasilkan nilai return 0
    println(capital.get("Jakarta"))//kalau tidak dia akan mereturn sebuah nilai exeception

    //penambahan map harus di mutable dulu
    val mutmap=capital.toMutableMap()//key-value
    mutmap.put("BABI","ANJING")
                //Key to map
    println(mutmap)

}