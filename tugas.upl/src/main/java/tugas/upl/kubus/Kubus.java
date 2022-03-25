package upl.kubus;

import upl.persegi.Persegi;

public class Kubus extends Persegi{

    public Kubus(double panjangSisi){
    	super(panjangSisi);
    }

    public double hitungVolume(){
    	
        return this.hitungLuas() * this.panjangSisi;
    }

    public double hitungLuasPermukaan(){

        return 6 * this.hitungLuas() ;
    }
}