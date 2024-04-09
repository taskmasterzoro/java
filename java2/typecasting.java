public class typecasting {
    public static void main(String[] args) {
       double myDouble = 65.3;
       byte myInt = (byte)myDouble;
       short myInt1 = (short)myDouble;
       char myInt2 = (char)myDouble;
       int myInt3 = (int)myDouble;
       long myInt4 = (long)myDouble;
       float myInt5 = (float)myDouble;

    
       // Explicit casting: double to int
       System.out.println(myDouble);
       System.out.println(myInt);
       System.out.println(myInt1);
       System.out.println(myInt2);
       System.out.println(myInt3);
       System.out.println(myInt4);
       System.out.println(myInt5);
 
    }
 }