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
public final class perempuan extends manusia {
     public perempuan (double TB)
    {
        super(TB);
    }
    //Method HtgBBI
    public double HtgBBI()
    {
        return (super.getter()-100)*0.8;
    }

}
