import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class Game 
//implements ActionListener 
{
//JTextField userGuess;
  JLabel question;
  JLabel answerOne;
  JLabel answerTwo;
  JLabel answerThree;
  JLabel answerFour;
  JButton selectOne;
  JButton selectTwo;
  JButton selectThree;
  JButton selectFour;

  JLabel yesNo;
  JButton nextQuestion;
//JButton guessButton;
//JButton playAgainButton;
//JLabel enterGuess;
//JLabel highLow;
//JLabel lastGuess;
//Random r = new Random();
//int randomNum = r.nextInt(100)+1;

Game() {
  
  JFrame frame = new JFrame("US Trivia Game");
  frame.setLayout(new FlowLayout());
  frame.setSize(240, 240);

  question = new JLabel("Insert Question Here");
  answerOne = new JLabel("Insert Answer 1");
  selectOne = new JButton("Select");
  answerTwo = new JLabel("Insert Answer 2");
  selectTwo = new JButton("Select");
  answerThree = new JLabel("Insert Answer 3");
  selectThree = new JButton("Select");
  answerFour = new JLabel("Insert Answer 4");
  selectFour = new JButton("Select");

  yesNo = new JLabel("Try Again or Correct");
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
frame.add(answerOne);
frame.add(selectOne);
frame.add(answerTwo);
frame.add(selectTwo);
frame.add(answerThree);
frame.add(selectThree);
frame.add(answerFour);
frame.add(selectFour);
frame.add(yesNo);
frame.add(nextQuestion);

  frame.setVisible(true);
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