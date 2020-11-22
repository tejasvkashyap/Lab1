
import java.util.*;
import java.io.*;
import java.io.IOException;
import java.io.InputStreamReader;
import packages.*;

final public class attend extends stud
{
        
        private static int c,i,n;
        public String st,p;
        String[] cms = {"Tejas","Sajet","Laxmy","Rahul","Ankur","Adharsh","abhay","bharath","karthik","angel"};
        String[] cme = {"Dhanush","supreeth","namrutha","yashasvini","sparsha","pani","manasa","harshitha","anjali","yana"};
        String[][] sect = {cms,cme};
        int[] absent = new int[10];
        Scanner get = new Scanner(System.in);
        attend(){
           do
           {
           System.out.println("**************************");
           System.out.println(" 1    Add absentees"); 
           System.out.println(" 2    DISPLAY absentees");
           System.out.println(" 3    Add new students");
           System.out.println(" 4    Exit");
           System.out.println("Enter your choice:"); 
           c = get.nextInt();
           switch (c) {
             case 1:
               add();
               break;
             case 2:
               display();
               break;
             case 3:
               newstd();
               break;
             case 4:
               break;    
             default:
               System.out.println("Enter the correct choice:");
               break;
            }
            }while(c != 4);
         }
 
         attend(String st){
           this.st = st;
           do
           {
           System.out.println("**************************");
           System.out.println(" 1    Add absentees"); 
           System.out.println(" 2    DISPLAY absentees");
           System.out.println(" 3    Add new students");
           System.out.println(" 4    Exit");
           System.out.println("Enter your choice:");  
           c = get.nextInt();
           switch (c) {
             case 1:
               try {
               add(this.st);
               }catch(Exception m){System.out.println("Exception occured:"+m);}
               break;
             case 2:
               display();
               break;
             case 3:
               newstd();
               break;
             case 4:
               break;    
             default:
               System.out.println("Enter the correct choice:");
               break;
            }
            }while(c != 4);
         }
         
      void add(){
          try
          {
          System.out.println("**************************");
          System.out.println(" 1    CMS"); 
          System.out.println(" 2    CME");
          System.out.println("Enter your choice:");
          i = get.nextInt();
          i = i-1;
          System.out.println("Enter number of absentees:");
          n = get.nextInt(); 
          System.out.println("Enter absentees numbers:");
          for (int j = 0; j < n;j++){
               int num = get.nextInt();
               absent[j] = num;
          }
          }catch(Exception e){
              e.printStackTrace();
	   }
          display();
      }

      void add(String p)throws myexception{
          this.p = p;
          System.out.println(this.p);
          if(this.p.equals("cms")==true){
          i=0;
          }
          if(this.p.equals("cme")==true){
          i=1;
          }
          else{
          throw new myexception("Enter the correct choice");
          }
          System.out.println("Enter number of absentees:");
          n = get.nextInt();
          System.out.println("Enter absentees numbers:");
          for (int j = 0; j < n;j++){
               int num = get.nextInt();
               absent[j] = num;
          }
          display();
      }

      public String newstd(){
          System.out.println("**************************");
          System.out.println(" 1    CMS"); 
          System.out.println(" 2    CME");
          System.out.println("Enter your choice:");
          i = get.nextInt();
          i = i-1;
          int j = sect[i].length +1;
          if(i==0){
          cms[i] = super.newstd();
          }
          else{
          cme[i-1] = super.newstd();
          }
          System.out.println("The new list of students are:");
          for (int k = 0;k <sect[i].length; k++){
               System.out.println(sect[i][k] + " ");
           }
       return null; 
      }

      void display(){
          try
          {
          System.out.println("The absentees are:");
          for (int j = 0;j <n; j++){
               System.out.println(sect[i][absent[j]] + " ");
           }
           }catch(Exception e){
              e.printStackTrace();
	   }
      }
}