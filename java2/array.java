import java.util.Arrays;
class array{
    public static void main(String[] args) {
        char vowels[]=new char[5]; //creating an array of size 5 
        //assigning value to the element of the array
        vowels[0]='a';
        vowels[1]='e';
        vowels[2]='i';
        vowels[3]='o';
        vowels[4]='u';
        // to print entire array using toString
        System.out.print(Arrays.toString(vowels));

    //creating and assigning values to the array
    char ab[]={'a','x','c','d','e'};
    ab[2]='j';
    System.out.print(Arrays.toString(ab));

    //length of array
    System.out.println(vowels.length);
    
    //sorting array
    Arrays.sort(ab);
    System.out.print(Arrays.toString(ab));

    vowels[4]='b';
    int start=1;
    int end=5;
    Arrays.sort(vowels,start,end);
    //it will sort from index 1 to 5 only
    System.out.println(Arrays.toString(vowels));

    // binary search 
    int a=Arrays.binarySearch(vowels,'b');
    System.out.println(Arrays.toString(vowels));
    System.out.println(a);
    

    //binary search with start and ennding point 
    int b=Arrays.binarySearch(vowels,start,end,'i');
    System.out.println(Arrays.toString(vowels));
    System.out.println(b);
    
    //filling the arrays
    Arrays.fill(vowels,'m');
    System.out.println(Arrays.toString(vowels));

    //filling the array from a starting point ot the ending point 
    Arrays.fill(vowels,start,end,'n');
    System.out.println(Arrays.toString(vowels));

    //array  copy
    int num[]={4,5,7,8,6};
    int copy[]=num;
    Arrays.fill(num,0);
    System.out.println(Arrays.toString(num));
    System.out.println(Arrays.toString(copy));
    /* num= [0, 0, 0, 0, 0]
    copy= [0, 0, 0, 0, 0] 
     */
    // arrays in java are refrenve type 
    /* it creates a new variable and points that variable 
    to the original source arrays  memory location*/
     
    //copy of array without this problem 
    int copy1[]=Arrays.copyOf(num,num.length);
    System.out.println(Arrays.toString(copy1));
     
    // copy to range 
    int copy2[] = Arrays.copyOfRange(num,2,num.length);
    System.out.println(Arrays.toString(copy2));

    //equals to 
    System.out.println(Arrays.equals(num,copy1));//true

 


    }
} 