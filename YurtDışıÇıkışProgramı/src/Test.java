public class Test {
    
public static void main (String[]args) throws InterruptedException{
    
    System.out.println("Havalimanına hoşgeldin");    
    
    String şartlar = "---Yurtdışı çıkış kuralları---\n"
            + "Herhangi bir siyasi yasağın bulunmaması gerekiyor\n"
            + "15 tl harç ücretini tam yatırmanız gerekiyor\n"
            + "Gideceğiniz ülkeye vizenizin bulunması gerekiyor\n";
    
    String mesaj = "Yurt dışı şartlarından hepsini sağlamanız gerekiyor";
    
    while (true) {        
        
        System.out.println("*****************************");  
          System.out.println(şartlar); 
        System.out.println("*****************************");
        
        
        Yolcu y = new Yolcu ();
        
        System.out.println("Harç kontrol ediliyor...");
        
        Thread.sleep(3000); //programı üç sn beklettim
        
        if (y.yurtdisiharci() == false) {
            System.out.println(mesaj);
            continue; // döngünün başına gider
        } 
        System.out.println("Siyasi yasak kontrol edliyior");
          
          Thread.sleep(3000); //programı üç sn beklettim
        
         if (y.siyasiyasak() == false) {
             
             System.out.println(mesaj);
             continue; // döngünün başına gider
        }
        System.out.println("Vize durumu kontrol ediliyor");
        
        Thread.sleep(3000); //programı üç sn beklettim
        
        if (y.vizedurumu() == false) {
            System.out.println(mesaj);
            continue;
        }
        System.out.println("Yurt dışına çıkabilirsiniz...");
        break;
    }
    
    
    
    
    
    
    
    
    
    
}    
    
}
