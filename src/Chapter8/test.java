class d implements Runnable {
    private String city;
    public d(){}
    public d(String city){
        this.city=city;
    }
    public void run(){
        for(int i=0;i<10;i++)
            System.out.println(city);
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}

class c extends Thread {
    private String city;
    public c(){}
    public c(String city){
        this.city=city;
    }
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(city);
        }try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}

public class test
{
    public static void main(String[] args){
        c c1=new c("上海");
        c c2=new c("北京");
        Thread t1=new Thread(c1);
        Thread t2=new Thread(c2);
        t1.start();
        t2.start();
    }
}
