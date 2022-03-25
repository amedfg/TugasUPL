package tugas.upl.balok;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BalokTest {
	private Balok balok;
	
	@BeforeEach
	void setUp() throws Exception {
		balok = new Balok(3,4,5);
	}

	@Test
	@DisplayName("Volume Balok")
	void testVolumeBalok() {
		assertEquals(60, balok.hitungVolume());
	}
	
	@Test
	@DisplayName("Luas Balok")
	void testLuasBalok() {
		assertEquals(94, balok.hitungLuasBalok());
	}
	
	@Test
	@DisplayName("Luas PersegiPanjang")
	void testLuasPersegiPanjang() {
		assertEquals(12, balok.hitungLuas());
	}
	
}
