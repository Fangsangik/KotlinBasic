package lecture2.lec_04


fun main() {
    repeat("Hello World")
    repeat1("Hello World", useNewLine = false) // 새롭게 명시를 해준다.
    printNameAndGender(name = "josh", gender = "MALE") // 바꼇을 경우

    //Lec_04.repeat(str = "A") 자바 함수를 가져다 사용할때는 name argument를 사용할 수 없다
    //JVM 상에서 parameter 이름을 보유하고 있지 않기 때문

    printAll("A", "B", "C")

    var array = arrayOf("a", "b", "c") //-> ,로 구분하는 경우는 바로 사용 가능
    printAll(*array) // * spread 연산자 -> 배열을 spread 해준다.
}

fun max(a: Int, b: Int): Int =
    if (a > b) {
        a
    } else {
        b
    }
//중괄호를 X -> =으로 대체 가능

fun max2(a: Int, b: Int) = if (a > b) a else b
//타입 또한 생략 가능  & 한줄로 변경 가능
//단 block을 사용 하는 경우에는 반환타입이 Unit이 아니면 명시적으로 타입을 작성

//함수는 클래스 안에 있을 수도 있고, 파일 최상단에 있을 수도 있음.
//또 한 파일 안에 여러 함수들이 있을 수도 있다.


//default parameter
//밖에서 파라미터를 넣어주지 않으면 기본값을 사용
fun repeat(
    str: String,
    num: Int = 3,
    useNewLine: Boolean = true
) {
    for (i in 1..num) {
        if (useNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}

//named argument
//매개변수 이름을 통해 직접 지정, 지정되지 않은 매개변수는 기본값을 사용
//bulider를 직접 만들지 않고 bulider의 장점을 갖게 된다.
fun repeat1(
    str: String,
    num: Int = 3,
    useNewLine: Boolean = true
) {
    for (i in 1..num) {
        if (useNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}

fun printNameAndGender(
    name :String, gender : String
) {
    println(name)
    println(gender)
}

fun printAll(vararg strings: String){
    for (string in strings) {
        println(string)
    }
}
