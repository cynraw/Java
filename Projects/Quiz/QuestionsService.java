package Projects.Quiz;

import java.util.Scanner;

public class QuestionsService {
    Question[] questions = new Question[5];
    String[] selection = new String[5];

    public QuestionsService() {
        questions[0] = new Question(0, "What is the size of an integer? ", new String[] { "3", "4", "2", "8" }, "4");
        questions[1]  = new Question(1, "What is the size of an string? ", new String[] { "3", "4", "2", "8" }, "2");
        questions[2] = new Question(2, "What is the size of an double? ", new String[] { "3", "4", "2", "8" }, "8");
        questions[3] = new Question(3, "What is the size of an tiny int? ", new String[] { "3", "1", "2", "8" }, "1");
        questions[4] = new Question(4, "What is the size of an boolean? ", new String[] { "1", "4", "2", "8" }, "1");
    }

    public void playQuiz() {
        int i = 0;
        for (Question q : questions) {
            System.out.println(q.getId() + ". "+ q.getQuestion());
            String[] options = q.getOptions();
            for (String option : options) {
                System.out.println(option);
            }
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your answer: ");
            selection[i] = sc.nextLine();
            i++;
        }
    }

    public void calculateScore(){
        int score = 0;
        for(int i = 0; i<questions.length; i++){
            String answer = questions[i].getAnswer();
            String selectedAnswer = selection[i];  
            if(selectedAnswer.equals(answer)){
                score ++;
            }
        }
        System.out.println("Your Score is: " + score);
    }
}
