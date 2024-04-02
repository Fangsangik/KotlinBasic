package lecture3.lec_02

fun main(){
    Derived(300)
}

open class Base(
    open val number: Int = 100
){
    init{
        println("Base")
        println(number)
        //상위 클래스가 실행되는 동안, 하위클래스 Derived를 인스턴스화 한다는 것은
        //Derived에 number에 값을 집에 넣어준다는 것이다.
        //상위 클래스에서 number를 호출 -> 하위 클래스 number를 가져옴
        //아직 상위 컨스트럭터가 실행 되는 단계라 하위 클래스에 number라는 값에 초기화가 이뤄지지 않음
        //따라서 0이 나온다.
        //하위 클래스의 override 접근하면 안된다고 말한다.

        /*
        따라서 상위 클래스를 설계 할때 생성자 또는 초기화 블록에 사용되는 프러퍼티에는 open을 피해야 한다.
         */
    }
}

class Derived(
    override val number: Int
) : Base(number) {
    init {
        println("Derived Class")
    }
}

/*
정리
final : override를 할 수 x, default로 보이지 않게 한다
open : override를 열어준다
abstract : 반드시 override
override : 지시어로 사용 해야 한다.
 */