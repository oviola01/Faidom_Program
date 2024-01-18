/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package idom;

/**
 *
 * @author OlajosViola(SZF_E_20
 */
public class Hasab extends Faidom {

    private double hossz;
    private double szel;
    private double mag;
    
    public Hasab(double hossz, double szel, double mag) {
        this.hossz=hossz;
        this.szel=szel;
        this.mag=mag;
    }

    @Override
    public double terfogat(){
        return this.hossz*this.szel*this.mag;
    }    

    @Override
    public String toString() {
        return "Hasab{" + "hossz=" + hossz + ", szel=" + szel + ", mag=" + mag + '}';
    }
    
    

}
