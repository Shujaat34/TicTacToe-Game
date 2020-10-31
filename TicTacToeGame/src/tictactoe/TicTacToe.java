package tictactoe;

/**
 * These are the imports for the classes that we use in our Project For the classes
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

/***
 *  TicTacToe is a child class of JFrame class and it qcquires all the properties of its
 *  Parent JFrame.
 */

public class TicTacToe extends JFrame {

	/**
	 * As TicToe has all the properties of JFrame now TicTacToe class can use the components
	 * of JFrame class like the below are the compoenets of JFrame class and TicTacToe whi
	 */
	private JPanel contentPane;
    private JLabel lblPlayerOScore;
    private JLabel lblPlayerXScore;
    
    /**
     * These are the instance of 9 buttons for the borad in the TicTacToe
     */
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton5;
    private JButton jButton6;
    private JButton jButton7;
    private JButton jButton8;
    private JButton jButton9;
    
    /**
     * startGame is a String varialbe which has X at starting
     */
    private String startGame = "X";
    /**
     * These are the variables for the score playerXScore For Player X Score and playerOScore is
     * For Player O Score
     */
    private int playerXScore = 0;
    private int playerOScore = 0;
    
    /**
     * This is the Main method which runs the game
     */
    
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					// The TicTacToe Frame class
					TicTacToe frame = new TicTacToe();
					frame.setTitle("Tic Tac Toe");
					// Initializing the Frame at Center
					frame.setLocationRelativeTo(null);
					
					// Displaying the Frame
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
   
	
/**
 * TicTacToe() is a constructor of the class which is used to initialize all the GUI componenets
 */
	public TicTacToe() {
		// When we press the exit It exits
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// The size of the Frame
		setBounds(100, 100, 1200, 600);
		contentPane = new JPanel();
		// Setting the Background and Foreground Color
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(new Color(204,229,255));
		// Setting the Border on the Frame
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		setContentPane(contentPane);
		// Setting the Layout
		contentPane.setLayout(new BorderLayout(0, 0));
		
		
		// The Label with the Name at the top in bold Tic Tac Toe
		JLabel lblNewLabel = new JLabel("Tic Tac Toe");
		// Aligning the Lable at Center
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		// Setting the Color of the Label as BLUE
		lblNewLabel.setForeground(Color.BLUE);
		// Setting the Style of the Label as Bold and Forte with font size 99
		lblNewLabel.setFont(new Font("Forte", Font.BOLD, 99));
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		// Parent panel for containing the buttons and labels and child panels
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204,229,255));
		contentPane.add(panel, BorderLayout.CENTER);
		// Setting the Layout as GridLayout with 3 rows 5 columns and 2 vertical spacing and 2 horizontal spacing
		panel.setLayout(new GridLayout(3, 5, 2, 2));
		
		// Child Panel
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		// Button1
		jButton1 = new JButton("");
		jButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// When we press the Button one it should check the button is empty then set the corresponding X or O
				 if(jButton1.getText().toString().isEmpty()){
			            jButton1.setText(startGame);
			            // Changing the Text of the Button Either X is black O is RED
			            ChangeColorForPlayer(jButton1);
			            // calling the method chooseAPlayer()
			            chooseAPlayer();
			            // calling the method whoWins()
			            whoWins();
			        }else{  
			        	// If the Place is already Taken then show pop up with this message
			            JOptionPane.showMessageDialog(TicTacToe.this, "Place Already Taken","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			        }
			}
		});
		
		// Setting the  button into the child Panel
		jButton1.setFont(new Font("Forte", Font.BOLD, 83));
		panel_1.add(jButton1,BorderLayout.CENTER);
		
		// child panel2
		JPanel panel_2 = new JPanel();
		panel.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		// Button 2 with same Code and Explanation as ob Button1
		jButton2 = new JButton("");
		jButton2.setFont(new Font("Forte", Font.BOLD, 83));
		jButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        if(jButton2.getText().toString().isEmpty()){
		            jButton2.setText(startGame);
		            ChangeColorForPlayer(jButton2);
		            chooseAPlayer();
		            whoWins();
		        }else{  
		            JOptionPane.showMessageDialog(TicTacToe.this, "Place Already Taken","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
		        }

			}
		});
		panel_2.add(jButton2,BorderLayout.CENTER);
		
		JPanel panel_3 = new JPanel();
		panel.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		// Button 3 with Same code and Function as of Button1
		jButton3 = new JButton("");
		jButton3.setFont(new Font("Forte", Font.BOLD, 83));
		jButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        if(jButton3.getText().toString().isEmpty()){
		            jButton3.setText(startGame);
		            ChangeColorForPlayer(jButton3);
		            chooseAPlayer();
		            whoWins();
		        }else{  
		            JOptionPane.showMessageDialog(TicTacToe.this, "Place Already Taken","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
		        }

			}
		});
		panel_3.add(jButton3,BorderLayout.CENTER);
		
		JPanel panel_4 = new JPanel();
		panel.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JLabel playerX = new JLabel("Player X");
		// Setting the Font as BOld with size 46
		playerX.setFont(new Font("Segoe Script", Font.BOLD, 46));
		// setting the Color of the Label as BLUE For Player X
		playerX.setForeground(Color.BLACK);
		panel_4.add(playerX,BorderLayout.CENTER);
		
		JPanel panel_5 = new JPanel();
		panel.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		// Initial Socre For Player X in Label lblPlayerXScore.
		lblPlayerXScore = new JLabel("0");
		lblPlayerXScore.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayerXScore.setFont(new Font("Segoe Script", Font.BOLD, 81));
		lblPlayerXScore.setForeground(Color.BLACK);
		panel_5.add(lblPlayerXScore,BorderLayout.CENTER);
		
		JPanel panel_6 = new JPanel();
		panel.add(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		// Button4 has same code as of button1
		jButton4 = new JButton("");
		jButton4.setFont(new Font("Forte", Font.BOLD, 83));
		jButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  if(jButton4.getText().toString().isEmpty()){
			            jButton4.setText(startGame);
			            ChangeColorForPlayer(jButton4);
			            chooseAPlayer();
			            whoWins();
			        }else{  
			            JOptionPane.showMessageDialog(TicTacToe.this, "Place Already Taken","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			        }
			}
		});
		panel_6.add(jButton4,BorderLayout.CENTER);
		
		JPanel panel_7 = new JPanel();
		panel.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		// Button5 has same code as of button1
		jButton5 = new JButton("");
		jButton5.setFont(new Font("Forte", Font.BOLD, 83));
		jButton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 if(jButton5.getText().toString().isEmpty()){
			            jButton5.setText(startGame);
			            ChangeColorForPlayer(jButton5);
			            chooseAPlayer();
			            whoWins();
			        }else{  
			            JOptionPane.showMessageDialog(TicTacToe.this, "Place Already Taken","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			        }
			}
		});
		panel_7.add(jButton5,BorderLayout.CENTER);
		
		// child panel8
		JPanel panel_8 = new JPanel();
		panel.add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		// Button6 has same code as of button1
		jButton6 = new JButton("");
		jButton6.setFont(new Font("Forte", Font.BOLD, 83));
		jButton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 if(jButton6.getText().toString().isEmpty()){
			            jButton6.setText(startGame);
			            ChangeColorForPlayer(jButton6);
			            chooseAPlayer();
			            whoWins();
			        }else{  
			            JOptionPane.showMessageDialog(TicTacToe.this, "Place Already Taken","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			        }
			}
		});
		panel_8.add(jButton6,BorderLayout.CENTER);
		
		JPanel panel_9 = new JPanel();
		panel.add(panel_9);
		panel_9.setLayout(new BorderLayout(0, 0));
		
		// Label for showing the Player O
		JLabel playerO = new JLabel("Player O");
		// Setting the Font as BOld with size 46
		playerO.setFont(new Font("Segoe Script", Font.BOLD, 46));
		// setting the Color of the LABEL as RED For Player O
		playerO.setForeground(Color.RED);
		panel_9.add(playerO,BorderLayout.CENTER);
		
		JPanel panel_10 = new JPanel();
		panel.add(panel_10);
		panel_10.setLayout(new BorderLayout(0, 0));
		
		// Initial Score for the Palyer O in the Label lblPlayerOScore
		lblPlayerOScore = new JLabel("0");
		lblPlayerOScore.setHorizontalAlignment(SwingConstants.CENTER);
		// Setting the Font as bold and size 81 and Color RED For Player O Score
		lblPlayerOScore.setFont(new Font("Segoe Script", Font.BOLD, 81));
		lblPlayerOScore.setForeground(Color.RED);
		panel_10.add(lblPlayerOScore,BorderLayout.CENTER);
		
		JPanel panel_12 = new JPanel();
		panel.add(panel_12);
		panel_12.setLayout(new BorderLayout(0, 0));
		
		// Same as button1
		jButton7 = new JButton("");
		jButton7.setFont(new Font("Forte", Font.BOLD, 83));
		jButton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				   if(jButton7.getText().toString().isEmpty()){
			            jButton7.setText(startGame);
			            ChangeColorForPlayer(jButton7);
			            chooseAPlayer();
			            whoWins();
			        }else{  
			            JOptionPane.showMessageDialog(TicTacToe.this, "Place Already Taken","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			        }
			}
		});
		panel_12.add(jButton7,BorderLayout.CENTER);
		
		// child panel 13
		JPanel panel_13 = new JPanel();
		panel.add(panel_13);
		panel_13.setLayout(new BorderLayout(0, 0));
		
		// Same as button1
		jButton8 = new JButton();
		jButton8.setFont(new Font("Forte", Font.BOLD, 83));
		jButton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			     if(jButton8.getText().toString().isEmpty()){
			            jButton8.setText(startGame);
			            ChangeColorForPlayer(jButton8);
			            chooseAPlayer();
			            whoWins();
			        }else{  
			            JOptionPane.showMessageDialog(TicTacToe.this, "Place Already Taken","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			        }
			}
		});
		panel_13.add(jButton8,BorderLayout.CENTER);
		
		JPanel panel_14 = new JPanel();
		panel.add(panel_14);
		panel_14.setLayout(new BorderLayout(0, 0));
		
		// Same as button1
		jButton9 = new JButton("");
		jButton9.setFont(new Font("Forte", Font.BOLD, 83));
		jButton9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    if(jButton9.getText().toString().isEmpty()){
		            jButton9.setText(startGame);
		            ChangeColorForPlayer(jButton9);
		            chooseAPlayer();
		            whoWins();
		        }else{  
		            JOptionPane.showMessageDialog(TicTacToe.this, "Place Already Taken","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
		        }
			}
		});
		panel_14.add(jButton9,BorderLayout.CENTER);
		
		// child panel 11
		JPanel panel_11 = new JPanel();
		panel.add(panel_11);
		panel_11.setLayout(new BorderLayout(0, 0));
		
		// When we press the Reset Button
		JButton btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Segoe Script", Font.BOLD, 50));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Resetting the Text to empty string in all the buttons and set the background as gray
		        jButton1.setText("");
		        jButton2.setText("");
		        jButton3.setText("");
		        jButton4.setText("");
		        jButton5.setText("");
		        jButton6.setText("");
		        jButton7.setText("");
		        jButton8.setText("");
		        jButton9.setText("");
		        
		        // Resetting the Color as Gray
		        jButton1.setBackground(Color.lightGray);
		        jButton2.setBackground(Color.lightGray);
		        jButton3.setBackground(Color.lightGray);
		        jButton4.setBackground(Color.lightGray);
		        jButton5.setBackground(Color.lightGray);
		        jButton6.setBackground(Color.lightGray);
		        jButton7.setBackground(Color.lightGray);
		        jButton8.setBackground(Color.lightGray);
		        jButton9.setBackground(Color.lightGray);
		        
		        // Enabling the Buttons
		        enableAll(jButton1, jButton2, jButton3, jButton4, jButton5, jButton6, jButton7, jButton8, jButton9);

			}
		});
		panel_11.add(btnReset,BorderLayout.CENTER);
		//child panel15
		JPanel panel_15 = new JPanel();
		panel.add(panel_15);
		panel_15.setLayout(new BorderLayout(0, 0));
		
		// When we press The Exit Button
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			       // The option should come with the message to confirm for the Exit If we press yes the Frame exits
			       if(JOptionPane.showConfirmDialog( new JFrame("Exit"), "Do you want to Exit", "Tic Tac Toe",
			               JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
			           System.exit(0);
			       }

			}
		});
		btnExit.setFont(new Font("Segoe Script", Font.BOLD, 50));
		panel_15.add(btnExit,BorderLayout.CENTER);
		
		
		// calling the defaultColor Method
		defaultColor();
	}
	// Method for the Initial Socre of the both Players is zero
    private void gameScore(){
        lblPlayerXScore.setText(playerXScore+"");
        lblPlayerOScore.setText(playerOScore+"");
    }
    
    // Method for the changing the Color. X=>BLACK , O=>RED
    public void ChangeColorForPlayer(JButton btn){
        if(startGame.equals("X")){
        	// When there is X set the Color as BLACK
            btn.setForeground(Color.BLACK);
        }else{
        	// When there is O set the Color as RED
            btn.setForeground(Color.RED);
        }
    }
    // Foc changing the turn of each player
    private void chooseAPlayer(){
        if(startGame.equals("X")){
        	//If X already played Now turn to O
            startGame = "O";
        }else{
        	//If O already played Now turn to X
            startGame = "X";
        }
    }
 // To determine which player wins
    private void whoWins(){
    	
    	// The Board Array of 9 because We have 3x3 board
    	String board[] = {jButton1.getText().toString(),
    			jButton2.getText().toString(),
    			jButton3.getText().toString(),
    			jButton4.getText().toString(),
    			jButton5.getText().toString(),
    			jButton6.getText().toString(),
    			jButton7.getText().toString(),
    			jButton8.getText().toString(),
    			jButton9.getText().toString(),};
        
//        String b1 = jButton1.getText().toString();
//        String b2 = jButton2.getText().toString();
//        String b3 = jButton3.getText().toString();
//        String b4 = jButton4.getText().toString();
//        String b5 = jButton5.getText().toString();
//        String b6 = jButton6.getText().toString();
//        String b7 = jButton7.getText().toString();
//        String b8 = jButton8.getText().toString();
//        String b9 = jButton9.getText().toString();
        
        // Player X Winning Condition
        if(board[0].equals("X") && board[1].equals("X") && board[2].equals("X")){
        	// If X wins show this Message 
            JOptionPane.showMessageDialog(this, "Player X wins ");
            // increase one time win in the Player X Score
            playerXScore++;
            // call the method gameScore()
            gameScore();
            
            // If X wins set the Background Color as Yellow for button1 button2 and button3
            winSetColor(jButton1);
            winSetColor(jButton2);
            winSetColor(jButton3);
            // Save the DAta in the File as Score.txt
            dataWrite("Score.txt" , "Player X Score "+playerXScore+"\n");
            // Disable all the other buttons when X wins.
            disableAll(jButton4, jButton5, jButton6, jButton7, jButton8, jButton9);
        }
          
       // Same as Player X Winning Condition
       if(board[3].equals("X") && board[4].equals("X") && board[5].equals("X")){
            JOptionPane.showMessageDialog(this, "Player X wins ");
            playerXScore++;
            gameScore();
            
            winSetColor(jButton4);
            winSetColor(jButton5);
            winSetColor(jButton6);
            
            dataWrite("Score.txt" , "Player X Score "+playerXScore+"\n");
            disableAll(jButton1, jButton2, jButton3, jButton7, jButton8, jButton9);
     
        }
       // Same as Player X Winning Condition
        if(board[6].equals("X") && board[7].equals("X") && board[8].equals("X")){
            JOptionPane.showMessageDialog(this, "Player X wins ");
            playerXScore++;
            gameScore();
            
            winSetColor(jButton7);
            winSetColor(jButton8);
            winSetColor(jButton9);
            
            dataWrite("Score.txt" , "Player X Score "+playerXScore+"\n");
            // For disabling the Buttons
            disableAll(jButton1, jButton2, jButton3, jButton4, jButton5, jButton6);
     
        }
        // Same as Player X Winning Condition
        if(board[0].equals("X") && board[3].equals("X") && board[6].equals("X")){
            JOptionPane.showMessageDialog(this, "Player X wins ");
            playerXScore++;
            gameScore();
            
            winSetColor(jButton1);
            winSetColor(jButton4);
            winSetColor(jButton7);
            
            dataWrite("Score.txt" , "Player X Score "+playerXScore+"\n");
            disableAll(jButton2, jButton5, jButton8, jButton3, jButton6, jButton9);
     
        }
        // Same as Player X Winning Condition
        if(board[1].equals("X") && board[4].equals("X") && board[7].equals("X")){
            JOptionPane.showMessageDialog(this, "Player X wins ");
            playerXScore++;
            gameScore();
            
            winSetColor(jButton2);
            winSetColor(jButton5);
            winSetColor(jButton8);
       
            dataWrite("Score.txt" , "Player X Score "+playerXScore+"\n");
            disableAll(jButton1, jButton4, jButton7, jButton3, jButton6, jButton9);
     
        }
        // Same as Player X Winning Condition
        if(board[2].equals("X") && board[5].equals("X") && board[8].equals("X")){
            JOptionPane.showMessageDialog(this, "Player X wins ");
            playerXScore++;
            gameScore();
            
            winSetColor(jButton3);
            winSetColor(jButton6);
            winSetColor(jButton9);
            dataWrite("Score.txt" , "Player X Score "+playerXScore+"\n");
            disableAll(jButton1, jButton4, jButton7, jButton2, jButton5, jButton8);
     
        }
        // Same as Player X Winning Condition
        if(board[0].equals("X") && board[4].equals("X") && board[8].equals("X")){
            JOptionPane.showMessageDialog(this, "Player X wins ");
            playerXScore++;
            gameScore();
            
            winSetColor(jButton1);
            winSetColor(jButton5);
            winSetColor(jButton9);
            
            dataWrite("Score.txt" , "Player X Score "+playerXScore+"\n");
            disableAll(jButton2, jButton3, jButton4, jButton6, jButton7, jButton8);
     
            
        }
        // Same as Player X Winning Condition
        if(board[2].equals("X") && board[5].equals("X") && board[6].equals("X")){
            JOptionPane.showMessageDialog(this, "Player X wins ");
            playerXScore++;
            gameScore();
            
            winSetColor(jButton3);
            winSetColor(jButton5);
            winSetColor(jButton7);
            
            
            dataWrite("Score.txt" , "Player X Score "+playerXScore+"\n");
            disableAll(jButton1, jButton2, jButton4, jButton6, jButton8, jButton9);
     
        }
        
        //Player O Winning Condition        
          if(board[0].equals("O") && board[1].equals("O") && board[2].equals("O")){
        	//If O wins show this Message 
            JOptionPane.showMessageDialog(this, "Player O wins ");
            //increase one time win in the Player O Score
            playerOScore++;
            // call the method gameScore()
            gameScore();
            
            // If O wins set the Background Color as Yellow for button1 button2 and button3
            winSetColor(jButton1);
            winSetColor(jButton2);
            winSetColor(jButton3);
            // Save the DAta in the File as Score.txt
            dataWrite("Score.txt" , "Player O Score "+playerOScore+"\n");
            //Disable all the other buttons when X wins.
            disableAll(jButton4, jButton5, jButton6, jButton7, jButton8, jButton9);
        }
       // Same as Player O Winning Condition
        if(board[3].equals("O") && board[4].equals("O") && board[5].equals("O")){
            JOptionPane.showMessageDialog(this, "Player O wins ");
            playerOScore++;
            gameScore();
            
            winSetColor(jButton4);
            winSetColor(jButton5);
            winSetColor(jButton6);
            
            dataWrite("Score.txt" , "Player O Score "+playerOScore+"\n");
            disableAll(jButton1, jButton2, jButton3, jButton7, jButton8, jButton9);
        }
     // Same as Player O Winning Condition
        if(board[6].equals("O") && board[7].equals("O") && board[8].equals("O")){
            JOptionPane.showMessageDialog(this, "Player O wins ");
            playerOScore++;
            gameScore();
            
            winSetColor(jButton7);
            winSetColor(jButton8);
            winSetColor(jButton9);
            
            dataWrite("Score.txt" , "Player O Score "+playerOScore+"\n");
            disableAll(jButton1, jButton2, jButton3, jButton4, jButton5, jButton6);
        }
     // Same as Player O Winning Condition
        if(board[0].equals("O") && board[3].equals("O") && board[6].equals("O")){
            JOptionPane.showMessageDialog(this, "Player O wins ");
            playerOScore++;
            gameScore();
            
            winSetColor(jButton1);
            winSetColor(jButton4);
            winSetColor(jButton7);
            
            dataWrite("Score.txt" , "Player O Score "+playerOScore+"\n");
            disableAll(jButton2, jButton5, jButton8, jButton3, jButton6, jButton9);
        }
     // Same as Player O Winning Condition
        if(board[1].equals("O") && board[4].equals("O") && board[7].equals("O")){
            JOptionPane.showMessageDialog(this, "Player O wins ");
            playerOScore++;
            gameScore();
            
            winSetColor(jButton2);
            winSetColor(jButton5);
            winSetColor(jButton8);
            
            dataWrite("Score.txt" , "Player O Score "+playerOScore+"\n");
            disableAll(jButton1, jButton4, jButton7, jButton3, jButton6, jButton9);
        }
     // Same as Player O Winning Condition
        if(board[2].equals("O") && board[5].equals("O") && board[8].equals("O")){
            JOptionPane.showMessageDialog(this, "Player O wins ");
            playerOScore++;
            gameScore();
            
            winSetColor(jButton3);
            winSetColor(jButton6);
            winSetColor(jButton9);
            
            dataWrite("Score.txt" , "Player O Score "+playerOScore+"\n");
            disableAll(jButton1, jButton4, jButton7, jButton2, jButton5, jButton8);
        }
     // Same as Player O Winning Condition
        if(board[0].equals("O") && board[4].equals("O") && board[8].equals("O")){
            JOptionPane.showMessageDialog(this, "Player O wins ");
            playerOScore++;
            gameScore();
            
            winSetColor(jButton1);
            winSetColor(jButton5);
            winSetColor(jButton9);
           
            dataWrite("Score.txt" , "Player O Score "+playerOScore+"\n");
            disableAll(jButton2, jButton3, jButton4, jButton6, jButton7, jButton8);

        }
     // Same as Player O Winning Condition
        if(board[2].equals("O") && board[4].equals("O") && board[6].equals("O")){
            JOptionPane.showMessageDialog(this, "Player O wins ");
            playerOScore++;
            gameScore();
            
            winSetColor(jButton3);
            winSetColor(jButton5);
            winSetColor(jButton7);
            
            dataWrite("Score.txt" , "Player O Score "+playerOScore+"\n");
            disableAll(jButton1, jButton2, jButton4, jButton6, jButton8, jButton9);
        }
                 

    }
    // For Disbaling the Button given in the parameters of the method 
    private void disableAll(JButton jButton4 ,JButton jButton5 ,JButton jButton6 ,JButton jButton7,
            JButton jButton8,JButton jButton9){
        
        jButton4.setEnabled(false);
        jButton5.setEnabled(false);
        jButton6.setEnabled(false);
        jButton7.setEnabled(false);
        jButton8.setEnabled(false);
        jButton9.setEnabled(false);
        
    }
    // For enabling the buttons given in the parameters of the method
    private void enableAll(JButton jButton1,JButton jButton2,JButton jButton3,
            JButton jButton4 ,JButton jButton5 ,JButton jButton6 ,JButton jButton7,
            JButton jButton8,JButton jButton9){
        
        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton4.setEnabled(true);
        jButton5.setEnabled(true);
        jButton6.setEnabled(true);
        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
        jButton9.setEnabled(true);
  
    }
    // For saving the data into the Text File
    public void dataWrite(String fileName , String addData) {
        try {
                FileWriter fw = new FileWriter(fileName,true);
                fw.write(addData);
                fw.close();
        } catch (Exception e) {
                System.out.println(e);
        }
    }
    
    // When someon wins set the backgourn color as Yellow of the Line
    public void winSetColor(JButton btn){
        btn.setBackground(Color.YELLOW);
    }
    
    // The default color of the Buttons is lightGray
    public void defaultColor() {
        jButton1.setBackground(Color.lightGray);
        jButton2.setBackground(Color.lightGray);
        jButton3.setBackground(Color.lightGray);
        jButton4.setBackground(Color.lightGray);
        jButton5.setBackground(Color.lightGray);
        jButton6.setBackground(Color.lightGray);
        jButton7.setBackground(Color.lightGray);
        jButton8.setBackground(Color.lightGray);
        jButton9.setBackground(Color.lightGray);
    }


}
