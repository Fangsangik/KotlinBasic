package lecture3.lec_01;

public class Lec01 {

    private final String name;
    private int age;

    public Lec01(String name, int age) {
        if (age < 0){
            throw new IllegalStateException(
                    String.format("나이는 %s일 수 없습니다.", age)

            );
        }
        this.name = name;
        this.age = age;
    }

    public boolean isAdult(){
        return this.age >= 20;
    }

    public Lec01(String name){
        this(name, 1);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
