package tugas.upl.persegiPanjang;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PersegiPanjangTest {
	private PersegiPanjang perpan;
		
	@BeforeEach
	void setUp() throws Exception {
		perpan = new PersegiPanjang(5,7);
	}

	@Test
	@DisplayName("Nilai sisi Panjang")
	void testPanjang() {
		assertEquals(5, perpan.getPanjang());
	}
	
	@Test
	@DisplayName("Nilai sisi Lebar")
	void testLebar() {
		assertEquals(7, perpan.getLebar());
	}
	
	@Test
	@DisplayName("Luas Persegi Panjang")
	void testLuas() {
		assertEquals(35, perpan.hitungLuas());
	}
	
	@Test
	@DisplayName("Keliling Persegi Panjang")
	void testKeliling() {
		assertEquals(24, perpan.hitungKeliling());
	}

}
