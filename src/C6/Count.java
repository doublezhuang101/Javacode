import java.util.*;
public class Count {
    public static void main(String[] args) {
        int letter=0,digit=0,space=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一行字符");
        String str=sc.nextLine();
        char[] ch=str.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(Character.isDigit(ch[i])){
                digit++;
            }
            if(Character.isLetter(ch[i])){
                letter++;
            }
            if(!(Character.isDigit(ch[i])||(Character.isLetter(ch[i])))){
                space++;
            }
        }
        System.out.println("输出有有"+digit+"个数字");
        System.out.println("输出有有"+letter+"个字母");
        System.out.println("输出有有"+space+"个特殊字符");
    }
}