public class App {
    public static void main(String[] args) throws Exception {
        
        QuestionService qs=new QuestionService();

        qs.playQuiz();
        qs.playerScore();
    }
}
