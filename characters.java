class characters {
    public static void main (String[] args ){
    
    // for the single character 'char' is used 
    char percentage='%';
     /* ' ' is used to denoted 
    strinng of single character */ 
    System.out.println(percentage);

    // for multiple  characters, string data type is used 
    String Name="mohit";
    System.out.println("My Name is"+ Name);
    // same string is contain in the different string  

    String Name1="mohit";
    System.out.println("My Name is"+ Name1);

    System.out.println(Name==Name1);
    //it will give true 

    
    // multiple character by using new 
    String name2= new String("mohit");
     
    /*without new jvm will store the string in the memory 
     pool and if we use same string literal again it points  
     towards that memory location so no need to create a  
     object each time and it will used that string 
     with different Name for that string  literal*/

     String name1= new String("mohit");
     // both name1 and name2 are have same string
     
     System.out.println(name1==name2);
     /*false because they are not 
     point towards same memory location*/

    }
    
}
