import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Code21 {
    public static void main(String[] args) {
        File file = new File("D://java remind//code16//JavaProblem//text.txt");
        try {
            FileOutputStream out = new FileOutputStream(file);
            String str ="Hello world";
            byte[] by=str.getBytes();
            out.write(by); //Byte형으로만 넣을 수 있음
    
        } catch (Exception e) {
                    e.getStackTrace();
            // TODO: handle exception
        }
    }
}