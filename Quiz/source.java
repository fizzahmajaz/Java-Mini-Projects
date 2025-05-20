import java.util.Scanner;
import java.util.Random;

public class quizapp {

    // How many questions
    // How many options in the question
    // Store the questions
    // Store the options
    // Ask for quiz questions count
    // Generate randomly
    // Use string builder to display
    // Print the results

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // Take the number of question
        System.out.println("How many question do you want to store? : ");
        int countQuestions = sc.nextInt();
        sc.nextLine();

        // Take the number of options in a question
        System.out.println("How many options do you want in 1 question? : ");
        int countOptions = sc.nextInt();
        sc.nextLine();

        // Make an array to store the questions
        String[] Questions = new String[countQuestions];
        // No make an array to store the options
        String[][] Options = new String[countQuestions][countOptions];

        // Run a loop to store the data in the array

        for (int i = 0; i < countQuestions; i++) {
            System.out.println("Enter your Question no " + (i + 1) + " :");
            Questions[i] = sc.nextLine();

            for (int j = 0; j < countOptions; j++) {
                System.out.println("Enter the option no " + (j + 1) + " :");
                Options[i][j] = sc.nextLine();
            }
        }

        // How many questions they want in quiz

        System.out.println("How many questions do you want in quiz");

        int selectedQuestins = sc.nextInt();

        if (selectedQuestins > countQuestions) {
            System.out.println("You are exceding the limit try again");
            return;
        }

        // Store the randomly generated questions
        int quiz = 0;
        StringBuilder display = new StringBuilder();

        while (quiz < selectedQuestins) {

            int index = random.nextInt(countOptions);

            display.append(Questions[index]).append("\n");

            // Display the options
            for (int j = 0; j < countOptions; j++) {
                display.append((char) ('A' + j)).append(" .").append(Options[index][j]).append("\n");
            }

            display.append("\n");

            // It will increament all the time random will generate question
            // Without this the loop will become infinite

            quiz++;

        }

        System.out.println("Your Quiz is here :");
        System.out.println(display);

    }

}

