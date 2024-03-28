package lecture2.lec_01

fun IF_01(score: Int) { //함수에서 Unit(void) 생략
    if (score < 0) {
        throw IllegalArgumentException("${score}는 0보다 작을 수 없다")
    }

    if (score !in 0..100) {
        throw IllegalArgumentException("score 범위는 0부터 100")
    }

    if (score in 0..100) {

    }
}


fun elseIf(score: Int): String {
    if (score >= 50) {
        return "p"
    } else {
        return "F"
    }
}
/*
자바에서 if-else는 statement, kotlin 에서는 expression
Statement : 프로그램의 문장, 하나의 값으로 도출되지 않는다.
Expression : 하나의 값으로 도출 되는 문장

따라서 코틀린의 경우 3항 연산자가 필요 없다.
 */


//Kotlin이 expression이라는 것을 보여준다
fun elseIf_1(score: Int): String {
    return if (score >= 50) {
        "p"
    } else {
        "F"
    }
}

fun elseIfelseIf(score: Int): String {
    return if (score >= 90) {
        "A"
    } else if (score >= 80) {
        "B"
    } else if (score >= 70) {
        "C"
    } else {
        "D"
    }
}

//switch 대신 when이 들어감
fun switch_case(score: Int): String {
    return when (score / 10) {
        9 -> "A"
        8 -> "B"
        7 -> "C"
        else -> "D"
    }
}

fun switch_case1(score: Int): String {
    return when (score) {
        in 90..99 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
}

/*
when(값) {
   조건부 -> 어떤 구문
   조건부 -> 어떤 구문
   조건부 -> 어떤 구문
   else -> 어떤 구문
}

조건부에는 어떤 expression이라도 들어갈 수 있다. (ex is Type) == 자바에서의 instance of

 값 자체가 존재하지 않을 수도 있다.

 when의 경우 Enum class 혹은 Sealed Class와 함꼐 사용할 경우 더우더 진가를 발휘한다.
 */

fun startsWithA (obj : Any) : Boolean {
    return when (obj) {
        is  String -> obj.startsWith("A")
        else -> false
    }
}

fun judgeNum(number : Int) {
    when(number) {
        1, 0, -1 -> println("어디서 많이 본 숫자")
        else -> println("1, 0, -1이 아님")
    }
}

fun judgeNum2(number : Int) {
    when {
        number == 0 -> println("주어진 숫자는 0")
        number % 2 == 0 -> println("주어진 숫자는 짝수")
        else -> println("주어진 숫자는 홀수")
    }
}


