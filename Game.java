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
//JTextField userGuess;
  JLabel question;
  JButton selectOne;
  JButton selectTwo;
  JButton selectThree;
  JButton selectFour;
  JLabel yesNo;
  JLabel score;
  JButton nextQuestion;
//JButton guessButton;
//JButton playAgainButton;
//JLabel enterGuess;
//JLabel highLow;
//JLabel lastGuess;
//Random r = new Random();
//int randomNum = r.nextInt(100)+1;
ArrayList<Question> questionList = new ArrayList<Question>();
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

//userGuess = new JTextField(10);
//userGuess.setActionCommand("myTF");

//guessButton = new JButton("Guess");
//playAgainButton = new JButton("Play Again");

//guessButton.addActionListener(this);
//playAgainButton.addActionListener(this);

//enterGuess = new JLabel("Enter your guess: ");
//highLow = new JLabel("");
//lastGuess = new JLabel("");

//frame.add(enterGuess);
//frame.add(userGuess);
//frame.add(guessButton);
//frame.add(highLow);
//frame.add(lastGuess);
//frame.add(playAgainButton);

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
        //Person thePerson = new Person(name, Integer.parseInt(age), capital);
       //people.add(thePerson);
      }
      reader.close();
    }
  catch (IOException exception) {
      System.out.println("An error occurred: " + exception);
      }
    
  //Storing Read Data into Question Object
  new Question(questionText,answerOneText, answerTwoText, answerThreeText, answerFourText, correct, points );

    /*for(int i=0; i<questionList.size(); i++) {
      questionList.add(get(i).getQuestionText(),get(i).getAnswerOneText(), get(i).getAnswerTwoText, get(i).getAnswerThreeText(), get(i).getAnswerFourText, get(i).getCorrect(), get(i).getPoints());
      */
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
}