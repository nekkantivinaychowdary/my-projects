import java.util.*;

class QuizManager {

    List<Question> questions = new ArrayList<>();

    void addQuestion(String q, String ans) {
        questions.add(new Question(q, ans));
    }

    void startQuiz(){

        Scanner sc = new Scanner(System.in);
        int score = 0;

        for(Question q : questions){

            System.out.println(q.question);
            String userAns = sc.nextLine();

            if(userAns.equalsIgnoreCase(q.answer)){
                score++;
            }

        }

        System.out.println("Score: " + score + "/" + questions.size());
    }
}