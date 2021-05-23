package exam.question;

import java.util.ArrayList;
import java.util.Scanner;

public class MultipleResponseQuestion extends Question {
    private final Scanner scanner = new Scanner(System.in);
    private ArrayList<String> optionList = new ArrayList<>();
    private ArrayList<Byte> answerList = new ArrayList<>();

    public MultipleResponseQuestion() {
        createQuestion();
    }

    @Override
    public void setQuestion() {
        System.out.print("Number of question: ");
        int amt = scanner.nextInt();
        for (int i = 0; i < amt; i++) {
            System.out.println("\nMULTIPLE RESPONSE QUESTION:");
            content = scanner.nextLine();
            optionList.add(content);
        }
    }

    @Override
    public void setMultipleAnswer() {
        System.out.print("Number of question: ");
        int amt = scanner.nextInt();
        for (int i = 0; i < amt; i++) {
            System.out.println("\nMULTIPLE RESPONSE:");
            String choice = scanner.nextLine();
            optionList.add(choice);
        }
    }

    @Override
    public void setCorrectAnswer() {
        System.out.print("Number of correct answer: ");
        int amt = scanner.nextInt();
        for (int i = 0; i < amt; i++) {
            System.out.println("Choose the right answer from [0-3] \nANSWER: ");
            byte answer = scanner.nextByte();
            answerList.add(answer);
        }
    }

    @Override
    public void setScore() {
        System.out.println("SCORE: ");
        score = scanner.nextDouble();
    }

}
