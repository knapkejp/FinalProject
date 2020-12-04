import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class Game implements ActionListener {
  JLabel question;
  JButton selectOne;
  JButton selectTwo;
  JButton selectThree;
  JButton selectFour;
  JLabel yesNo;
  JLabel score;
  JButton nextQuestion;
  String insert;

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
frame.setSize(300, 180);

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
    
     
//Populating Labels and Buttons with ArrayList Data
  question = new JLabel(questionList.get(0).getQuestionText());
  selectOne = new JButton(questionList.get(0).getAnswerOneText());
  //selectOne = new JButton("");
  selectTwo = new JButton(questionList.get(0).getAnswerTwoText());
  //selectTwo = new JButton("");
  selectThree = new JButton(questionList.get(0).getAnswerThreeText());
  //selectThree = new JButton("");
  selectFour = new JButton(questionList.get(0).getAnswerFourText());
  //selectFour = new JButton("");
selectOne.addActionListener(this);
selectTwo.addActionListener(this);
selectThree.addActionListener(this);
selectFour.addActionListener(this);


  yesNo = new JLabel("");
  score = new JLabel("");
  nextQuestion = new JButton("Next Question");

nextQuestion.addActionListener(this);

//Adding objects to frame and making the GUI visible
frame.add(question);
frame.add(selectOne);
frame.add(selectTwo);
frame.add(selectThree);
frame.add(selectFour);
frame.add(yesNo);
frame.add(score);
frame.add(nextQuestion);
frame.setVisible(true);

}

// Making GUI functional
public void actionPerformed(ActionEvent ae) {
  if(question.getText().equals(questionList.get(0).getQuestionText())){
    if(ae.getActionCommand().equals(questionList.get(0).getAnswerTwoText())){
    points = (questionList.get(0).getPoints());
    yesNo.setText("");
    score.setText("Correct! Your score is: "+points);
    }
    else if(ae.getActionCommand().equals("Next Question")){
    score.setText("");
    question.setText(questionList.get(1).getQuestionText());
    selectOne.setText(questionList.get(1).getAnswerOneText());
    selectTwo.setText(questionList.get(1).getAnswerTwoText());
    selectThree.setText(questionList.get(1).getAnswerThreeText());
    selectFour.setText(questionList.get(1).getAnswerFourText());
    }
    else {
    yesNo.setText("Wrong Answer! Try Again");
    score.setText(""); 
    }
  }
  else if(question.getText().equals(questionList.get(1).getQuestionText())){
    if(ae.getActionCommand().equals(questionList.get(1).getAnswerOneText())){
    yesNo.setText("");
    points = points+(questionList.get(1).getPoints());
    score.setText("Correct! Your score is: "+points++);
    }
    else if(ae.getActionCommand().equals("Next Question")){
    score.setText("");
    question.setText(questionList.get(2).getQuestionText());
    selectOne.setText(questionList.get(2).getAnswerOneText());
    selectTwo.setText(questionList.get(2).getAnswerTwoText());
    selectThree.setText(questionList.get(2).getAnswerThreeText());
    selectFour.setText(questionList.get(2).getAnswerFourText());
    }
    else {
    yesNo.setText("Wrong Answer! Try Again");
    score.setText(""); 
    }
  }
  else{
    question.setText("Testing Testing");
  }

}
}



/*    
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
}}
*/

/* QUestion 1 works and flips to question 2
  if(ae.getActionCommand().equals(questionList.get(0).getAnswerTwoText())){
    yesNo.setText("");
    points = (questionList.get(0).getPoints());
    score.setText("Correct! Your score is: "+points);
  }
  else if(ae.getActionCommand().equals(questionList.get(0).getAnswerOneText())){
    yesNo.setText("Please Try Again");
    score.setText("");
  }
  else if(ae.getActionCommand().equals(questionList.get(0).getAnswerThreeText())){
    yesNo.setText("Please Try Again");
    score.setText("");
  }
  else if(ae.getActionCommand().equals("Next Question")){
    question.setText(questionList.get(1).getQuestionText());
    selectOne.setText(questionList.get(1).getAnswerOneText());
    selectTwo.setText(questionList.get(1).getAnswerTwoText());
    selectThree.setText(questionList.get(1).getAnswerThreeText());
    selectFour.setText(questionList.get(1).getAnswerFourText());
  }
  else {
    yesNo.setText("Please Try Again");
    score.setText("");
    }
  */