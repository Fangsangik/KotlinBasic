package lecture3.lec_02

class Penguin1(
    species: String
) : Animal(species, 2), SwimAble, FlyAble{
    private val wingCnt: Int = 2

    override fun move() {
        println("뒤뚱")
    }

    override val legCnt: Int
        get() = super.legCnt + this.wingCnt

    override fun act() {
        super<SwimAble>.act()
        super<FlyAble>.act()
    }
}

interface FlyAble {
    fun act(){
        println("파닥")
    }
}

interface SwimAble {
    fun act(){
        println("첨벙첨벙")
    }
}