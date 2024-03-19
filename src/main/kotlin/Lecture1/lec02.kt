package Lecture1

import java.lang.IllegalArgumentException

//kotiln에서 null 다루기

//null이 들어 갈 수 없는 Boolean
fun startsWithA1(str : String?) : Boolean {
//    if (str == null) {
//        throw IllegalArgumentException("Null이 들어 왔습니다")
//    }
//    return str.startsWith("A");

    //safeCall
   return str?.startsWith("A")
       //elvis 연산자
        ?: throw IllegalArgumentException("Null")
}

//null이 들어 갈 수 있는 Boolean
fun startsWithA2(str : String?) : Boolean? {
//    if (str == null){
//        return null
//    }
//
//    return str.startsWith("A")

    return str?.startsWith("A")
    //null 일 경우 null을 반환
}

//null이 들어 갈 수 없는 Boolean
fun startsWithA3(str : String?) : Boolean {
//    if (str == null){
//        return false
//    }
//
//    return str.startsWith("A")

    return str?.startsWith("A") ?: false
}

//위에서 null 유무 판단 했다면 아래서 바로 호출 가능
//Kotiln에서는 null이 가능한 타입을 완전히 다르게 취급


//null이 가능한 타입
//Safe Call (안전한 호출)

fun main() {
    val str : String? = "ABC"

    // str.length -> 불가능
    str?.length //-> ?. 의미는 앞에 오는 변수가 null이 아니면, 뒤에 딸려오는 함수나 프로퍼티 실행 / 값 그대로 null
    println(str?.length)

    //Elvis 연산자
    str?.length ?: 0
    //str 앞이 null이면 null 아니면 3
    println(str?.length ?: 0)
    // 결과가 나옴
}

//early return
fun cal(number: Long?): Long {
    number ?: return 0
    return number
}


//널 아닌 단언
//nullable type 이지만 아무리 생각해도 null이 될 수 없는 경우
fun startsWith(str: String?) : Boolean {
    return str!!.startsWith("A") //!! null 절대 아니다
}

fun main2(){
    println(startsWith("ABC"))
    println(startsWith(null))
    //혹시나 null 들어오면 NPE 발생

}


//플랫폼 타입
//Kotiln에서 자바 코드를 가져다 사용하면 ?
fun main3(){
    val person = Person("공부하는 개발자", 50)
    startsWithA(person.name)
        //Person 클래스의 nullable로 인해 빨간줄 생김 (person.name)
        //nullable이 없거나, Notnull이 없다면, Exception 발생
        // => 코틀린이 null 관련 정보를 알 수 없다.
        //코틀린에서 자바 코드를 사용할때는 null 관련 정보를 상세히 작성
        //라이브러리를 열어서 null이 있는지 없는지 확인
        //최초에 코틀린 지점에서 자바 지점을 rapping 해서 단일 지점으로 형성
        //추후 issue 발생시 handling 가능
}

fun startsWithA(str: String) : Boolean {
    return str.startsWith("A") //여기 들어오는 값은 null아님
}
