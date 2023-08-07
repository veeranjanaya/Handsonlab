package skillAssureTrainingModel;

public abstract class Question {
	private String questionName;
    private int marks;

    public Question(String questionName, int marks) {
        this.questionName = questionName;
        this.marks = marks;
    }

    public String getQuestionName() {
        return questionName;
    }

    public int getMarks() {
        return marks;
    }
}	
