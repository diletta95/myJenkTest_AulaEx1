package myJenkTest;
import org.junit.jupiter.api.*;
import myJenkTest.tutorial.FizzBuzz;

public class FizBuzzTest {
	public FizzBuzz fb;
	
	@BeforeEach
	public void setup() {
		fb = new FizzBuzz();
	}
	
	@DisplayName("Play FizzBuzz with number = 1")
	@Test
	public void testNumber() {
		String risultato = fb.play(1);
		// Verifica che il risultato sia uguale
		Assertions.assertEquals(risultato, "1");
	}
	
	
	
}
