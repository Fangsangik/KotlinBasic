package lecture2.lec_02

fun lec_02() {
    val num = listOf(1L, 2L, 3L)
    for (number in num) { //: 대신 in을 사용
        println(number)
    }

    for (i in 1..3) {
        println(i)
    }

    for (i in 3 downTo 1) {
        println(i)
    }

    for (i in 1..5 step 2) {
        println(i)
    }

    /*
    .. 연산자는 범위를 나타내는 연산자
    IntProgression <- IntRange (등차수열을 상속 받고 있다)
    등차수열의 경우 시작, 끝값, 증가하는 값

    downTo, step == 함수이다. (중위함수)
    변수.함수이름(argument) 대신
    면수 함수이름 argument

    1..5 step 2
    1 ~ 5까지 공차가 1인 등차수열 생성
    등차수열에 대한 함수 호출, 등차수열.step(2)

     */
}

fun while_1() {
    var i = 1 //i는 가변이 되기 때문에 val 대신 var 사용
    while (i <= 3) {
        println(i)
        i++
    }
}