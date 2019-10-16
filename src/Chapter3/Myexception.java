public class Myexception {
    public String test="test.string";
    Myexception(String x){
        test=x;
    }
    public void print(){
        System.out.println(test);
    }
    public static void main(String[] args) {
        Myexception Test1=new Myexception("mystring");
        int a=0,b=0;
        try{
            int c;
            c=a/b;
        }
        catch (java.lang.ArithmeticException e){
            Test1.print();
        }
    }
}
