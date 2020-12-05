package opp.atm;

import java.util.Scanner;

public class ATM {
    
public void çalış (Hesap hesap){
Scanner sc = new Scanner (System.in); 
    
Login login = new Login() ;


System.out.println("Hoşgeldiniz");

System.out.println("********************************");

System.out.println("Kullanıcı girişi");

System.out.println("********************************");


int girişhakkı = 3 ;

while (true) {        

if ( login.login(hesap) ) {
    
System.out.println("Başarılı giriş"); 
    
break ; }
      

else {
    
girişhakkı -= 1 ;    
    
System.out.println("Hatalı giriş kalan hakkınız : "+girişhakkı);
    
}

if ( girişhakkı == 0 ) {

System.out.println("Giriş hakkınız bitti");    
    
return ; }
} 

System.out.println("*****************************");

    System.out.println("( 1 ) BAKİYE GÖRÜNTÜLE\n"
    +"( 2 ) PARA YATIRMA\n"
    +"( 3 ) PARA ÇEKME\n"
    +"ÇIKIŞ İÇİN < Q > YA BASIN\n");

System.out.println("*******************************");

while (true) {        

System.out.println("İşlem seçiniz");    
    
String müşteri = sc.nextLine();

if( müşteri.equalsIgnoreCase("Q")) {

break ; 

}    

else if ( müşteri.equals("1") ) {
 
System.out.println("Hesabınızdaki tutar :"+hesap.getBakiye());

}    
    
else if( müşteri.equals("2") ) {

System.out.println("Yatırılacak tutarı girin");    
    
int tutar = sc.nextInt();

sc.nextLine();

hesap.parayatırma(tutar);
  
}

else if ( müşteri.equals("3") ) {
    
System.out.println("Çekeceğiniz tutarı girin");

int tutar = sc.nextInt();

sc.nextLine();

hesap.paraçek(tutar);
    
}

else {
    
System.out.println("Geçersiz işlem"); 
    
}
        
}
}


}




    
    

