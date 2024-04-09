import java.time.LocalDate;

public  class library {
    public static void main(String[] args) {
        user youngeruser=new user(); 
        youngeruser.name="Mohit Jr.";
        youngeruser.birthday=LocalDate.parse("2007-05-13");
        System.out.printf("%s was born back in %s .\n",youngeruser.name,youngeruser.birthday.toString());
        System.out.println("Now  he is " + youngeruser.age()+ " years old.");
    }
}
