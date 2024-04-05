//calculator by suing ifelse
import java.util.Scanner;
class ifelse{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.print("\n Do you wish to use Calculator ? ");
        String res=sc.nextLine();
        if(res.equalsIgnoreCase("yes")){
            System.out.println("Enter the first number :");
            double num1=sc.nextDouble();
            sc.nextLine();
            System.out.println("Enter the second number:");
            double num2=sc.nextDouble();
            sc.nextLine();
            System.out.println("enter the operation you want to perform ?");
            String opr=sc.nextLine();
            if(opr.equalsIgnoreCase("sum")){
                System.out.printf("the Sum of %f and %f is %f ",num1,num2,num1+num2);
            }
            else if(opr.equalsIgnoreCase("subtraction")){
                System.out.printf("the Subtraction of %f and %f is %f ",num1,num2,num1-num2);
            }
            else if(opr.equalsIgnoreCase("division")){
                System.out.printf("the Divison of %f and %f is %f",num1,num2,num1/num2);
            } else if(opr.equalsIgnoreCase("multiply")){
                System.out.printf("the Multiply of %f and %f is %f ",num1,num2,num1*num2);
            }
            else if(opr.equalsIgnoreCase("remainder")){
                System.out.printf("the Reaminder of %f and %f is %f ",num1,num2,num1%num2);
            }
            
            else{
                System.out.printf("%s  is not a valid operator",opr);
            }
        }
        else{
            System.out.println("YOu have choosen not to use calculator.");

        }

        sc.close();   
    }
}