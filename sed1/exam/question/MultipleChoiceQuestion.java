package exam.question;

import java.util.ArrayList;
import java.util.Scanner;

public class MultipleChoiceQuestion extends Question {
    private final Scanner scanner = new Scanner(System.in);

    private ArrayList<String> optionList = new ArrayList<>();
    private byte answer;

    public MultipleChoiceQuestion() {
        createQuestion();
    }

    @Override
    protected void setQuestion() {
        System.out.println("\nMULTIPLE CHOICE QUESTION:");
        content = scanner.nextLine();
    }

    @Override
    public void setMultipleAnswer() {
        System.out.print("Number of question: ");
        int amt = scanner.nextInt();
        for (int i = 0; i < amt; i++) {
            System.out.println("\nMULTIPLE CHOICE:");
            String choice = scanner.nextLine();
            optionList.add(choice);
        }
    }

    @Override
    public void setCorrectAnswer() {
        System.out.println("Choose the right answer from [0-3] \nCORRECT ANSWER: ");
        answer = scanner.nextByte();
    }

    @Override
    public void setScore() {
        System.out.println("SCORE: ");
        score = scanner.nextDouble();
    }

    public byte getAnswer() {
        return answer;
    }

}
