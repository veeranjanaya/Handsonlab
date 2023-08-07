package skillAssureTrainingModel;

import java.sql.Date;
import java.util.ArrayList;


public class Assessment {
	private String assessmentId;
    private String description;
    private int noOfQuestions;
    private Date dtAssessment;
    private ArrayList<Question> questions;

    public Assessment(String assessmentId, int noQuestions, String description, Date dtAssessment) {
        this.assessmentId = assessmentId;
        this.description = description;
        this.noOfQuestions = noQuestions;
        this.dtAssessment = dtAssessment;
        this.questions= new ArrayList<>();
    }
    
    public String getAssessmentId() {
		return assessmentId;
	}
	public String getDescription() {
		return description;
	}
	public int getNoQuestions() {
		return questions.size();
	}
	public int getnoOfQuestions() {
		return noOfQuestions;
	}
	public Date getDtAssessment() {
		return dtAssessment;
	}
	public void addQuestion(Question question) {
		questions.add(question);
	}
	public int getTotalMarks() {
		int totalMarks = 0;
		for(Question question : questions) {
			totalMarks+=question.getMarks();
		}
        return totalMarks;
    }
	public int getTotalMCQ() {
		int totalMCQ=0;
		for(Question question:questions) {
			if(question instanceof MCQQuestion) {
				totalMCQ++;
			}
		}
		return totalMCQ;
	}
	public int getTotalHandsOn() {
		int totalHands=0;
		for(Question question:questions) {
			if(question instanceof HandsOnQuestion) {
				totalHands++;
			}
		}
		return totalHands;
	}
}
