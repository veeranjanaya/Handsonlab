package collections_Labs3;

import java.util.ArrayList;
import java.util.List;

public class Test_Main {

	public static void main(String[] args) {
		StudentAdmin admin = new StudentAdmin();
        List<Student> studentList = new ArrayList<>();

        admin.createStudent(studentList);

        System.out.println("Before sorting:");
        for (Student student : studentList) {
            System.out.println("ID: " + student.getId() + ", Name: " + student.getName()+ ", Student_Score: " + student.getStudent_Score());
        }

        admin.sortStudents(studentList);

        System.out.println("\nAfter sorting:");
        for (Student student : studentList) {
            System.out.println("ID: " + student.getId() + ", Name: " + student.getName()+ ", Student_Score: " + student.getStudent_Score());
        }

	}

}
