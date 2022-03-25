package tugas.Tabung;

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
}
