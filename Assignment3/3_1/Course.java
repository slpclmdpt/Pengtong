package Assignment3_1;

import java.util.Arrays;

public class Course {
	private String title;
	private int numberOfStudent = 0;

	// Constructor
	Course(String title) {
		this.title = title;
	}

	// Array to store registered students
	Student[] students = new Student[10];

	// Accessor of registered students' array
	public Student[] getStudents() {
		return students;
	}

	public boolean isFull() {
		if (this.numberOfStudent == 10)
			return true;
		else
			return false;
	}

	public int getNumberOfStudent() {
		return this.numberOfStudent;
	}

	public String getTitle() {
		return title;
	}

	public void registerStudent(Student student) {
		// Class is not full
		if (!this.isFull()) {
			students[numberOfStudent] = student;
			this.numberOfStudent++;
			System.out.printf("%s registered in %s successfully.\n", student.getName(), this.getTitle());
		}
		// Class is full
		else
			System.out.printf("%s is full, %s cannot register.\n", this.getTitle(), student.getName());
	}
}
