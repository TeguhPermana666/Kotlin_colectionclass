package collectionclass

//eager dan lazy
// eager ->cek satu satu kayak tadi
//lazy di cek kalau diperlukan
fun main() {
    //eager evolution->horizontal big0 nya
    val list = (1..1000000).toList()
    list.filter { it %1000==0 }.map{it *2}.forEach { println(it) }

    println("\n\n\n\nVERTICAL EVOLUTION")
    //as sequence membuat program menjadi vertical lurus, jik satu tidak memenuhi filter maka tidak
    list.asSequence().filter { it %5 ==0 }.map { it*2 }.forEach { println(it) }

    //menggunakan standrad library yakni generatesequence
    println("\n\n\n\n\n")
    val sequence_number= generateSequence(1){it+1}.take(10)
    //sequence_number.take(10).forEach { println(it) }
    sequence_number.forEach { println(it) }

}

