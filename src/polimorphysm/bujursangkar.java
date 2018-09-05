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
public class bujursangkar extends bangundatar {
    private double sisi;
    
    public bujursangkar(double sisi){
    this.sisi = sisi;
    }
    public double hitungKeliling(){
    return 4 * sisi;
    }
    public double hitungLuas(){
    return sisi*sisi;
    }
}
