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
    
    //checking substring
    System.out.println(intro.substring(7,12)+" is my Name");
    
  }
}
