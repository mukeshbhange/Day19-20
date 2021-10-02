package serviceimpl;

import model.Student;
import service.IServiceInterface;
import utility.*;

public class StudentServiceImpl implements IServiceInterface{
	private static StudentServiceImpl service;
	public StudentServiceImpl() {
		
	}

	@Override
	public void addStudent(Student student) {
		Student std = Student.getInstance();
		Validation validate = Validation.getInstance();
		
		std.setFname(UtilityScanner.getString("First Name:"));
		boolean fName = validate.isFirstLetterCapital(std.getFname());
		while(fName != true) {
			System.out.println("First Letter Must be Capital.\nMax-length is 10\n"
					+ "RE-Enter FirstName");
			std.setFname(UtilityScanner.getString("First Name:"));
			fName = validate.isFirstLetterCapital(std.getFname());
		}
		
		std.setLname(UtilityScanner.getString("Last Name:"));
		boolean lName = validate.isFirstLetterCapital(std.getLname());
		while(lName != true) {
			System.out.println("First Letter Must be Capital.\nMax-length is 10\n"
					+ "RE-Enter Last Name");
			std.setLname(UtilityScanner.getString("Last Name:"));
			fName = validate.isFirstLetterCapital(std.getLname());
		}
		
		std.setEmail(UtilityScanner.getString("Email :"));
		boolean email = validate.validateEmail(std.getEmail());
		while(email != true) {
			System.out.println("Enter Proper Email Format");
			std.setEmail(UtilityScanner.getString("Email:"));
			email = validate.validateEmail(std.getEmail());
		}
		
		std.setMobile(UtilityScanner.getString("Mobile No.:"));
		boolean mobile = validate.validateMobile(std.getMobile());
		while(mobile != true) {
			System.out.println("Enter Correct Mobile number.\n"
					+ "Format is: countrycode - Ten digits");
			std.setMobile(UtilityScanner.getString("RE-Enter Mobile No:"));
			mobile = validate.validateMobile(std.getMobile());
		}
		
		std.setPassword(UtilityScanner.getString("Password:"));
		boolean password = validate.validatePassword(std.getPassword());
		while(password != true) {
			System.out.println("Must Contain 1.Uppercase\n2.Numeric"
					+ "\3.exactly one SpecialChar"
					+ "\n4.Min-length: 8"
					+ "RE-Enter Email");
			
			std.setPassword(UtilityScanner.getString("RE-Enter password:"));
			password = validate.validatePassword(std.getPassword());
		}
		
	}
	
	public static StudentServiceImpl getInstance() {
		if(service == null) {
			return service = new StudentServiceImpl();
		}
		return service;
	}
	
}

