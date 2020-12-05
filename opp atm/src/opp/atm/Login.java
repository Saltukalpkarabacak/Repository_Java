package opp.atm;

import java.util.Scanner;

public class Login {
 
public  boolean login(Hesap hesap){
  
Scanner sc = new Scanner (System.in );    
 
System.out.println("Kulannıcı adınızı girin :");

String kullanıcıadı = sc.nextLine();

System.out.println("Parola :");
    
String parola = sc.nextLine();

if(hesap.getKullanıcıadı().equals(kullanıcıadı) && hesap.getParola().equals(parola)){
    
return true ;}

else{
    
return false ;}

}      
    
}
