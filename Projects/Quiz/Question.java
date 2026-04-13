package Projects.Quiz;

public class Question {
    private int id;
    private String question;
    private String[] options;
    private String answer;

    public Question(int id,String question,String options[],String answer){
        this.id = id;
        this.question = question;
        this.options = options;
        this.answer = answer;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setQuestion(String question){
        this.question= question;
    }

    public String getQuestion(){
        return question;
    }

    public void setOptions(String options[]){
        this.options = options;
    }

    public String[] getOptions(){ 
        return options; 
    }

    public void setAnswer(String answer){
        this.answer= answer;
    }

    public String getAnswer(){
        return answer;
    }

}
