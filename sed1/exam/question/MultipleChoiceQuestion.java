package exam.question;

import java.util.ArrayList;
public class MultipleChoiceQuestion extends Question {

    private ArrayList<String> optionList = new ArrayList<>();
    private byte answer;

    public MultipleChoiceQuestion() {
        System.out.println("CREATION MULTIPLE CHOICE QUESTION SESSION");
        createQuestion();
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

    public byte getAnswer() {
        return answer;
    }

}
