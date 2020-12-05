
import java.util.ArrayList;

public class Sınger {

    private ArrayList< String> singers = new ArrayList<String >();
    
    public void singerlist(){
        
        System.out.println("There are "+ singers.size()+" singer this list");
        System.out.println(" ");
        
         for (int i = 0; i < singers.size(); i++) {
            System.out.println((i+1) + ". singer is "+singers.get(i));
         }
      
    }
    
   public void  addsinger(String a){
      singers.add(a);
      System.out.println(a+" is added to list");
       
   }

   public void setsinger(int a1 , String a ){
     singers.set(a1, a);
     System.out.println(a1+". "+a+" was set");
     
   }
   
   public void removesinger (int a){
     singers.remove(a);
     System.out.println(a+" ) "+singers.get(a)+". singer removed");
       
   }

   public void searchsinger(String a){
       
       for (int i = 0; i < singers.size(); i++) {
           
           if (a.equalsIgnoreCase(singers.get(i)) ) {
               
               System.out.println("your singers number is "+(i+1)+" ) "+singers.get(i));
           }
           else{
               System.out.println(" Singers not found ");
           }
           
       }
   
       
   }






    
}
