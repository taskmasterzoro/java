 import java.util.Scanner;
 
 class userinput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // for a string type input
        System.out.println( "Enter your name: ");
        String name = sc.nextLine();
        // for a integer type input
        System.out.print("How old are you? ");
        int age = sc.nextInt();
        //for a double type input
        System.out.print("what is your weight(kg) and height(meters) ?");
        double  weight = sc.nextDouble();
        double  height=sc.nextDouble();
        /*using sc.nextInt or sc.nextDouble only take input for example
        26<enter> it will only take 26 as a input from the terminal 
        and leave the enter  key in the buffer, so when we ask for 
        another number it takes that enter key as an input which is not what we want*/

        /* double weight=Double.parseDouble(sc.nextLine());
        use this if above doesn't work*/
         
        /*int age=Integer.parseInteger(sc.nextLine()); */
        
        System.out.print(sc.nextLine());
        System.out.printf("what is your  gender?(M/F): ");
        String gender =sc.nextLine();
        
        double bmi =weight/(height*height);
        // Printing the result
        System.out.println(String.format("\n Your name is %s and your age is %d and you are a %s. \n",name,age,gender));
        
        System.out.printf("hello %s how are you?\n",name);
        System.out.printf("your bmi is %f \n" ,bmi);
        sc.close();
    }
    
}
