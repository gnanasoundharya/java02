package soundharya;
class kajal
{
    public  void  add(int x,int y)
    {
        System.out.println(x+y);

    }
}
class saran extends kajal
{
    public void sub(int a,int b)
    {
        System.out.println(a-b);
    }
}
class anu extends saran{
    public void mul(int i,int j)
    {
        System.out.println(i*j);
    }
}
public class inhertance {
    public static void main(String[] args) {
        saran sa=new saran();
       // sa.add(3,5);
        sa.sub(5,2);
        anu an=new anu();
        an.mul(3,8);
        an.add(2,5);
    }
}
