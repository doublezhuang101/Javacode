public class prime {
    public static void main(String[] args) {
        int i=0;
        int count=0;
        for (i=2;i<100;i++)
        {

                boolean flag=false;
                for(int j=2;j<=Math.sqrt(i);j++){
                    if(i%j==0){
                        flag=true;
                        break;
                    }
                }
                if(flag==false) {
                    count++;
                    if((count%6)==0)
                    {
                        System.out.println("");
                    }else
                    System.out.print(i + " ");
                }
        }
    }
}
