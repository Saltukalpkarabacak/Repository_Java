
import java.util.Scanner;

public class Main {
    
private static Sınger sınger = new Sınger ();
private static Scanner sc = new Scanner (System.in);

public static void printsinger (){
 sınger.singerlist();
}

public static void addsinger(){
System.out.println("Enter which singer add you want");
String a = sc.nextLine();
sınger.addsinger(a);
}

public static void updatesinger(){
System.out.println("Enter which singer update (singers number and new singer name) you want )");    
System.out.println("**** Enter singernumber***");
int a1 = sc.nextInt();
sc.nextLine();
System.out.println("**** Enter new singername ***");
String a = sc.nextLine();
sınger.setsinger(a1, a);
}

public static void removesinger(){
System.out.println("Enter singer number which singer remove you want");  
int a = sc.nextInt();
sınger.removesinger(a);
} 

public static void searchsinger(){
System.out.println("Enter singer name which singer search you want");  
String a = sc.nextLine();
sınger.searchsinger(a);
}

public static void printop(){

    System.out.println("\t 0-Print operation ");
     System.out.println("\t 1-Print Singers ");
      System.out.println("\t 2-Add singers ");
       System.out.println("\t 3-Update sinnger ");
        System.out.println("\t 4-Remove singer ");
         System.out.println("\t 5-Search singer");
          System.out.println("\t 6-Exıt to aplication ");
}
public static void main (String []args){
 
    System.out.println("\t Welcome to singer spoti");    
    
    printop();
    
    boolean exıt  = false ;
    
    int operation ;
    
    while (!exıt) {        
    
       System.out.println(" Enter operation number ");    
        
       operation = sc.nextInt();
       
       sc.nextLine();
       
       switch(operation){
           
           case 0 : printop(); break ;
           case 1 : printsinger(); break ;
           case 2 : addsinger(); break ;
           case 3 : updatesinger(); break ;
           case 4 : removesinger(); break ;
           case 5 : searchsinger(); break ;
           case 6 : exıt = true  ; System.out.println("Exiting the application...");  break ;
           
           
       }
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}    
    
}
