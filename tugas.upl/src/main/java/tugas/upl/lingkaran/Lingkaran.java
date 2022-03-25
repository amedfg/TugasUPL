package tugas.lingkaran;

public class Lingkaran {
	private double jarijari;

	public Lingkaran(double jarijari) {
		this.jarijari = jarijari;
	}

	public double hitungLuas() {
		return 22 * jarijari * jarijari / 7;
	}

	public double getJarijari() {
		return this.jarijari;
	}

	public double getDiameter() {
		return this.jarijari * 2;
	}

	public double HitungKeliling() {
		return this.jarijari * 2 * 22 / 7;
	}
}
