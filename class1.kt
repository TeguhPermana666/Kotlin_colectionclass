package collectionclass

data class DataUser(val name : String, val age : Int)// methode dijalankan secara api
class User (private val name : String, private val age :Int){//private brti hanya bisa diakses dalam satu class saja
    override fun toString(): String {//inheritence
        return "User(Name=$name , age=$age"
    }
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as User

        if (name != other.name) return false
        if (age != other.age) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + age
        return result
    }
}

fun main(){
    val datauser= DataUser("Teguh", 18)
    val user= User("TEGAR", 20)

    //data class akan otomatis menghasilkan toString() didalamnya
    //Kalau class harus dibuatkan inheritence tentang to String dalam kelas User
    println(datauser)
    println(user)

    //Equals pun sama
    val datauser2= DataUser("BABI", 18)
    println(datauser.equals(datauser2))

    val datauser3 = DataUser("BABI", 18)
    println(datauser2.equals(datauser3))

    val user1= User("Babi",20)
    val user2 = User("Babi",20)
    println(user1.equals(user2))

    //copy
    //->buat object dari data class
    var datacopi= DataUser("BAYU",22)
    val datacopi2= datacopi.copy()
    println(datacopi2)
    val datacopi3 = datacopi.copy(age=10)
    println(datacopi)//tidak direplace
    println(datacopi3)
}