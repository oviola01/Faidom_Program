/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Program;

import idom.Gomb;
import idom.Hasab;
import idom.Faidom;
//import java.util.ArrayList;
//import java.util.List;

/**
 *
 * @author OlajosViola(SZF_E_20
 */
public class Faidomok {
    
    //public static List<Faidom> idomok;    
    public static Faidom idomok[];    
    
    public Faidomok() {
       /*
        idomok=new ArrayList<>();
        idomok.add(new Gomb(4.4));
        idomok.add(new Hasab(1.3, 3.1, 2.2));
        idomok.add(new Hasab(1.2, 1.2, 4.4));
        idomok.add(new Gomb(2.4));
        idomok.add(new Hasab(2.2, 1.1, 3.2));
        */
        idomok=new Faidom[5];
        idomok[0]=new Gomb(4.4);
        idomok[1]=new Hasab(1.3, 3.1, 2.2);
        idomok[2]=new Hasab(1.2, 1.2, 4.4);
        idomok[3]=new Gomb(2.4);
        idomok[5]=new Hasab(2.2, 1.1, 3.2);
    }
    
    public void run(){
        double sulySum=osszSuly();
        double gombSum=osszGombSuly();
        Faidom minVidom=minV();
        System.out.println("A legkisebb térfogatú idom: "+minVidom);
        Faidom maxVidom=maxV();
        System.out.println("A nagyobb térfogatú idom: "+maxVidom);
    }

    private double osszSuly() {
        double sum=0;
        for(Faidom idom:idomok){
            sum+=idom.suly();
        };
        return sum;
    }

    private double osszGombSuly() {
        double sum=0;
        for(Faidom idom:idomok){
            if(idom instanceof Gomb)sum+=idom.suly();
        };
        return sum;
    }

    private Faidom minV() {
        int i=0;
        int melyik=0;
        while(i<idomok.length-1){
            if(idomok[i].terfogat()<idomok[i+1].terfogat()) melyik=i;
            i++;
        }
        return idomok[melyik];
    }

    private Faidom maxV() {
        int i=0;
        int melyik=0;
        while(i<idomok.length-1){
            if(idomok[i].terfogat()>idomok[i+1].terfogat()) melyik=i;
            i++;
        }
        return idomok[melyik];
    }
    
   
    
}
