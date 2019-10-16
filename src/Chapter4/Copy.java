import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
public class Copy {
    public static void main(String[] args) {
        System.out.println("请输入源路径名：");
        Scanner s1 = new Scanner(System.in);
        String SonrcePath = s1.next(); // 源路径
        System.out.println(SonrcePath);
        System.out.println("请输入源文件名：");
        Scanner s2 = new Scanner(System.in);
        String SonrceFile = s2.next(); // 源文件
        System.out.println("请输入目标路径名：");
        Scanner s3 = new Scanner(System.in);
        String DestLath = s3.next();// 目标路径
        System.out.println("请输入目标路径名：");
        Scanner s4 = new Scanner(System.in);
        String DestFile = s4.next();// 目标文件
        File f1 = new File(SonrcePath + File.separator + SonrceFile);
        File f2 = new File(DestLath + File.separator + DestFile);
        Copy.copyFile(f2, f1);
    }

    public static void copyFile(File targetFile, File file) {
        if (targetFile.exists()) {
            System.out.println("文件" + targetFile.getAbsolutePath()
                    + "已经存在，跳过该文件！");
            return;
        } else {
            createFile(targetFile, true);
        }
        System.out.println("复制文件" + file.getAbsolutePath() + "到"
                + targetFile.getAbsolutePath());
        try {
            InputStream is = new FileInputStream(file);
            FileOutputStream fos = new FileOutputStream(targetFile);
            byte[] buffer = new byte[1024];
            while (is.read(buffer) != -1) {
                fos.write(buffer);
            }
            is.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void createFile(File file, boolean isFile) {
        if (!file.exists()) {
            if (!file.getParentFile().exists()) {
                createFile(file.getParentFile(), false);
            } else {
                if (isFile) {
                    try {
                        file.createNewFile();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else {
                    file.mkdir();
                }
            }
        }
    }
}