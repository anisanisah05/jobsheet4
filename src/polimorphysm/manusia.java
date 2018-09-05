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
public abstract class manusia {
    public double TinggiBadan;
    
    public manusia (double TB) 
{
TinggiBadan = TB;
}
//getter
public double getter()
{
return TinggiBadan;
}
//method HtgBBI
public double HtgBBI()
{
return 0.0;
}
}
