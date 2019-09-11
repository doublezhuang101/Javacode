public class Patient {

        private String name;
        private char sex;
        private int age;
        private float weight;
        private boolean allergies;
        public void setname(String a)
        {
            name=a;
        }
        public void setsex(char b)
        {
            sex=b;
        }
        public void setage(int c)
        {
            age=c;
        }
        public void setweight(float d)
        {
            weight=d;
        }
        public void setallergies(boolean e)
        {
            allergies=e;
        }
        public String getname(){return name;}
        public char getsex(){return sex;}
        public int getage(){return age;}
        public float getweight(){return weight;}
        public boolean getallergies(){return allergies;}
        public String toString()
        {
            return ("Name:"+name+" "+"sex:"+sex+"  age:"+age+"  weight:"+weight+"  allergies:"+allergies);
        }


    public  static void main(String args[])
    {
        Patient april=new Patient();
        april.setname("miao");
        april.setsex('f');
        april.setage(20);
        april.setweight(80);
        april.setallergies(true);
        Patient april2=new Patient();
        april2.setname("zhuang");
        april2.setsex('f');
        april2.setage(18);
        april2.setweight(60);
        april2.setallergies(true);
        System.out.println(april.toString());
        System.out.println(april2.toString());
    }
}
