 import java.util.Scanner;
 class switchcal {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the first number :");
      Double num1 =sc.nextDouble();
      sc.nextLine();
      System.out.println("Enter the second number :");
      Double num2 =sc.nextDouble();
      sc.nextLine();
      System.out.print("what operation you wish to perform ? ");
      String opr=sc.nextLine();
     // switch is faster than if else 
      switch(opr)
      {
        case "+":// "Addition" can also be used .if we want to use then but we have to ""
        System.out.println("The sum is:"+ (num1 + num2));
        break;
        /*in switch case of java the if break is not 
        there then the control will also excute the cases
         after that case biscally every casse after that case  */
        case "-":
        System.out.println("The result of subtraction is: " + (num1 - num2));
        break;  
        case "*":   
        System.out.println("The product is " + (num1 * num2));  
        break;   
        case "/":
        if(num2!=0){
        System.out.println("The result after division "+(num1/num2));}
        else{
          System.out.println("Error! Division by zero is not allowed.");
        }
        
        break;
        case"%":
        System.out.println("the remainder is "+(num1%num2));
        break;  
        default:     
        System.out.println("Invalid Operator");  
        break;
      }    
      


      

      sc.close();  
    }
    
}
