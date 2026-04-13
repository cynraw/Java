package Projects.Quiz;

public class Main {
    public static void main(String[] args){
        QuestionsService qs1 = new QuestionsService();
        qs1.playQuiz();
        qs1.calculateScore();

    }
}
