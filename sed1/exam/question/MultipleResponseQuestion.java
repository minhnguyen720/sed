package exam.question;

import java.util.ArrayList;

public class MultipleResponseQuestion extends Question {
    private ArrayList<String> optionList = new ArrayList<>();
    private ArrayList<Byte> answerList = new ArrayList<>();

    public MultipleResponseQuestion() {
        System.out.println("CREATION MULTIPLE RESPONSE QUESTION SESSION");
        createQuestion();
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

}
