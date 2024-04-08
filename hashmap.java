import java.util.HashMap;
class hashmap{
    public static void main(String[] args) {
        //hashmap creation 
        HashMap<String,Integer> examscore=new HashMap<String,Integer>();
        
        //value assigning to Hashmap
        examscore.put("Math",75);
        examscore.put("Science",85);
        examscore.put("English",55);
        examscore.put("Computer Science",95);
        examscore.put("AI",85);
       
       // print out the hasshmap  using get method
       System.out.println("The score is "+examscore.get("English"));
       
       //print all elements of hashmap
       System.out.println("The score is "+examscore.toString());
       
       // put if  absent else update value
       examscore.putIfAbsent(" ML ",85);
       System.out.println(examscore.toString());
       
       // replace the value  with another value
       examscore.replace("Math",85);
       System.out.println(examscore.toString());
       
       // remove element from hashmap
       examscore.remove("Science");
       System.out.println(examscore.toString());
       
       // get or default 
       System.out.println(examscore.getOrDefault("Science",-1));
       //-1

       // size of hashmap
       System.out.println(examscore.size());//5
       
       // check hashmap for  value
       System.out.println(examscore.containsKey("Math"));//true
       
       //chech hashmap for  key 
       System.out.println(examscore.containsValue(85));//true
       
       //check hashmap for key by reference integer
       System.out.println(examscore.containsValue(Integer.valueOf(85)));//true

       //loop for hashmap
       examscore.forEach((sub,score)->{
       System.out.println(sub+" : "+ score);
       });
        
       //loop for hashmap replace
       examscore.forEach((sub,score)->{
       examscore.replace(sub,score+10);
       });
       System.out.println(examscore.toString());
   
        
       // clear the hashmap
       examscore.clear();
       System.out.println(examscore.toString());

       //checj=k hashmap is empty
       System.out.println(examscore.isEmpty());//true
  }
} 