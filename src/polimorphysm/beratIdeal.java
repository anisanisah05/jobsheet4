/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorphysm;

import java.util.Scanner;

/**
 *
 * @author NISAH~05
 */
public class beratIdeal {
   public static void main(String [] args){
       
        Scanner masukan = new Scanner(System.in);
     manusia l = new lakiLaki(0);
     manusia p = new perempuan(0);
     String kelamin;
     
     System.out.println("user1");
     System.out.println("masukan tinggi badan anda = ");
     l.TinggiBadan = p.TinggiBadan = masukan.nextDouble();
     System.out.println("masukan jenis kelamin anda = ");
     kelamin = masukan.next();
     switch(kelamin)
     {
     case"L":System.out.println("berat badan ideal anda adalah = "+l.HtgBBI());
     case"l":System.out.println("berat badan ideal anda adalah = "+l.HtgBBI());
     case"P":System.out.println("berat badan ideal anda adalah = "+p.HtgBBI());
     case"p":System.out.println("berat badan ideal anda adalah = "+p.HtgBBI());
     }
     
     System.out.println("user2");
     System.out.println("masukan tinggi badan anda = ");
     l.TinggiBadan = p.TinggiBadan = masukan.nextDouble();
     System.out.println("masukan jenis kelamin anda = ");
     kelamin = masukan.next();
     switch(kelamin)
     {
     case"L":System.out.println("berat badan ideal anda adalah = "+l.HtgBBI());
     case"l":System.out.println("berat badan ideal anda adalah = "+l.HtgBBI());
     case"P":System.out.println("berat badan ideal anda adalah = "+p.HtgBBI());
     case"p":System.out.println("berat badan ideal anda adalah = "+p.HtgBBI());
     }
}}
