package lecture3.lec_02.animaljava;

public interface FlyAble {
    default void act(){
        System.out.println("파닥");
    }
}
