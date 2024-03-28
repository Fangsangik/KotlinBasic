package lecture2.lec_03

import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.lang.NumberFormatException

fun try_catch(str: String): Int {
    try {
        return str.toInt() //parseInt
    } catch (e: NumberFormatException) {
        throw IllegalArgumentException("주어진 숫자가 아닙니다.")
    }

    //기본 타입의 형 변환은 toType()을 사용
    //포맷팅이 간결!
}

fun try_catch2 (str: String) : Int? {
    return try {
        str.toInt()
    } catch (e : NumberFormatException){
        null
    }

    //try도 expression 처럼 동작한다.
}

fun readFile(){
    val curFile = File(".")
    val file = File(curFile.absolutePath + "/a.txt")
    val reader = BufferedReader(FileReader(file))
    println(reader.readLine())
    reader.close()

    //exception이 발생함에도 불구하고 exception 처리 없이 사용
    //chekced Exception과 unchecked Exception을 구분하지 않는다.
    //모두 unchecked Exception 이다.
}


//Kotlin에서는 try with resources 구문 X
fun readFile2(path : String) {
   BufferedReader(FileReader(path)).use { //use 확장함수 사용
       reader ->
       println(reader.readLine())
   }
}