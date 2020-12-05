
import java.util.Scanner;

public class Yolcu implements IYurtDışıKuralları {
    
private final int harc ;
 private final boolean siaysiYasak;
  private final boolean vizeDurumu;
  
    public Yolcu() {
       
    Scanner sc = new Scanner (System.in);
   
    System.out.println("Yatırılan harç bedeli");
    this.harc= sc.nextInt();
    sc.nextLine();
       
    System.out.println("Herahngi bir siyasi yasağınız var mı(evet/hayır) ?");
    String c = sc.nextLine();
    
    this.siaysiYasak = c.equalsIgnoreCase("evet");
        
    System.out.println("Vizeniz var mı(evet/hayır)?");
    String v = sc.nextLine();
    
    this.vizeDurumu = v.equalsIgnoreCase("evet");
            
     
    }

    @Override
    
    
   public boolean yurtdisiharci() {
        if (this.harc < 15) {
            System.out.println("Lütfen harcı tam yatırın"); 
            return false;
        } else {
            System.out.println("Yurt dışı harcı işlemi tamam");
            return true;      
        }
        
    }

    @Override
    public boolean siyasiyasak() {
        if (this.siaysiYasak == true) {
            System.out.println("Siyasi yasağından dolayı yurt dışına çıkamazsın");  
            return false ;
        } else {
            System.out.println("Yurt dışına çıkabilirsin");
            return true;         
        }
        
    }

    @Override
    public boolean vizedurumu() {
        if (this.vizeDurumu == true) {
            System.out.println("Vize işlemleri tamam!"); 
            return true ;
        } else {
            System.out.println("Vizeniz bulunmamakta"); 
            return false;
        }
        
    }

    




}
