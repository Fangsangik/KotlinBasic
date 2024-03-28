package lecture1

//코틀린에서 연산자를 다루는 방법

fun main() {
    val money1 = JavaMoney(2000L)
    val money2 = money1
    val money3 = JavaMoney(2000L)

    if (money1 > money2) {
        //객체를 비교할때 비교 연산자를 사용할 수 있는데,
        //자동으로 comapreTo가 들어간다.
        println("money1 > money2")
    }

    println(money1 === money2)
    println(money1 == money3)

    if (fun1() || fun2()){
        println("본문 실행 ")
    }

    if (fun1() && fun2()){
        println("본문 실행 ")
    }

    val mon1 = Money(1000)
    val mon2 = Money(2000)
    println(mon1 + mon2)
}

fun fun1(): Boolean {
    println("fun 1")
    return true
}

fun fun2(): Boolean {
    println("fun 2")
    return false
}

/*
동등성 : 두 객체의 값이 같은가?
동일성 : 완전히 동일한 객체인가? 주소가 같은가?

코틀린에서 동일성에 === 동등성에는 == 호출

&& || ! 자바와 동일 -> lazy 연산을 실행

코틀린 특이한 연산자
in / !in
컬렉션 범위나 포함되어 있다. 포함 되어 있지 않다

a..b
a부터 b까지의 범위 객체를 생성

a[i]
a에서 특정 index i로 값을 가져온다

a[i] = b
a의 특정 index i에 b를 넣는다

코틀린에서는 객체마다 연산자를 직접 정의
 */