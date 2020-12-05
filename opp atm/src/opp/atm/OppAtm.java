package opp.atm;

public class OppAtm {
public static void main(String[] args) {
    
ATM atm = new ATM();

Hesap hesap = new Hesap("Saltuk Alp Karabacak","7391456",1000);

atm.çalış(hesap);

System.out.println("Kartınızı alınız");
    
    
    
    
    
}
    
}
