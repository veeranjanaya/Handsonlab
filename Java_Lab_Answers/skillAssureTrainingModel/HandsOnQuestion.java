package skillAssureTrainingModel;

public class HandsOnQuestion extends Question{
	private String description;
    private String referenceDocument;

    public HandsOnQuestion(String questionName, int marks, String description, String referenceDocument) {
        super(questionName, marks);
        this.description = description;
        this.referenceDocument = referenceDocument;
    }

    public String getDescription() {
        return description;
    }
    
	public String getReferenceDocument() {
		return referenceDocument;
	}
	
	
}
