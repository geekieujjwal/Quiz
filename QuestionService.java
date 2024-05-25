import java.util.Scanner;
public class QuestionService {

    Question[] questions = new Question[5];
    String selection[] = new String[5];

    public QuestionService() {
        questions[0] = new Question(1, "size of int", "2", "6", "4", "8", "4");
        questions[1] = new Question(2, "size of float", "2", "4", "8", "16", "4");
        questions[2] = new Question(3, "size of double", "4", "8", "16", "32", "8");
        questions[3] = new Question(4, "size of char", "1", "2", "4", "8", "1");
        questions[4] = new Question(5, "size of long", "4", "8", "16", "32", "8");
    }

    public void playQuiz (){

        int i = 0;
        for(Question q: questions){
            System.out.println("Question No. " + q.getId() + ") What is the " + q.getQuestion() + " ?");
            System.out.println("A) " + q.getOpt1());
            System.out.println("B) " + q.getOpt2());
            System.out.println("C) " + q.getOpt3());
            System.out.println("D) " + q.getOpt4());
            Scanner sc = new Scanner(System.in);
            selection[i] = sc.nextLine();
            i++;
        };
        System.out.println("Your selected values are: ");
        for ( String s : selection){
            System.out.println(s);
        }
    };

    public void printScore() {
        int score = 0;
        for (int i = 0; i < questions.length; i++){
            Question que = questions[i];
            String actualAnswer = que.getAnswer();
            String userAnswer = selection[i];
            if(actualAnswer.equals(userAnswer)){
                score++;
            }
        }
        System.out.println("Your score: " + score);
    }
}