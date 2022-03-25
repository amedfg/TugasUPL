package upl.persegi;

public class Persegi{
	protected double panjangSisi;
	protected int jumlahSisi;

	public Persegi(double panjangSisi) {
		this.jumlahSisi = 4;
        this.panjangSisi = panjangSisi;
    }

	public double hitungLuas() {
		return panjangSisi * panjangSisi;
	}

	public double getPanjangSisi() {
		return this.panjangSisi;
	}
	
	public double hitungKeliling() {
		return jumlahSisi * panjangSisi;
	}
	
	public double getDiagonal() {
		return Math.sqrt(2 * (panjangSisi * panjangSisi));
	}
}
