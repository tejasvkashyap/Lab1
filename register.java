import java.util.*;
import java.io.*;
 
public class register 
{
    public String name;
    public String course;
    public int marks;
    public int reg;
    Scanner s = new Scanner(System.in);
    public register()
    {
       System.out.println("Welcome!");
    }
    // Costructer overloading
    public register(int marks)
    {
        System.out.println("Welcome!");
        this.marks = marks;
    }
    public void add()
    {
        System.out.println("Enter the Name:");
        name = s.nextLine();
        System.out.println("Enter the course Name:");
        course = s.nextLine();
        System.out.println("Enter the register Number:");
        reg = s.nextInt();
        System.out.println(" "+"Name"+"           "+"register No"+"           "+ "course"+"           "+"Marks");
        displayre();
    }
    
    public void displayre()
     {
        System.out.println(" "+name+"             "+reg+"                 "+ course+"           "+this.marks+"");
     }
   // method overloading
    public void displayre(int mar)
     {
        System.out.println(" "+name+"             "+reg+"                 "+ course+"");
     }
}