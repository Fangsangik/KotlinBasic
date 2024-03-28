package lecture2.lec_03;

import org.jetbrains.annotations.NotNull;

import javax.tools.JavaFileManager;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Lec_03 {
    private int paresIntOrThrow(@NotNull String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw new IllegalStateException(String.format("주어진 %s는 숫자가 아닙니다", str));
        }
    }

    private Integer paresIntOrThrow2(@NotNull String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public void readFile() throws IOException {
        File curFile = new File(".");
        File file = new File(curFile.getAbsoluteFile() + "/a.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        System.out.println(br.readLine());
        br.close();
    }

    public void readFile2(String path) throws IOException {
       try (BufferedReader reader = new BufferedReader(new FileReader(path))){
           System.out.println(reader.readLine());
       }
    }
}

class Lec07Main {
    public static void main(String[] args) throws IOException {
        Lec_03 lec03 = new Lec_03();
        lec03.readFile();
    }
}

