class gp{
    public void r()
    {
        System.out.println("Hello i'am grand parent");
    }
}
    class p1 extends gp{
        public void r1()
        {
            System.out.println("Hello i'am parent1");
        }
    }
    interface p2{
        void r2();
   }
    class d extends p1 implements p2{
        public void r2()
        {
            System.out.println("Hello i'am parent2");
        }
     public void r3()
    {
        System.out.println("i'am child class");
    }
}

      public class hybridinher{
        public static void main(String[] args){
            d h=new d();
            h.r();
            h.r1();
            h.r2();
            h.r3();
        }
    }
