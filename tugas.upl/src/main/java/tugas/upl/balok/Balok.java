package tugas.upl.balok;

import tugas.upl.persegiPanjang.PersegiPanjang;

public class Balok extends PersegiPanjang {
	private double tinggi;

	public Balok(double panjang, double lebar, double tinggi) {
		super(panjang, lebar);
		this.tinggi = tinggi;
	}

	public double hitungVolume() {
		double luas = this.hitungLuas();

		return tinggi * luas;
	}

	public double hitungLuasBalok() {
		double luas2pl = 2 * this.getPanjang() * this.getLebar();
		double luas2pt = 2 * this.getPanjang() * tinggi;
		double luas2lt = 2 * this.getLebar() * tinggi;
		
		return luas2pl + luas2pt + luas2lt;
	}

}
