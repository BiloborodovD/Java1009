package com.dBiloborodov.HomeWork4_1;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Tic Tac Toe games
 * @author Dima
 */

public class TicTacToeDB {
/**
 * Start the game
 * @param args
 */
    public static void main(String args[]){
	TicTacToeFrame tictactoeGUI = new TicTacToeFrame();
	tictactoeGUI.setVisible(true);
    }
}

/**
 * Create the GUI
 */
class TicTacToeFrame extends JFrame{

    // creation of buttons with parameter(index of position) which is need for futher calculations.
    private static final long serialVersionUID = 1L;
    private JButton button1 = new TTButton("0");
    private JButton button2 = new TTButton("1");
    private JButton button3 = new TTButton("2");
    private JButton button4 = new TTButton("3");
    private JButton button5 = new TTButton("4");
    private JButton button6 = new TTButton("5");
    private JButton button7 = new TTButton("6");
    private JButton button8 = new TTButton("7");
    private JButton button9 = new TTButton("8");
    private Act listener = new Act();

    // Constructor for frame
    public TicTacToeFrame(){
	setSize(450, 450);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setLayout(new GridLayout(3, 3));
	setLocation(400, 150);
	add(button1);
	add(button2);
	add(button3);
	add(button4);
	add(button5);
	add(button6);
	add(button7);
	add(button8);
	add(button9);
	button1.addActionListener(listener);
	button2.addActionListener(listener);
	button3.addActionListener(listener);
	button4.addActionListener(listener);
	button5.addActionListener(listener);
	button6.addActionListener(listener);	
	button7.addActionListener(listener);
	button8.addActionListener(listener);
	button9.addActionListener(listener);
    }
}

/**
 * Class for TicTacToe buttons. 
 */
class TTButton extends JButton{

    private static final long serialVersionUID = 1L;
    private String x = "";
    
    //constructor for button
    public TTButton(String name) {
	x = name;
    }
    
    JButton button = new JButton();
    
    /**
     * Get index of the button's position
     * @return - index of the button's position
     */
    public String getInteger(){
	return x;
    }
}

/**
 * Class for users. Each user is instance of this class. Methods of the class provide calculation of win combination.
 */
class User {
    
    static final int[] CODES = {10010010,10001000,10000101,1010000,1001011,1000100,110001,101000,100110};
    
    //create of user's turn string.
    private StringBuffer user = new StringBuffer();
    
    /**
     * Fill of the user's turn string
     * @param symb - index of button position
     * @return - return the user's turn string
     */
    public StringBuffer setUser(String symb){
	user.append(symb);
	return user;
    }
    
    /**
     * Calculate of user's string of state 
     * @return	- user's string of state
     */
    public int calculationOfSeq() {
	int userInt = 0;
	for (int i = 0; i < user.length(); i ++) {
	    int n = (int) (user.charAt(i)-48);
	    userInt = userInt + CODES[n];
	}
	return userInt;
    }
    
    /**
     * Checking of user's string of state on the presence of win identifier (char 3)
     * @param userInt - user's string of state
     * @return - boolean value 
     */
    public boolean calculationOfWin(int userInt) {	
	String userString = new Integer(userInt).toString();
	if(userString.contains("3")) {
	    return true;
	} else {
	    return false;
	}
    }
}

/**
 * Class for listener. It implements ActionListener interface and realizes actions after button press.
 */
class Act implements ActionListener{

    int turnCounter = 0; //counter of turns
    String letter = "";//identifier of sign (cross ar nought)
    User userCrosses = new User();//user for crosses
    User userNoughts = new User();//user for noughts
    User user;
    
    /**
     * Action after press button
     */
    public void actionPerformed(ActionEvent z){

	turnCounter++;// change of the turn counter +1

	//check which user in the game. For the turns 1,3,5,7,9 - cross, for the turns 2,4,6,8 - noughts
	if (turnCounter%2 == 1){
	    letter = "X";
	    user = userCrosses;
	} else {
	    letter = "O";
	    user = userNoughts;
	}

	TTButton button = (TTButton) z.getSource();
	user.setUser(button.getInteger());	//change user's string of turns
	button.setText(letter);			//show choosen sign on button
	button.removeActionListener(this);	//disable button
	
	// Calculation of user's string of state and check it on presence of win identifier
	boolean w = user.calculationOfWin(user.calculationOfSeq());
	
	//Checking win conditions
	if (w == true){
	    JOptionPane.showMessageDialog(null, letter +" " + "Wins!");
	    System.exit(0);
	} else if (turnCounter == 9) {
	    JOptionPane.showMessageDialog(null, "It's a draw!");
	    System.exit(0);
	}
    }
}
