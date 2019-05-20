import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

class PasswordGeneratorTest {

	// 1 8 caracteres
	// 2 1,3,5,7 numericos aletorios
	// 3 2,4,6,8 alfapahanumericos
	// 4 si son letras pasela a mayusculas

	@Test
	void testPasswordGeneratorNotShoulbBeNotNull() {
		PaswordGenerator password = new PaswordGenerator();
		assertNotNull(password.getPassword());
	}

	@Test
	void testPasswordGeneratorNotShoulbBeMajorThan8() {
		PaswordGenerator password = new PaswordGenerator();
		assertEquals(8, password.getPassword().length());
	}

	@Test
	void testPasswordGeneratorwithAValueWhenValueIsNotPair() {
		PaswordGenerator password = new PaswordGenerator();
		char[] values = password.getPassword().toCharArray();
		//System.out.println(password.getPassword());
		for (int i = 0; i < password.getPassword().length(); i = i + 2) {
			try {
				Integer.parseInt(String.valueOf(values[i]));
			} catch (NumberFormatException e) {
				fail();
			}
		}

	}

	@Test
	void testPasswordGeneratorwithAValueWhenValueIsPair() {
		PaswordGenerator password = new PaswordGenerator();
		char[] values = password.getPassword().toCharArray();
		System.out.println(password.getPassword());
		for (int i = 1; i < password.getPassword().length(); i = i + 2) {
			String value = String.valueOf(values[i]);
			assertNotNull(value);
		}

	}

}
