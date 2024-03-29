package lecture2.lec_01;

public class Lec_01 {
    public static void main(String[] args) {

    }

    private void validateScoreIsNotNegative(int score) {
        if (score < 0) {
            throw new IllegalStateException(String.format("%s는 0보다 작을 수 없습니다", score));
        }
    }

    private String getPassOrFail(int score) {
        if (score >= 50) {
            return "P";
        } else {
            return "F";
        }
    }

    private String getGrade(int score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else {
            return "D";
        }
    }

    private String getGradeWithSwitch(int score) {
        switch (score / 10) {
            case 9:
                return "A";
            case 8:
                return "B";
            case 7:
                return "C";
            default:
                return "D";
        }
    }

    public boolean startsWithA(Object o) {
        if (o instanceof String) {
            return ((String) o).startsWith("A");
        } else {
            return false;
        }
    }

    public void judgeNum(int number) {
        if (number == 1 || number == 0 || number == -1) {
            System.out.println("어디서 본 숫자");
        } else {
            System.out.println("1, 0, -1이 아님");
        }
    }

    public void judgeNum2(int number) {
        if (number == 0) {
            System.out.println("주어진 숫자는 0");
            return;
        }
        if (number % 2 == 0) {
            System.out.println("주어진 숫자는 짝수");
            return;
        }

        System.out.println("주어진 숫자는 홀수");
    }
}
