import java.util.Scanner;

    public class QuizGame {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Questions and answers
            String[] questions = {
                    "What is the total area of Bangladesh?",
                    "What is bangladeshi local time zone?",
                    "What is the local zonal area of sea of Bangladesh?",
                    "What is the smallest district in Bangladesh?"
                    "Which state is the biggest in Bangladesh?"
            };

            String[] options = {
                    "a) 147570\nb) 68000\nc) 147560\nd) 145900",
                    "a) GMT+6\nb) GMT+7\nc) GMT+4\nd) GMT+3",
                    "a) 12nq\nb) 23nq\nc) 34nq\nd) 45nq",
                    "a)Sherpur\nb) Narayonganj\nc) Barishal\nd) Comilla",
                    "a)Dhaka\nb0 Mymensingh\nc) Bogra\nd) Sylhet",
            };

            char[] answers = {'a', 'a', 'a', 'b', 'a'}; // Correct answers
            int score = 0;

            System.out.println("Welcome to the Quiz Game!");
            System.out.println("Each correct answer gives you 5 points.\n");

            // Loop through questions
            for (int i = 0; i < questions.length; i++) {
                System.out.println("Question " + (i + 1) + ": " + questions[i]);
                System.out.println(options[i]);
                System.out.print("Enter your answer (a/b/c/d): ");
                char userAnswer = scanner.next().toLowerCase().charAt(0);

                // Check answer
                if (userAnswer == answers[i]) {
                    System.out.println("Correct!\n");
                    score += 5;
                } else {
                    System.out.println("Wrong! The correct answer was: " + answers[i] + "\n");
                }
            }

            // Final score
            System.out.println("Quiz Over!");
            System.out.println("Your final score is: " + score + "/25");

            scanner.close();
        }
    }
}
