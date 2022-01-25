package collectionclass
data class Datauser (val Nama:String, val age:Number)

data class  Datauser2(val Nama: String, val age:Int){
    fun intro(){
        println("$Nama, $age")
    }
}
fun main() {
//CARA 1
    //creating object
    val datauser1= Datauser("ASU",20)

    //Destruction -> memetakan object ke variabel sesuai properti object

    val var1= datauser1.component1()
    val var2=datauser1.component2()

    println(var1)
    println(var2)

//CARA2
    //creating object
    val datafun = Datauser2("BABI",30)
    datafun.intro()

//CARA3
    val (nama,age)= datauser1
    //  com1  com2
    println("$nama,$age")
}