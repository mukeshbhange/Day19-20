package studentcontroller;

import model.Student;
import serviceimpl.StudentServiceImpl;

public class DataDashboard {

	public static void main(String[] args) {
		Student student = Student.getInstance();
		StudentServiceImpl service = StudentServiceImpl.getInstance();
		service.addStudent(student);
	}

}
