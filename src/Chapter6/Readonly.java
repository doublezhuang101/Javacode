import java.io.*;
public class Readonly {
    public static void main(String args[]) {
        File f = new File("test");
        if (f.exists() && f.isDirectory())
            System.err.println("目录、" + f.toString() + "已经存在!");
        else {
            if (f.mkdir()) {
                System.out.println("目录" + f.getAbsolutePath() + "创建结束!");
                File f2 = new File(f, "my.txt");
                try {
                    f2.createNewFile();
                    f2.setReadOnly();
                } catch (IOException e) {
                    System.out.println(e.toString());
                }
                System.out.println("文件、" + f2.getAbsoluteFile() + "创建结束!");
            } else
                System.out.println("目录" + f.getAbsoluteFile() + "创建失败!");
        }
    }
}
