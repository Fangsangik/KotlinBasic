package lecture3.lec_02

abstract class Animal(
    protected val species : String,
    protected open val legCnt : Int
){
    abstract fun move()
}

//상속을 받을 때 : 사용
//convention의 차이는 타입을 쓸때 변수명에서 :을 띄어 쓰지 않고
//상속에서는 : 띄어쓴다.
class Cat(
    species: String

) : Animal(species, 4){
    //Animal 클래스의 constructor를 불러준다

    override fun move() { //override 지시어를 사용
        println("사뿐 사뿐!")
    }
}

class Penguin(
    species: String
) : Animal(species, 2){

    private val wingCnt: Int = 2;

    override fun move() {
        println("뒤뚱")
    }

    // protected open val legCnt : Int
    // custom getter를 활용한 프로퍼티를 만들게 되면 -> open을 붙여주어야 한다.
    override val legCnt : Int
        get() = super.legCnt + this.wingCnt
}