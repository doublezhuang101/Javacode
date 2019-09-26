class StudentXW extends Student{
    public int zeren;

    @Override
    public void testScore(Student a) {
        int temp=getEnglish_score()+getMath_score()+getPC_score();
        System.out.println("学委测评成绩为："+((temp/3)+3));
    }
}
class StudentBZ extends Student{
    public int zeren1;

    @Override
    public void testScore(Student a) {
        int temp=getEnglish_score()+getMath_score()+getPC_score();
        System.out.println("班长测评成绩为："+((temp/3)+5));
    }
    public StudentBZ(int x,int y,int z){
        setEnglish_score(x);
        setMath_score(y);
        setPC_score(z);
    }
}
public class Student {
    private int number;
    private String name;
    private int english_score;
    private int math_score;
    private int PC_score;
    private int result;

    public int getEnglish_score() {
        return english_score;
    }

    public int getMath_score() {
        return math_score;
    }

    public int getNumber() {
        return number;
    }

    public int getPC_score() {
        return PC_score;
    }

    public int getResult() {
        return result;
    }

    public String getName() {
        return name;
    }

    public void setEnglish_score(int english_score) {
        this.english_score = english_score;
    }

    public void setMath_score(int math_score) {
        this.math_score = math_score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setPC_score(int PC_score) {
        this.PC_score = PC_score;
    }

    public void setResult(int result) {
        this.result = result;
    }
    public void sum(){
        setResult(getEnglish_score()+getMath_score()+getPC_score());
    }
    public void equals(Student a,Student b){
        if(a.getResult()==b.getResult())
            System.out.println("成绩一样");
    }
    public  void compare(Student a,Student b){
        if (a.getResult()>b.getResult())
            System.out.println("前者成绩高");
        if (a.getResult()<b.getResult())
            System.out.println("后者成绩高");
    }
    public void testScore(Student a){
        int tmp=getEnglish_score()+getPC_score()+getMath_score();
        System.out.println("测评成绩为："+(tmp/3));
    }
    public Student(int x,int y,int z)
    {
        setEnglish_score(x);
        setMath_score(y);
        setPC_score(z);
    }
    public Student(){}
}
