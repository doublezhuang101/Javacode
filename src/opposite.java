import java.util.Random;

public class opposite {
    public static void main(String[] args) {
        int array[]=new int [10];
        int i=0,j=0;
        Random r = new Random();
        System.out.println("原数组为：");
        for(; i<10 ;  i++)
        {
            int tmp = r.nextInt(100);
            //System.out.println(tmp);
            array[i]=tmp;
            System.out.println(array[i]);
        }
        System.out.println("反序后为：");
        for(j=0,i=9;j<((array.length)/2);j++,i--)
        {
            int temp=0;
            temp=array[j];
            array[j]=array[i];
            array[i]=temp;
        }
        int e=0;
        for (e=0;e<array.length;e++)
            System.out.println(array[e]);
    }
}
