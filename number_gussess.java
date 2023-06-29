import javax.swing.*;

public class number_gussess {
    public static void main(String[] args) {
        int computerNumber = (int) (Math.random()*100 + 1);
        int Answer = 0;
        System.out.println("The correct guess would be " + computerNumber);
        int count = 1;
        int score = 10-1;
        while (Answer != computerNumber)
        {
            String response = JOptionPane.showInputDialog(null,
                "Enter a guess between 1 and 100", "Guessing Game", 3);
            Answer = Integer.parseInt(response);
            JOptionPane.showMessageDialog(null, ""+ determineGuess(Answer, computerNumber, count,score));
            count++;
            score-=1;
        }
    }
    public static String determineGuess(int Answer, int computerNumber, int count,int score){
        if (Answer <=0 || Answer >100) {
            return "Your guess is invalid";
        }
        else if (Answer == computerNumber ){
            score+=1;
            return "Correct!\nTotal Guesses: " + count+"\nScore:"+score;
        }
        else if (Answer > computerNumber) {
            return "Your guess is too high, try again.\nTry Number: " + count+"\nScore:"+score;
        }
        else if (Answer < computerNumber) {
            return "Your guess is too low, try again.\nTry Number: " + count+"\nScore:"+score;
        }
        else {
            return "Your guess is incorrect\nTry Number: " + count+"\nScore:"+score;

        }
    }
}