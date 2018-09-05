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
public class Abstractsample {
    public static void main(String [] args){
    bangundatar obyek1 = new bujursangkar(10);
     System.out.println("luas bujur sangkar dengan sisi 10 = "+ obyek1.hitungLuas());
     System.out.println("kelilingnya = "+ obyek1.hitungKeliling());
     System.out.println("\n");
     
     bangundatar obyek2 = new lingkaran(7);
     System.out.println("luas lingkaran dengan jari jari 7 = "+ obyek2.hitungLuas());
     System.out.println("kelilingnya = "+obyek2.hitungKeliling());
    
    }
}
