package lecture3.lec_01

fun main(){
    val person = Person("황상익", 100)
    person.age = 10 //setter
    println(person.name) //getter
}

class Person(name: String, age: Int) { //constructor 위치
    //constructor 지시어는 생략 가능

    val name = name //constructor에서 name이 뭔지 알려주고 있다.
    var age: Int = age

    /*
    코틀린에서는 필드만 생성하면 getter, setter를 자동으로 형성
    .필드를 통해 getter, setter 가져올 수 있다.
     */
}

class Person1(name: String, age: Int) { //constructor 위치
    //코틀린에서는 생성자에서 프러퍼티를 만들 수 있기 때문에 바로 형성 가능
}

// 자바 클래스 이지만 .필드를 통해 getter, setter 사용 가능
fun main1(){
    val person = Lec01("황상익", 100)
    person.age += 10
    println(person.age)

    Student()
}

//코틀린에서 검증로직은 어디에 써야하나??
class Person3(
    val name : String,
    var age : Int
) {
    //init block은 클래스가 초기화 되는 시점에 한번 호출되는 블록
    init {
        if (age < 0){
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
    }
}

//코틀린 추가 생성사
class Person4(
    name : String,
    var age : Int
    //주생성자 : 반드시 존재 해야 한다.
) {
    //init block은 클래스가 초기화 되는 시점에 한번 호출되는 블록
    init {
        if (age < 0){
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
        println("초기화 블록")
    }

    //부생성자
    //있어도 되고 없어도 된다. 최종적으로 주 생성자를 this 호출해야 한다.
    //body를 소유 할 수 있다.
    constructor(name : String) : this(name, 1){
      println("첫 부생성자")
    }//첫 컨스트럭터는 주생성자를 호출

    constructor(): this("황상익"){
        println("두번째 부생성자")
    } //두번째 컨스트럭터는 첫번째 컨스트럭터를 부르고

    //본문은 역순으로 실행
    //하지만 부생성자 보다는 default parameter를 권장

    /*
    Converting과 같은 경우 부생성자를 사용할 수 있지만, 그보다는 정적 팩토리 메서드를 추천
     */

    fun isAdult1(): Boolean {
        return this.age >= 20
    }

    //customGetter Person4 클래스에 프로퍼티가 있는 것 처럼 보여주는 것
    //자기 자신을 변영해줄 수 있다.
    val isAdult :Boolean
        get() = this.age >= 20

    val name = name
        get() = field.uppercase()
    //field 자리에 name 대신 field가 들어가야 한다.
    //name을 사용했을때 name은 name에 대한 getter를 호출하니 다시 get을 부른다. == 무한루프
    //field를 사용하면 자기 자신을 가르키는 것 = 보이지 않는 field라고 해서 backing field라고 부른다.


    fun getUppercaseName() : String {
        return this.name.uppercase()
    }

    val upperCaseName : String
        get() = this.name.uppercase()

    //set
    var name1 = name
        set(value) {
            field = value.uppercase()
        }
}

//주 생성자에 파라미터가 하나도 없는 경우
//기본으로 생성자를 생성해주기 때문에 생성자 작성 굳이 필요 X
class Student{

}

