package skillAssureTrainingModel;

import java.util.ArrayList;

public class Iteration {
	private int iterationNo;
    private String goal;
    private Course course;
    private ArrayList<Assessment> assessments;

    public Iteration(int iterationNo, String goal) {
        this.iterationNo = iterationNo;
        this.goal = goal;
        assessments= new ArrayList<>();
	}
	public int getIterationNo() {
		return iterationNo;
	}
	public String getGoal() {
		return goal;
	}
	public Course getCourse() {
		return course;
	}

	public ArrayList<Assessment> getAssessments() {
		return assessments;
	}
	public void addAssesments(Assessment assessment) {
    	assessments.add(assessment);
    }
	public int getTotalAssessments() {
        return assessments.size();
    }
    public int getTotalScoreOfAllAssessments() {
        int totalScore = 0;
        for (Assessment assessment : assessments) {
            totalScore += assessment.getTotalMarks();
        }
        return totalScore;
    }

	
	
}
