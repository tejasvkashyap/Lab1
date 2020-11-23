
import java.util.*;
import java.io.*;
import java.io.InputStreamReader;

public class stud implements regi{

       Scanner get = new Scanner(System.in);
       public stud(){
       }
       public String newstd(){
            System.out.println("Enter the new student name");
            String name = get.nextLine();
            return name;
       }

}