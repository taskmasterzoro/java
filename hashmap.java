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
    }
} 