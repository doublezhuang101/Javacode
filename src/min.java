public class min {
    public static void main(String[] args)
    {
        int [] array={20,10,50,40,30,70,95,80,90,100};
        int max=array[0];
        int min=array[0];
        for(int i=1;i<array.length;i++)
        {
            if(array[i]>max)
            {
                max=array[i];
            }
            if(array[i]<min)
            {
                min=array[i];
            }
        }
        System.out.println("最大值为："+max);
        System.out.println("最小值为"+min);
        for(int i=0;i<array.length;i++)
        {
            if(array[i]==95)
                System.out.printf("等于95的下表标为"+(i));
        }
    }
}
