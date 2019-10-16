import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Typein {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println("写入字符串 : "+s);
        try {
            BufferedWriter bw=new BufferedWriter(new FileWriter("D:\\test.txt"));
            bw.write(s);
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
