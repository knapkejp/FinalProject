import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class Game 
//implements ActionListener 
{
  JLabel question;
  JButton selectOne;
  JButton selectTwo;
  JButton selectThree;
  JButton selectFour;
  JLabel yesNo;
  JLabel score;
  JButton nextQuestion;

//Creating Question List ArrayList
    ArrayList<Question> questionList = new ArrayList<Question>();

    //Setting Variables to Defaults or Zero
    String questionText = "";
    String answerOneText = "";
    String answerTwoText = "";
    String answerThreeText = "";
    String answerFourText = "";
    int correct = 0;
    int points = 0;

Game() {
  
  JFrame frame = new JFrame();
  frame.setLayout(new FlowLayout());
  frame.setSize(240, 240);

  question = new JLabel("Insert Question Here");
  selectOne = new JButton("Select 1");
  selectTwo = new JButton("Select 2");
  selectThree = new JButton("Select 3");
  selectFour = new JButton("Select 4");
  yesNo = new JLabel("Try Again or Correct");
  score = new JLabel("Your score is: ");
  nextQuestion = new JButton("Next Question");

frame.add(question);
frame.add(selectOne);
frame.add(selectTwo);
frame.add(selectThree);
frame.add(selectFour);
frame.add(yesNo);
frame.add(score);
frame.add(nextQuestion);

  frame.setVisible(true);

//FileReader
 try {
      FileReader myFile;
      myFile = new FileReader("trivia.txt");
      BufferedReader reader = new BufferedReader(myFile);

      while(reader.ready()) {
        questionText = reader.readLine();
        answerOneText = reader.readLine();
        answerTwoText = reader.readLine();
        answerThreeText = reader.readLine();
        answerFourText = reader.readLine();
        correct = Integer.parseInt(reader.readLine());
        points = Integer.parseInt(reader.readLine());

        //Creating Question Object
         Question theQuestion = new Question(questionText, answerOneText, answerTwoText, answerThreeText, answerFourText, correct, points);
        //Adding Question Objects to ArrayList
         questionList.add(theQuestion);
      }
      reader.close();
    }
    //Catch Block - Reader
    catch (IOException exception) {
      System.out.println("An error occurred: " + exception);
      }

/*
public void actionPerformed(ActionEvent ae) {
  if(ae.getActionCommand().equals("Guess")) {
    int guess = Integer.parseInt(userGuess.getText());
    lastGuess.setText("Last Guess: "+guess);

    if(guess == randomNum) {
      highLow.setText("You got it! ");
    }
    else if(guess > randomNum) {
      highLow.setText("Too high! ");
    }
    else {
      highLow.setText("Too low! ");
    }
  }
    
  else if(ae.getActionCommand().equals("Play Again")) {
    randomNum = r.nextInt(100)+1;
  
    enterGuess.setText("Enter your guess: ");
    highLow.setText("");
    lastGuess.setText("");
    userGuess.setText("");
    }

  else {
    highLow.setText("Your pressed Enter. Please press the Guess Button");
    }
}
*/
}}