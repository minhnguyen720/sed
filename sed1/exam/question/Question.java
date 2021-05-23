package exam.question;

import java.util.Scanner;

public abstract class Question {
	protected String content;
	protected double score;
	Scanner scanner = new Scanner(System.in);

	protected void createQuestion() {
		setQuestion();
		setMultipleAnswer();
		setCorrectAnswer();
		setScore();
	}

	private void setQuestion() {
		content = scanner.nextLine();
	}

	private void setScore() {
		System.out.println("SCORE: ");
		score = scanner.nextDouble();
	}

	@Override
	public String toString() {
		return content + "\t\t" + "Score: " + score;
	}

	public double getScore() {
		return score;
	}

	protected abstract void setMultipleAnswer();

	// protected abstract void setQuestion();

	protected abstract void setCorrectAnswer();
}
