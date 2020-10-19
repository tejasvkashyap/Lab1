import java.util.*;
import java.io.*;
import java.io.InputStreamReader;
 
final class attendance extends register
{
    String nam;
    static int c;
    public String mark;
    int marks,cho,mar;
    List<register> stud = new ArrayList<>();
    Scanner get = new Scanner(System.in);
    attendance()
    {
       do
       {
       System.out.println("**************************");
       System.out.println(" 1    ADD"); 
       System.out.println(" 2    DELETE");
       System.out.println(" 3    DISPLAY");
       System.out.println(" 4    Exit");
       System.out.println("Enter your choice:");  
       c = get.nextInt();
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
         case 4:
           break;    
         default:
           System.out.println("Enter the correct choice:");
           break;
         }
         }while(c != 4);
     }
     attendance(String mark)
    {
       this.mark = mark;
       //super.register(this.mark);
       //super.add();
       //stud.add(super.add());
       do
       {
       System.out.println("**************************");
       System.out.println(" 1    ADD"); 
       System.out.println(" 2    DELETE");
       System.out.println(" 3    DISPLAY");
       System.out.println(" 4    Exit");
       System.out.println("Enter your choice:");  
       c = get.nextInt();
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
         case 4:
           break;    
         default:
           System.out.println("Enter the correct choice:");
           break;
         }
         }while(c != 4);
     }
    void ad()
    {
        if(this.mark == null)
        {
        System.out.println("Do you have students marks? then press 1:");
        cho = get.nextInt();
        if( cho == 1)
        {
            System.out.println("Enter the marks:");
            marks = get.nextInt();
            register newReg = new register(marks);
            newReg.add();
            stud.add(newReg);
            System.out.println("Added!");
        }
        else{
            register newReg = new register();
            newReg.add();
            stud.add(newReg);
            System.out.println("Added!");
        }
        }
        else{
            System.out.println("Enter the marks again:");
            marks = get.nextInt();
            register newReg = new register(marks);
            newReg.add();
            stud.add(newReg);
            System.out.println("Added!");
        }
    }
    void delete()
    {
        String dnam;
        String garbage = get.nextLine();
        System.out.println("Enter the Name:");
        dnam = get.nextLine();
        
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
        System.out.println("Do you want to show students marks? then press 1:");
        mar = get.nextInt();
        if( mar == 1)
        {
            System.out.println(" "+"Name"+"           "+"register No"+"           "+ "course"+"           "+"Marks");
            for (int i=0; i < stud.size(); i++)
            {
               (stud.get(i)).displayre(); 
            }
        }
        else{
            System.out.println(" "+"Name"+"           "+"register No"+"           "+ "course"+"");
            for (int i=0; i < stud.size(); i++)
            {
                (stud.get(i)).displayre(mar); 
            }
        }
     }
}
 
public class studentad 
{
    public static void main(String[] args)
    {
        Scanner get = new Scanner(System.in);
        //command-line argument
        if(args.length>0){
			attendance Obj = new attendance(args[0]);
        }
		else{
			attendance Obj = new attendance();
         }
        // string class
        char[] bye = { 'B', 'Y', 'E', '.', '.', '.', '!' };
        String bye1 = new String(bye);  
        System.out.println(bye1);
        //System.out.println("BYE...!");
    }
}
