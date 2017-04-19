package design_pattern.ch01.check05;

public class TestMain {
	public static void main(String[] args) {
		Course c1 = new Course("Java");
		Course c2 = new Course("android");
		Course c3 = new Course("Database");
		Course c4 = new Course("Html");
		Student s1 = new Student("������");
		Student s2 = new Student("���ȯ");
		Student s3 = new Student("�̿���");
		Student s4 = new Student("�輺ȯ");
		
		
		/*s1.registerCourse(c1);
		s1.registerCourse(c2);
		s2.registerCourse(c3);
		
		s2.dropCourse(c3);
		s3.registerCourse(c4);*/
		
		c1.registerStudent(s1);
		c1.registerStudent(s2);
		c2.registerStudent(s3);
		c2.dropStudent(s3);
		c3.registerStudent(s4);
		
		
		System.out.println(c1);
		System.out.println(s1);
		
		
		
	}
}
