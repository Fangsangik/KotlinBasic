package lecture3.lec_02.animaljava;

import lecture3.lec_02.Animal;

public class Paenguin extends Animal implements SwimAble, FlyAble{

    private final int wingCnt;

    public Paenguin(String species){
        super(species, 2);
        this.wingCnt = 2;
    }
    @Override
    public void move() {
        System.out.println("뒤뚱뒤뚱");
    }


    @Override
    public int getLegCnt(){
        return super.getLegCnt() + this.wingCnt;
    }

    @Override
    public void act() {
        FlyAble.super.act();
        SwimAble.super.act();
    }
}
