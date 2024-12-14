public class tryctchblck {
    public static void main(String[]args){
        try{
            int d=90/0;
            
        }catch(ArithmeticException v)
        {
            System.out.println("bad Request");
        }
        try{
            int d=90/0;

        }catch(ArithmeticException v){
            System.out.println("catch block is running");

        }
        finally{
            System.out.println("finally is running");
        }
    }
    
}
/*PS C:\Users\Student.DESKTOP-00M4QUL\Desktop\day11> java tryctchblck      
bad Request
catch block is running
finally is running */