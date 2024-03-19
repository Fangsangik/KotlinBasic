package Lecture1

//기본 타입
//코틀린은 선언된 기본값을 보고 타입을 추론
//기본 타입간 변환은 명시적으로 이뤄져야 한다.
//더 큰 타입으로라도 암시적 타입 변경이 불가능

fun main() {
    val number1 = 3
    val number2: Long = number1.toLong() // to변환타입을 사용

    println(number1 + number2)

    val num1 = 3
    val num2 = 5
    val rst = num1 / num2.toDouble()

    println(rst)

    //변수가 nullable 이라면 적절한 처리가 필요
    //컴파일러 입장에서는 number3가 null일 수도 있는데 .을 찍으면 NPE
    //safeCall elvis 사용
    val number3 : Int? = 3
    val number4 : Long = number3?.toLong() ?: 0L;

    printAgeIfPerson1(null) //NPE
    printAgeIfPerson1(Person("" , 100)) //100이 정상적으로 출력

    val person = Person("황상익", 100)
    println("이름 : ${person.name}")

    val str = """
        ABC
        EFG
        ${person.name}
    """.trimIndent()
    println(str)

    var str1 = "ABC"
    println(str[0])
    println(str[3])
}

fun printAgeInfPerson(obj : Any) {
    if (obj is Person) {
        val person = obj as Person //obj를 person으로 간주하여  person 변수에 넣는다. (형변환) -> 생략 가능
        println(obj.age) // 스마트 캐스트 (if 문에서 타입 check)
        println(person.age)
    }

    if (obj !is Person) { //person이 아니라면
        val person = obj as Person
        println(obj.age)
    }
}

fun printAgeIfPerson1(obj: Any?){
    val person = obj as? Person
    //obj가 null이 아니라면 Person type으로 변환,
    //null 이라면 Safe Call 처럼 이 전체가 null
    println(person?.age) //null에 대한 safe Call은 null로 무시
}

/*
value is Type -> true (value == type)
value is Type -> false (value != type)

value !is Type -> false (value == type)
value !is Type -> true (value != type)

value as Type -> type으로 타입 캐스팅 (value == type)
value as Type -> 예외 (value != type)

안전한 타입 형 변환
value as? Type -> type으로 타입 캐스팅 (value == type)
value as? Type -> null (value == null)
value as? Type -> null (value != type)

Any (= 자바의 Object)
Java의 Object 역할 (모든 객체의 최상위 타입)
Primitive Type -> Any도 최상위 타입
Any 자체로는 null로 표현 X -> Any?로 표현
Any에 equals, hashCode, toString

Unit
java == void
void와 다르게 Unit은 그 자체로 타입 인자로 사용 가능
함수형 프로그래밍에서 Unit은 단 하나의 인스턴스만 갖는 타입을 의미, 즉 코틀린의 Unit은 실제 존재하는 타입이라는 것 표현

Nothing
함수가 정상적으로 끝나지 않았다는 사실 표현
무조건 예외를 반환하는 함수 / 무한 루프

String interpolation / String indexing
val log = "사람 이름은 ${person.name}, 나이는 ${person.age}
=> ${변수}를 사용하면 값이 들어간다

""""""을 사용하면 이렇게 사용 가능
 val str = """
        ABC
        EFG
        ${person.name}
    """.trimIndent()
    println(str)

특정 문자열 가져오기
  var str1 = "ABC"
    println(str[0])
    println(str[3])
 */