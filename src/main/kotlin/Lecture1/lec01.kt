package Lecture1

fun main(){
    var number1 = 10L //값을 변경 할 수 있고
    number1 = 20L


    val number2 = 10L //값을 변경 할 수 없고
    //number2 = 20L 변경 X

    var number: Int = 20;

    //초기값 지정X ?
    //아직 값 넣지 않았기 때문에 compiler가 추론 하지 X
    var number3 : Long = 3;
    println(number3)

    //val의 경우 초기화 하지 않은 상태에서 한번은 값을 따로 지정 가능
    val number4 : Int
    number4 = 20;
    println(number4)

    //val 컬랙션에는 element를 추가 할 수 있다.

    //TIP
    //모든 변수는 우선 val로 형성, 꼭 필요한 경우에 var로 변경


    //Primitive Type

    //자바에서는 long primitive type Long reference Type
    //둘은 다르게 구분
    //연산을 할때 reference Type은 지양 (boxing & unBoxing) => 불필요한 객체 생성

    //kotiln에서는 연산을 하게 될 경우 알아서 내부적으로 primitive type으로 변경
    //프로그래머가 boxing/ unboxing 고려 X -> 알아서 처리
    var num1 = 10L
    var num3 = 1000L


    //nullable
    //null이 들어갈 수 있는 것을 다르게 간주
    var num2 = 1000L
    //num2 = null
    //빨간줄 -> error, null이 들어 갈 수 없게끔 설계를 해놓음

    var num5 : Long? = 1000L
    //Long? -> type + ?
    num5 = null


    //객체 인스턴스화
    var person = Person("황상익") //new를 붙이지 않는다.
}
