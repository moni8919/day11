class a{
    public void pl()
    {
        System.out.println("Hello students");
    }
}
    class b extends a{
        public void r()
        {
            System.out.println("Hello teachers");
        }
    }
    class c extends a{
        public void r1()
        {
            System.out.println("Hello profesers");
        }
    }
    public class heirarchicalinher{
        public static void main(String[] args){
            b h=new b();
            h.r();
            h.pl();
            c h1=new c();
            h1.pl();
            h1.r1();
        }
    }
