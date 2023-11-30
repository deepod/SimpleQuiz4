import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // for user input
        String userAnswer; // will be used to store the user's answer
        int points = 0;

        //USING THE NEW CONSTRUCTOR, create two question objects and update their variables
        Question question1 = new Question("What is the capital of France?","Paris");
        Question question2 = new Question("What is the capital of Germany?","Berlin");

        points = points + question1.processQuestion(); //processes the question and add any points achieved
        points = points + question2.processQuestion();

        //output points
        System.out.println("Your points so far: " + points);
    }

}
