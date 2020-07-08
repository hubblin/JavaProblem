import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Code2 {
    /*
    level1
     * 2. 문제 
     * A씨는 개발된 소스코드를 특정업체에 납품하려고 한다. 개발된 소스코드들은 탭으로 들여쓰기가 된것, 공백으로 들여쓰기가 된 것들이
     * 섞여 있다고 한다. A씨는 탭으로 들여쓰기가 된 모든 소스를 공백 4개로 된 모든 소스를 공백 4개로 수정한 후 납품할 예정이다. A씨를
     * 도와줄 수 있도록 소스코드내에 사용된 탭(Tab) 문자를 공백 4개(4 space)로 바꾸어 주는 프로그램을 작성 하시오.
     */
    public static void main(String[] args) {
        try {
            Scanner kb = new Scanner(new File("D:\\java remind\\code16\\javaProblem\\index.txt"));
            // 기능의 분할
            try {
                PrintWriter prw = new PrintWriter(new FileWriter("D:\\java remind\\code16\\javaProblem\\index2.txt"));
                
                while(kb.hasNextLine()){
                    String str = change(kb.nextLine());
                    System.out.println(str);
                    prw.println(str);
                }
                prw.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }


            

            kb.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            System.out.println("no file");
            return;
        }

        
    }
    public static String change(String kb){
        String replaceAll = kb.replaceAll("\t", "    ");
        return replaceAll;
    }
}