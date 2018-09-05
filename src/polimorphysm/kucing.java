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
public class kucing extends hewan{
    @Override
    void setNama(){
    String kucing = "carberius";
    System.out.println("nama kucing : "+kucing);
    }
    @Override
            void setSuara(){
    String suara = "miaw meow meong";
                System.out.println("suara kucing : "+suara);
            }
@Override
void setBerat(){
double berat= 2.0;
System.out.println("berat kucing : "+berat+"kg");
}
}