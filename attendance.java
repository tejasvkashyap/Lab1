import java.util.*;
import java.io.*;
import java.io.IOException;
import java.io.InputStreamReader;
import packages.*;


class attendance
{
         public static void main(String[] args) throws IOException {
            strings welc = new strings();
            welc.stringbuffer();

            //command-line argument
            if(args.length>0){
                thr t = new thr(); 
                t.start();
	        attend Obj = new attend(args[0]);
            }
            else{
                Thread r = new Thread(new runa()); 
                r.start();
		attend Obj = new attend();
            }  
           welc.stri();
         }
}