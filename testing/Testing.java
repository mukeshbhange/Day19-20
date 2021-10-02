package testing;

import static org.junit.Assert.*;
import org.junit.Test;
import model.Student;
import serviceimpl.StudentServiceImpl;
import utility.Validation;

public class Testing {
	StudentServiceImpl service;
	Validation validation = Validation.getInstance();
	Student student = Student.getInstance();
	
	@Test
	public void testFirstNameHappyCase() {
		assertTrue(validation.isFirstLetterCapital("Mukesh"));
		assertTrue(validation.isFirstLetterCapital("Muk"));
	}
	
	@Test
	public void testFirstNameSadCase() {
		assertFalse(validation.isFirstLetterCapital("mukesh"));
		assertFalse(validation.isFirstLetterCapital("Mu"));
		assertFalse(validation.isFirstLetterCapital("Mu9"));
		assertFalse(validation.isFirstLetterCapital("@Mukesh"));
	}
	
	@Test
	public void testLastName() {
		assertEquals(true,validation.isFirstLetterCapital("Bhange"));
	}
	
	@Test
	public void testLastNameSadCase() {
		assertFalse(validation.isFirstLetterCapital("bhange"));
		assertFalse(validation.isFirstLetterCapital("Bu"));
		assertFalse(validation.isFirstLetterCapital("Bh39"));
		assertFalse(validation.isFirstLetterCapital("@Bhange"));
	}
	
	@Test
	public void testEmailHappyCase() {
		assertEquals(true,validation.validateEmail("abc@yahoo.com"));
		assertEquals(true,validation.validateEmail("abc-100@yahoo.com,"));
		assertEquals(true,validation.validateEmail("abc.100@yahoo.com"));
		assertEquals(true,validation.validateEmail("abc111@abc.comabc-100@abc.net"));
		assertEquals(true,validation.validateEmail("abc.100@abc.com.au"));
		assertEquals(true,validation.validateEmail("abc@1.com"));
		assertEquals(true,validation.validateEmail("abc@gmail.com.com"));
		assertEquals(true,validation.validateEmail("abc+100@gmail.com"));		
	}
	
	@Test
	public void testEmailSadCase() {
		assertFalse(validation.validateEmail("Mukesh@gmail.com"));
	}
	
	@Test
	public void testMobileNo() {
		assertEquals(true,validation.validateMobile("9767541939"));
	}
	
	@Test
	public void testPasswordSad() {
		assertEquals(false,validation.validatePassword("mukesh@999"));
		assertEquals(false,validation.validatePassword("Brn@99"));
		assertEquals(false,validation.validatePassword("abcdefghy"));
	}
	
	@Test
	public void testPasswordHappy() {
		assertEquals(true,validation.validatePassword("BHange$123"));
		assertEquals(true,validation.validatePassword("Mukesh@99"));
		assertEquals(true,validation.validatePassword("MUKESHe@998"));
	}
}
