public class QuizApplication {

    public static void main(String[] args) {

        QuizManager quiz = new QuizManager();

        quiz.addQuestion("Java keyword for inheritance?", "extends");
        quiz.addQuestion("Size of int in Java?", "4");

        quiz.startQuiz();

    }
}