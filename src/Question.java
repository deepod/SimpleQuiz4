import java.util.Scanner;

public class Question {

    //FIELDS
    String questionText;
    String answerText;

    //CONSTRUCTOR
    public Question(String questionText, String answerText){
        this.questionText = questionText;
        this.answerText = answerText;
    }


    //METHODS
    public int processQuestion(){
        Scanner sc = new Scanner(System.in);
        System.out.println(questionText);
        String userAnswer = sc.nextLine();
        sc.close();
        if (userAnswer.equals(answerText)){
            System.out.println("Correct answer");
            return 1;
        }
        else{
            System.out.println("Wrong answer");
            return 0;
        }
    }
}
