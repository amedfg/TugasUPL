package upl.kubus;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import upl.persegi.Persegi;

class KubusTest {
	private Kubus kubus;

	@BeforeEach
	public void setUp() {
		kubus = new Kubus(5);
	}
	
	@Test
	@DisplayName("Volume Kubus")
	public void hitungVolume() {
		assertEquals(125, kubus.hitungVolume());
	}
	
	@Test
	@DisplayName("Luas Permukaan Kubus")
	public void hitungLuasPermukaan() {
		assertEquals(150, kubus.hitungLuasPermukaan());
	}

}
