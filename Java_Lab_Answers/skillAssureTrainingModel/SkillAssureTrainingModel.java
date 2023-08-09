package skillAssureTrainingModel;

public class SkillAssureTrainingModel {
	private String trainingName;
    private Iteration[] iterations = new Iteration[3];
    
    public SkillAssureTrainingModel(String trainingName, Iteration[] iterations) {
		this.trainingName = trainingName;
		iterations[0] = new Iteration(1,"Goal1");
		iterations[1] = new Iteration(2,"Goal2");
		iterations[2] = new Iteration(3,"Goal3");
	}


	public String getTrainingName() {
		return trainingName;
	}

	public void setTrainingName(String trainingName) {
		this.trainingName = trainingName;
	}
	

	public Iteration[] getIterations() {
		return iterations;
	}
	
	public int getTotalAssessmentsInTheTraining() {
		int total=0;
		for(Iteration iteration:iterations) {
			total+=iteration.getCourse().getTotalAssessments();
		}
		return total;
	}
	public int getTotalAssessments() {
        int totalAssessments = 0;
        for (Iteration iteration : iterations) {
            totalAssessments += iteration.getTotalAssessments();
        }
        return totalAssessments;
    }

    public int getNumMCQBasedAssessments() {
        int count = 0;
        for (Iteration iteration : iterations) {
            count += iteration.getCourse().getTotalMCQ();
        }
        return count;
    }

    public int getNumHandsOnBasedAssessments() {
        int count = 0;
        for (Iteration iteration : iterations) {
            count += iteration.getCourse().getTotalHandsOn();
        }
        return count;
    }

    public int getTotalScoreOfAllAssessments() {
        int totalScore = 0;
        for (Iteration iteration : iterations) {
            totalScore += iteration.getTotalScoreOfAllAssessments();
        }
        return totalScore;
    }
    
}