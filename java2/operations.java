class operations {
     public static void main(String[] args){
        int number1=5;
        int number2=2;
        // addition 
        System.out.println(number1 + number2);
         
        //subtraction 
        System.out.println(number1 - number2);

        // division
        System.out.println(number1 / number2);
         
        // multiplication
        System.out.println(number1 * number2);

        //remainder(modulo/modulus)
        System.out.println(number1 % number2);
         
        // increase the number
        number1+=5; //meaning of this number1=number1+5;
        // similarly we can  decrease the value by using -= or *= or /= operators
        
    
        // relational operator

        //equal to equal 
        System.out.println(number1==number2);// output will be false
          
        //not equal to 
        System.out.println(number1!=number2);
        /*output will be true for this condition 
        because both are not same so it gives true*/

        //is greater than 
        System.out.println(number1>number2);//true

        // is less than
        System.out.println(number1<number2);//false

        //is greater than or equal to 
        System.out.println(number1>=number2);//true

        // is less than or equal to 
        System.out.println(number1<=number2);//false
     }
    
}
