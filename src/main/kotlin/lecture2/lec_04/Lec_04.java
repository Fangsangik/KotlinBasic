package lecture2.lec_04;

public class Lec_04 {
    public static void main(String[] args) {

    }
    public int max(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    public static void repeat(String str, int num, boolean useNewLine) {
        for (int i = 0; i <= num; i++) {
            if (useNewLine) {
                System.out.println(str);
            } else {
                System.out.println(str);
            }
        }
    }

    public static void repeat(String str, int num) {
        repeat(str, num, true);
    }

    public static void repeat(String str) {
        repeat(str, 3, true);
    }

    public static void printAll(String... strings) { //...을 쓰면 가변인자 사용
        for (String string : strings) {
            System.out.println("string = " + string);
        }
    }
}
