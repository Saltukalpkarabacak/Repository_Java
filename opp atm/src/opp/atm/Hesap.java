package opp.atm;

public class Hesap {
private String kullanıcıadı ;

private String parola ;

private int bakiye ;



public Hesap(String kullanıcıadı, String parola, int bakiye) {
    
this.kullanıcıadı = kullanıcıadı;
this.parola = parola;
this.bakiye = bakiye;
}


public void parayatırma(int tutar){

bakiye += tutar ;

System.out.println("Güncel bakiyeniz :" +bakiye);

}

public void paraçek(int tutar){
if(bakiye - tutar < 0){

System.out.println("Bu tutarı çekebilecek yeterli bakiyeniz bulunmamaktadır");    
    
}   
if(tutar <= 1500){
    
bakiye -= tutar ;

System.out.println("Güncel bakiyeniz :" +bakiye);
} 
else{
    
System.out.println("1500 TL den fazala para çekemezsiniz"); 
    
}
}





    /**
     * @return the kullanıcıadı
     */
    public String getKullanıcıadı() {
        return kullanıcıadı;
    }

    /**
     * @param kullanıcıadı the kullanıcıadı to set
     */
    public void setKullanıcıadı(String kullanıcıadı) {
        this.kullanıcıadı = kullanıcıadı;
    }

    /**
     * @return the parola
     */
    public String getParola() {
        return parola;
    }

    /**
     * @param parola the parola to set
     */
    public void setParola(String parola) {
        this.parola = parola;
    }

    /**
     * @return the bakiye
     */
    public int getBakiye() {
        return bakiye;
    }

    /**
     * @param bakiye the bakiye to set
     */
    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }
    
}
