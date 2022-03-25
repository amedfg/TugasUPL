package tugas.Tabung;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

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
	
	
}
