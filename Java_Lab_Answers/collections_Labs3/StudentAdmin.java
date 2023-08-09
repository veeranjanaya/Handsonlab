package collections_Labs3;

import java.util.Collections;
import java.util.List;

public class StudentAdmin {
	public void createStudent(List<Student> list) {
        list.add(new Student(1001, "Geetha",80));
        list.add(new Student(1002, "Deepa",70));
        list.add(new Student(1003, "Shwetha",75));
    }

    public void sortStudents(List<Student> list) {
        Collections.sort(list);
    }
}
