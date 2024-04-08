import java.util.ArrayList;
import java.util.Comparator;
public class arraylist {
    public static void main(String[] args) {
    ArrayList<Integer> number=new ArrayList<Integer>();
    // int double float boolean primitive data types
    // reference type using the wrapper class
    //Integer Double Float Boolean  Character Void
    
    number.add(1);//adding elements to list
    number.add(2);
    number.add(3);
    number.add(4);
    number.add(5);
    System.out.println(number.toString());
    System.out.println(number.get(3));
    //accessing element by index
    System.out.printf("size of array %d\n",number.size());
    //to get size of array or list
    // removing the element from list by  its index
    number.remove(2);
    System.out.println(number.toString());
    //removing element from list by value
    number.remove(Integer.valueOf(4));
    System.out.println(number.toString());
    
    // clearing the entire list 
    number.clear();
    System.out.println(number.toString());
    
    number.add(1);//adding elements to list
    number.add(2);
    number.add(3);
    number.add(4);
    number.add(5);
    number.set(2,Integer.valueOf(30));
    // changing the value of an element at a particular index
    System.out.println(number.toString());
    
    number.sort(Comparator.naturalOrder());
    System.out.println(number.toString());
    // sorting the list in ascending order

    // sorting the list in  deceending order
    number.sort(Comparator.reverseOrder());
    System.out.println(number.toString());
     
    // check the list if it contains certain value
    System.out.println(number.contains(Integer.valueOf(10)));
    
    //checking of list is empty
    System.out.println(number.isEmpty());

    System.out.println("Before "+number.toString());

    //loop for list 
    number.forEach(numbe -> {
        number.set(number.indexOf(numbe),numbe*2);
      //  System.out.println(numbe*2);
    });
    System.out.println("After "+number.toString());


    }
    
}
