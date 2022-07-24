import java.util.Scanner;

public class TriviaQuiz {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int score = 0;
    char firstAnswer = '0';
    char secondAnswer = '0';
    char thirdAnswer = '0';
    char fourthAnswer = '0';

    System.out.print("Welcome to the Trivia Quiz! There are 4 questions; each correct answer rewards 5 points. Are you ready? Let's begin!\n\n1. Which country held the 2016 Summer Olympics?\n\n\ta) China\n\tb) Ireland\n\tc) Brazil\n\td) Italy\n\nYour Answer: ");
    firstAnswer = sc.next().charAt(0);

    switch (firstAnswer) {
        case 'a': score = (score + 0); break;
        case 'b': score = (score + 0); break;
        case 'c': score = (score + 5); break;
        case 'd': score = (score + 0); break;
        default: System.out.println("\nYou must enter the letter corresponding to one of the options (a, b, c or d). Try again.");
    }

    System.out.print("\n\n2. Which planet is the hottest?\n\n\ta) Venus\n\tb) Saturn\n\tc)Mercury\n\td) Mars\n\nYour Answer: ");
    secondAnswer = sc.next().charAt(0);

    switch (secondAnswer) {
        case 'a': score = (score + 5); break;
        case 'b': score = (score + 0); break;
        case 'c': score = (score + 0); break;
        case 'd': score = (score + 0); break;
        default: System.out.println("\nYou must enter the letter corresponding to one of the options (a, b, c or d). Try again.");
    }

    System.out.print("\n\n3. What is the rarest blood type?\n\n\ta) O\n\tb) A\n\tc) B\n\td) AB negative\n\nYour Answer: ");
    thirdAnswer = sc.next().charAt(0);

    switch (thirdAnswer) {
        case 'a': score = (score + 0); break;
        case 'b': score = (score + 0); break;
        case 'c': score = (score + 0); break;
        case 'd': score = (score + 5); break;
        default: System.out.println("\nYou must enter the letter corresponding to one of the options (a, b, c or d). Try again."); break;
    }

    System.out.print("\n\n4. Which of these characters is friends with Harry Potter?\n\n\ta)Ron Weasly\n\tb) Hermione Granger\n\tc) Draco Malfoy\n\nYour Answer: ");
    fourthAnswer = sc.next().charAt(0);

    switch (fourthAnswer) {
        case 'a': score = (score + 5); break;
        case 'b': score = (score + 5); break;
        case 'c': score = (score + 0); break;
        default: System.out.println("\nYou must enter the letter corresponding to one of the options (a, b or c). Try again."); break;
    }

    System.out.printf("\n\nYour final score is %d/20.", score);

    if (score >= 15) {
        System.out.println(" Wow, you know your stuff!");
    } else if (score < 15 && score >= 5) {
        System.out.println(" Not bad!");
    } else {
        System.out.println(" Better luck next time!");
    }



    sc.close();
}
    
}
