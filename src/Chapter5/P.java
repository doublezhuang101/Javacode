public class P implements M {
    public int max(int a ,int b,int c){
        int x=a>b?a:b;
        return  x>c?x:c;
    }
    public int min(int a,int b,int c){
        int x=a<b?a:b;
        return x<c?x:c;
    }
    public static void main(String [] args){
        P s=new P();
        System.out.println(s.max(3,7,9));
        System.out.println(s.min(3,7,9));
    }
}
 interface M{
    abstract int max (int a,int b,int c);
    abstract int min(int a,int b,int c);
}