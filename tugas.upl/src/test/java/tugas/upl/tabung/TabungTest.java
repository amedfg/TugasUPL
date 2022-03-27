package tugas.tabung;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

class TabungTest {
	private Tabung tabung;
	
	@BeforeEach
	public void setUp() {
		tabung = new Tabung(7 , 3);
	}
	
	@Test
	@DisplayName("Hitung volume tabung.")
	public void testVolumeTabung() {
		assertEquals(462, tabung.hitungVolume());
	}
	
	@Test
	@DisplayName("Hitung luas selimut tabung.")
	public void testSelimutTabung() {
		assertEquals(440, tabung.hitungSelimut());
	}
}
