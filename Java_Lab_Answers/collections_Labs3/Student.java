package collections_Labs3;

public class Student implements Comparable<Student>{
	private int student_id;
    private String student_name;
    private int student_Score;

    public Student(int student_id, String student_name,int student_Score) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.student_Score = student_Score;
    }

    public int getId() {
        return student_id;
    }

    public String getName() {
        return student_name;
    }
    
    public int getStudent_Score() {
		return student_Score;
	}
	@Override
    public int compareTo(Student students) {
        return Integer.compare(this.student_id, students.student_id);
    }
}
