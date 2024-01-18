/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package idom;

/**
 *
 * @author OlajosViola(SZF_E_20
 */
public abstract class Faidom {
    public static final double fajsuly=0.8;

    public double suly(){
        return this.terfogat()*fajsuly;
    } 
    
    public double terfogat(){
        return 0.0;
    }    

    @Override
    public String toString() {
        return "Faidom{" + "fajsuly=" + fajsuly + '}';
    }
    
    
}
