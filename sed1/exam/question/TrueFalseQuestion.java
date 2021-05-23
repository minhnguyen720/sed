package exam.question;

public class TrueFalseQuestion extends Question {

	private byte answer;

	public TrueFalseQuestion() {
		System.out.println("CREATING TRUE/FALSE QUESION SESSION");
		createQuestion();
	}


	@Override
	protected void setMultipleAnswer() {}

	@Override
	protected void setCorrectAnswer() {
		System.out.println("0-False, 1-True \nANSWER: ");
		answer = scanner.nextByte();
	}

	public byte getAnswer() {
		return answer;
	}
}
