package skillAssureTrainingModel;

import java.util.ArrayList;

public class Course {
	private int courseId;
	private String name;
	private ArrayList<Assessment> assessments;
	public Course(int courseId, String name) {
		this.courseId = courseId;
		this.name = name;
	}

	public int getCourseId() {
		return courseId;
	}
	public String getName() {
		return name;
	}

	public ArrayList<Assessment> getAssessments() {
		return assessments;
	}
	public int getTotalAssessments() {
		return assessments.size();
	}
	public int getTotalMCQ() {
		int totalMCQ=0;
		for(Assessment assessment:assessments) {
			totalMCQ+=assessment.getTotalMCQ();
		}
		return totalMCQ;
	}
	public int getTotalHandsOn() {
		int totalHandsOn=0;
		for(Assessment assessment:assessments) {
			totalHandsOn+=assessment.getTotalHandsOn();
		}
		return totalHandsOn;
	}

}
