import java.util.*;
import java.io.*;
 
class attendance 
{
    String name;
    List<String> stud = new ArrayList<>();
    Scanner get = new Scanner(System.in);
    attendance()
    {
       
       System.out.println("**************************");
       System.out.println(" 1    ADD"); 
       System.out.println(" 2    DELETE");
       System.out.println(" 3    DISPLAY");
       System.out.println("Enter your choice:");  
       int c = get.nextInt();
       switch (c) {
         case 1:
           ad();
           break;
         case 2:
           delete();
           break;
         case 3:
           display();
           break;    
        default:
           System.out.println("Enter the correct Choice");
         };
     }
    void ad()
    {
        String garbage = get.nextLine();
        System.out.println("Enter the Name:");
        String nam = get.nextLine();
        stud.add(nam);
        System.out.println("Added!");
        display();
    }
    void delete()
    {
        String nam;
        String garbage = get.nextLine();
        System.out.println("Enter the Name:");
        nam = get.nextLine();
        boolean t = stud.contains(nam);
        if(t==true)
        {
            stud.remove(nam);
            System.out.println("Deleted!");
        }
        else
        {
            System.out.println("This Student is not in the Student List");
        }
    }
    void display()
     {
        for (int i=0; i < stud.size(); i++)
        {

            System.out.println(" " + i + "           "+ stud.get(i)); 
        }
     }
}
 
public class studentad 
{
    public static void main(String[] args)
    {
        Scanner get = new Scanner(System.in);
        attendance Obj = new attendance();
        Obj.delete();
    }
}