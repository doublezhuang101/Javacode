import java.io.*;

public class Typein4 {
    public static void main(String asd[]) {
        int ch;
        InputStreamReader iin = new InputStreamReader(System.in);
        BufferedReader bin = new BufferedReader(iin);
        File file1 = new File("D:Typein4.txt");
        try {
            FileOutputStream fout = new FileOutputStream(file1);
            DataOutputStream dout = new DataOutputStream(fout);
            System.out.println("输入整数");
            int i = Integer.parseInt(bin.readLine());
            System.out.println("输入浮点数");
            float f = Float.parseFloat(bin.readLine());
            System.out.println("输入布尔量");
            Boolean b = new Boolean(bin.readLine()).blooeanValue();
            dout.write(i);
            dout.writeFloat(f);
            dout.writeBoolean(b);
            dout.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
