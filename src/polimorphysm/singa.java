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
public class singa extends hewan{
    @Override
    void setNama(){
    String singa = "diablo";
    System.out.println("nama singa : "+singa);
    }
    @Override
    void setSuara(){
    String suara = "roarrr";
    System.out.println("Suara singa : "+suara);
    }
    @Override
     void setBerat(){
     double berat = 10.0;
     System.out.println("berat singa : "+berat+"kg");
     }       
}
