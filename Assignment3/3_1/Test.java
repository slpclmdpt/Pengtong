package Assignment3_1;

public class Test {
	public static void main(String[] args) {
		// Test of the constructor and accessor method of class Student
		Student stu1 = new Student("stu1", 1);
		Student stu2 = new Student("stu2", 2);
		Student stu3 = new Student("stu3", 3);
		Student stu4 = new Student("stu4", 4);
		Student stu5 = new Student("stu5", 5);
		Student stu6 = new Student("stu6", 6);
		Student stu7 = new Student("stu7", 7);
		Student stu8 = new Student("stu8", 8);
		Student stu9 = new Student("stu9", 9);
		Student stu10 = new Student("stu10", 10);
		Student stu11 = new Student("stu11", 11);
		System.out.printf("%s's id is %d\n", stu5.getName(), stu5.getId());
		System.out.println("------------------------------------------");
		// Test of the constructor accessor method of class Course
		Course c1 = new Course("Algorithm");
		Course c2 = new Course("Java");
		Course c3 = new Course("Co-op");
		Course[] courses = new Course[3];
		courses[0] = c1;
		courses[1] = c2;
		courses[2] = c3;
		for (int i = 0; i < courses.length; i++) {
			System.out.printf("Current number of student registered in %s is %d\n", courses[i].getTitle(),
					courses[i].getNumberOfStudent());
		}
		System.out.println("------------------------------------------");
		// Test of the register method of class Course
		c1.registerStudent(stu1);
		c1.registerStudent(stu2);
		c1.registerStudent(stu3);
		c1.registerStudent(stu4);
		c1.registerStudent(stu5);
		c1.registerStudent(stu6);
		c1.registerStudent(stu7);
		c1.registerStudent(stu8);
		c1.registerStudent(stu9);
		c1.registerStudent(stu10);
		c1.registerStudent(stu11);
		c2.registerStudent(stu1);
		c3.registerStudent(stu1);
		System.out.println("------------------------------------------");
		// Test of the isFull method of class Course
		for (int i = 0; i < courses.length; i++) {
			// course is full
			if (courses[i].getNumberOfStudent() == 10) {
				System.out.printf("Class %s's number of registered students is 10 and is full.\n",
						courses[i].getTitle());
			}
			// course is not full
			else {
				System.out.printf("Class %s's number of registered students is %d and is not full.\n",
						courses[i].getTitle(), courses[i].getNumberOfStudent());
			}
		}
		System.out.println("------------------------------------------");
		// Test of the getStudents method of class Course
		for (int i = 0; i < c2.getStudents().length && c2.getStudents()[i] != null; i++) {
			System.out.printf("%s is registered in %s.\n", c2.getStudents()[i].getName(), c2.getTitle());
		}
	}

}
