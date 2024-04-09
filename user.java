import java.time.LocalDate;
import java.time.Period;
public class user {
    public String name; 
    public LocalDate  birthday;//reference type for dates
    public int age(){
        int age= Period.between(this.birthday,LocalDate.now()).getYears();
        return age;
    }
    }
 