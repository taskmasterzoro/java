 import java.util.Scanner;
 import java.util.Arrays;

 class evenodd {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter the  number:");
    int  num =sc.nextInt();
    int a[]=new int[(num-1)/2+1];
    int j=0;
    for(int i=0;i<=num;i++){
        if(i%2==0)
        {
            System.out.printf("The %d  number is Even\n",i);
        }
        else{
           // System.out.printf("the %d number is Odd\n",i);
         a[j]=i;
         j++;
        }
    }
    Arrays.sort(a);
    System.out.println(Arrays.toString(a));
    
    sc.close();   
    }
    
}
