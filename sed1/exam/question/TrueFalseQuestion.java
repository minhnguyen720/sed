package exam.question;

import java.util.Scanner;

public class TrueFalseQuestion extends Question {

	private final Scanner scanner = new Scanner(System.in);
	private byte answer;

	public TrueFalseQuestion() {
		createQuestion();
	}

	@Override
	protected void setQuestion() {
		System.out.println("TRUE/FALSE QUESTION:");
		content = scanner.nextLine();
	}

	@Override
	protected void setMultipleAnswer() {}

	@Override
	protected void setCorrectAnswer() {
		System.out.println("0-False, 1-True \nANSWER: ");
		answer = scanner.nextByte();
	}

	@Override
	protected void setScore() {
		System.out.println("SCORE: ");
		score = scanner.nextDouble();
	}

	public byte getAnswer() {
		return answer;
	}
}
