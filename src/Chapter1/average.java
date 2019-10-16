import java.util.Random;
public class average {
    public static void main(String[] args) {
        {
            int array[];
            array=new int[10];
            int max=array[0];
            int min=100;
            int temp=0;
             Random r = new Random();
             for(int i=0 ; i<10 ;  i++)
                 {
                    int tmp = r.nextInt(100);
                    //System.out.println(tmp);
                    array[i]=tmp;
                 }
            for(int j=0 ; j<array.length ;  j++)
            {
                System.out.println(array[j]);
                if(array[j]>max)
                {
                    max=array[j];
                }
                if(array[j]<min)
                {
                    min=array[j];
                }
                temp+=array[j];
            }
            System.out.println("最大值为"+max+"最小值为"+min+"平均值为"+(temp/10)+"和为"+temp);
        }
    }
}
