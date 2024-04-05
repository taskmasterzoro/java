package proj;
 import java.util.Scanner;
public class bmi {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("This is a BMI calculator\n Do you wish to measure your BMI ?");
    String ans=sc.nextLine();
    String yes= "yes";
    if(ans.equalsIgnoreCase(yes));
{
    System.out.print("\nEnter your Name :- ");
    String name =sc.nextLine();
    float height,weight;
    System.out.println("Enter your weight (kg) ? :-");
    weight=sc.nextFloat();
    System.out.print("Enter your height ?");
    height=sc.nextFloat();
    // BMI Calculation
    float bmi=weight/(height*height);
    System.out.printf(" %s BMI  is :- %f",name,bmi);
    if(bmi<18.50){
    System.out.print(" Your are underweight.\n");
    }
    else if (bmi>18.50 && bmi<24.99){
    System.out.print( " You are Normal.\n");
    }
    else if(bmi>24.99 && bmi<29.99){
    System.out.print("You are overweight.\n");
    }
    else {System.out.print(" You are Obese.\n");
}
}
    sc.close();
    }
    
}
