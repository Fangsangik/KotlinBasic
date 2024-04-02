package lecture3.lec_02.animaljava;

import lecture3.lec_02.Animal;

public class Cat extends Animal {

    public Cat(String species) {
        super(species, 4);
    }

    @Override
    public void move() {
        System.out.println("사뿐사뿐 걸어가~");
    }
}
