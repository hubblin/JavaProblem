import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Code20 {

    public static void main(String[] args) throws IOException {
        File file = new File("D://java remind//code16//JavaProblem//text.txt");
        BufferedOutputStream bf = null;
        try {
            FileOutputStream outputStream = new FileOutputStream(file);
            bf = new BufferedOutputStream(outputStream);

            for(int i =0; i < 8; i++){
                for(int j =0; j < 8; j++){
                    for(int k =0; k < 8; k++){
                        for(int f = 1; f <=8; f++){
                            String temp = Integer.toString((f) + (k*64) + (j*8) + (i*512));
                            temp = String.format("%6s", temp);
                            bf.write(temp.getBytes());
                        }
                        bf.write("\t".getBytes());
                    }
                    bf.write("\n".getBytes());
                }
                bf.write("\n".getBytes());
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{
            bf.close();
        }

    }

    
}