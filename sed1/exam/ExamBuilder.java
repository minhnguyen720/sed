package exam;

import java.util.Scanner;

public class ExamBuilder {
	private final Scanner scanner = new Scanner(System.in);

	public ExamBuilder() {
		System.out.print("How many true/false question are there in this exam: ");
		int amt_tf = scanner.nextInt();
		System.out.print("How many multiple choice question are there in this exam: ");
		int amt_mc = scanner.nextInt();
		System.out.print("How many multiple response question are there in this exam: ");
		int amt_mr = scanner.nextInt();
		
		new Exam(amt_tf,amt_mc,amt_mr);
	}
}
