import java.util.Scanner;

public class QuestionService {
    Question question[]=new Question[5];
    String selection[]=new String[5];
    public QuestionService()
    {
         question[0]=new Question(1, "Size of int ?", "1", "2", "3", "4", "4");
         question[1]=new Question(1, "Size of double ?", "1", "2", "8", "4", "8");
         question[2]=new Question(1, "Size of char ?", "1", "2", "3", "4", "2");
         question[3]=new Question(1, "Size of float ?", "1", "6", "3", "4", "6");
         question[4]=new Question(1, "Size of boolean ?", "1", "2", "3", "4", "1");
    }
    
    public void playQuiz()
    {
        int i=0;
        for(Question q : question){
        System.out.println("Question no: " +q.getId());
        System.out.println(q.getQuestion());
        System.out.println(q.getOp1());
        System.out.println(q.getOp2());
        System.out.println(q.getOp3());
        System.out.println(q.getOp4());
    
        Scanner s=new Scanner(System.in);
        selection[i]=s.nextLine();
        i++;
    }

    for(String s : selection)
    {
        System.out.println(s);
    }
    }

    public void playerScore()
    {
        int score=0;
        for(int i=0; i<question.length;i++)
        {
            Question que= question[i];
            String actualAnswer=que.getAnswer();
            String userAnswer=selection[i];

            if(actualAnswer.equals(userAnswer))
            {
                score++;
            }
        }
        System.out.println("The score is: " +score);
    }
}
