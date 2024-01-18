/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package idom;

/**
 *
 * @author OlajosViola(SZF_E_20
 */
public class Gomb extends Faidom {
    
    private double sugar;
    
    public Gomb(double sugar) {
        this.sugar=sugar;
    }
    
    @Override
    public double terfogat(){
        return (4*Math.pow(this.sugar, 3)*Math.PI)/3;
    }    

    @Override
    public String toString() {
        return "Gomb{" + "sugar=" + sugar + '}';
    }
    
}
