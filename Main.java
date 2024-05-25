public class Main{
    public static void main(String[] args){

        QuestionService service = new QuestionService();
        service.playQuiz();
        service.printScore();
        System.out.println("Trying to get a new badge in github");
    }
}