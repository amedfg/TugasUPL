package tugas.upl.persegiPanjang;

public class PersegiPanjang {
	protected double panjang;
	protected double lebar;

	public PersegiPanjang(double panjang, double lebar) {
		this.panjang = panjang;
		this.lebar = lebar;
	}

	public double hitungLuas() {
		return panjang * lebar;
	}

	public double hitungKeliling() {
		return 2 * (panjang + lebar);
	}

	public double getPanjang() {
		return this.panjang;
	}

	public double getLebar() {
		return this.lebar;
	}
}
