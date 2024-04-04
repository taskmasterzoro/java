class strings {
    public static void main(String[] args){
    String intro="Hello, my name is Mohit.";
    String outro = "I hope you enjoyed this program";
    String ques="how are you ?";
    //System.out.println(intro+"I am from Jhansi "+ques+outro);
     
    String formattedString= String.format("%s I  am from Jhansi %s %s",intro,ques,outro);
    // for double %f will be used 
    // for char %c will be used
    // for int %d will  be used
    // for string use %s
    // for boolean  use %b

    System.out.println(formattedString);
    // it can be printed in formatted string within the print
    System.out.println(String.format("%s I  am from Jhansi %s %s",intro,ques,outro));

    // length of string
    System.out.println(intro.length()+" "+outro.length());

    // string is empty
    System.out.println(intro.isEmpty()); // false string is not empty 
     
    // string in uppercase 
    System.out.println(intro.toUpperCase());

    // string in lowercase 
    System.out.println(intro.toLowerCase());

    // string new check if equal 
    System.out.println(intro.equals(outro));//false they are not equal
    
    /* string are equal onot by ignoring 
    the lower or upper case in the string*/
    System.out.println(intro.equalsIgnoreCase(outro));
  
    //checking substring
    System.out.println(intro.substring(7,12)+" is my Name");
  
    // replacing the part of string and returns it as new string
    String intro1=intro.replace("Mohit","Xopun" );
    System.out.println(intro1);
    System.out.println(intro);
    // both of the strings are different 
    
    /*print string after checking if 
    it contains a specific word*/

    System.out.println(intro.contains("Mohit")); // true
 
 
  }
   
}
