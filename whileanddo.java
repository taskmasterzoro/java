public class whileanddo {
    public static void main(String[] args) {
        int n =5;
        int num=1;
        while(num<=10){
            System.out.printf("%d x %d = %d \n",n,num,n*num );
            num++;
        }
        do{
            num--;
            System.out.printf("%d x %d =%d \n ",n,num,n*num);
        
        }while(num>1);
        
    }
}
