package upl.persegi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class PersegiTest {

	private Persegi persegi;
	
	@BeforeEach
	public void setUp() {
		persegi = new Persegi(5);
	}
	
	@Test
	@DisplayName("Luas Persegi")
	public void testLuasPersegi() {
		assertEquals(25, persegi.hitungLuas());
	}
	
	@Test
	@DisplayName("Panjang Sisi")
	public void testPanjangSisi() {
		assertEquals(5, persegi.getPanjangSisi());
	}
	
	@Test
	@DisplayName("Keliling Persegi")
	public void testKelilingPersegi() {
		assertEquals(20, persegi.hitungKeliling());
	}
}
