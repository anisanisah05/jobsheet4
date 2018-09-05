/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorphysm;

/**
 *
 * @author NISAH~05
 */
public class InterfaceSample {
    public static void main(String []args){
    InterfaceBujurSangkar obyek1 = new InterfaceBujurSangkar(10){};
    System.out.println("luas bujur sangkar sisi 10 = "+obyek1.hitungLuas());
    System.out.println("kelilingnya = "+obyek1.hitungKeliling());
    System.out.println("\n");
    
    InterfaceBangunDatar obyek2 = new InterfaceSegitiga(6,8){};
    System.out.println("luas segitiga dengan alas 6 dan tiggi 8 = "+ obyek2.hitungLuas());
    System.out.println("kelilingnya = "+ obyek2.hitungKeliling());
    
    }
    
}
