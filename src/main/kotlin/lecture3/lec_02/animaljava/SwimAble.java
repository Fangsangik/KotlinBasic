package lecture3.lec_02.animaljava;

public interface SwimAble {
    default void act(){
        System.out.println("첨벙첨벙");
    }
}
