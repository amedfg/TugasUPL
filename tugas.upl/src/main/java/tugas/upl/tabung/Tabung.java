package tugas.tabung;

import tugas.lingkaran.Lingkaran;

public class Tabung extends Lingkaran{
	private double tinggi;

	public Tabung(double jarijari, double tinggi) {
		super(jarijari);
		this.tinggi = tinggi;
	}

	public double hitungVolume() {
		return this.hitungLuas() * tinggi;
	}
	
	public double hitungSelimut() {
		return (this.hitungLuas() * 2) + (this.hitungKeliling() * tinggi);
	}
}
