package tugas.lingkaran;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

class LingkaranTest {
	private Lingkaran lingkaran;
	
	@BeforeEach
	public void setUp() {
		lingkaran = new Lingkaran(7);
	}
	
	@Test
	@DisplayName("Hitung Luas Lingkaran.")
	public void testLuasLingkaran() {
		assertEquals(154, lingkaran.hitungLuas());
	}
	
	@Test
	@DisplayName("Hitung Keliling Lingkaran.")
	public void testKelilingLingkaran() {
		assertEquals(44, lingkaran.hitungKeliling());
	}
	
	@Test
	@DisplayName("Hitung Diameter")
	public void testDiameter() {
		assertEquals(14, lingkaran.getDiameter());
	}

}
