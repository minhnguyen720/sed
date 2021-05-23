package exam.question;

public abstract class Question {
	protected String content;
	protected double score;

	protected void createQuestion() {
		setQuestion();
		setMultipleAnswer();
		setCorrectAnswer();
		setScore();
	}

	@Override
	public String toString() {
		return content + "\t\t" + "Score: " + score;
	}

	public double getScore() {
		return score;
	}

	protected abstract void setMultipleAnswer();
	protected abstract void setQuestion();
	protected abstract void setCorrectAnswer();
	protected abstract void setScore();
}
