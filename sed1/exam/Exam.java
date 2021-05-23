package exam;

import java.util.ArrayList;

import exam.question.MultipleChoiceQuestion;
import exam.question.MultipleResponseQuestion;
import exam.question.Question;
import exam.question.TrueFalseQuestion;

/*
Exam class dedicates to create exams base on their type
and print all available exams on terminal.
*/
public class Exam {
	private ArrayList<TrueFalseQuestion> tf_list = new ArrayList<>();
	private ArrayList<MultipleChoiceQuestion> mc_list = new ArrayList<>();
	private ArrayList<MultipleResponseQuestion> mr_list = new ArrayList<>();

	protected Exam(int amt_tf, int amt_mc, int amt_mr) {
		makeTFQ(amt_tf);
		makeMCQ(amt_mc);
		makeMRQ(amt_mr);

		printExam();
	}

	private void printExam() {
		printTFExam();
		printMCExam();
		printMRExam();
	}

	// Create question base on type
	private void makeMRQ(int amt) {
		if (amt == 0)
			return;
		for (int i = 0; i < amt; i++) {
			Question mrq = new MultipleResponseQuestion();
			mr_list.add((MultipleResponseQuestion) mrq);
		}
	}

	private void makeMCQ(int amt) {
		if (amt == 0)
			return;
		for (int i = 0; i < amt; i++) {
			Question mcq = new MultipleChoiceQuestion();
			mc_list.add((MultipleChoiceQuestion) mcq);
		}
	}

	private void makeTFQ(int amt) {
		if (amt == 0)
			return;
		for (int i = 0; i < amt; i++) {
			Question tfq = new TrueFalseQuestion();
			tf_list.add((TrueFalseQuestion) tfq);
		}
	}

	// Print question base on type
	private void printTFExam() {
		if (tf_list.size() == 0) {
			System.out.println("======== TRUE FALSE QUESTION =======\nempty");
			return;
		}
		System.out.println("======== TRUE FALSE QUESTION =======");
		for (int i = 0; i < tf_list.size(); i++) {
			System.out.print("Question " + i + ": ");
			System.out.println(tf_list.get(i).toString());
		}
	}

	private void printMCExam() {
		if (mc_list.size() == 0) {
			System.out.println("======== MULTIPLE CHOICE QUESTION ======\nempty");
			return;
		}
		System.out.println("======== MULTIPLE CHOICE QUESTION ======");
		for (int i = 0; i < mc_list.size(); i++) {
			System.out.print("Question " + i + ": ");
			System.out.println(mc_list.get(i).toString());
		}
	}

	private void printMRExam() {
		if (mr_list.size() == 0) {
			System.out.println("======== MULTIPLE RESPONSE QUESTION ======\nempty");
			return;
		}
		System.out.println("======== MULTIPLE RESPONSE QUESTION ======");
		for (int i = 0; i < mr_list.size(); i++) {
			System.out.print("Question " + i + ": ");
			System.out.println(mr_list.get(i).toString());
		}
	}

}
