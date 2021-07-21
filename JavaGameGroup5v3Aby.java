package javaGameGroup5;

import java.util.Scanner;
import javax.swing.JOptionPane;



public class JavaGameGroup5v3Aby {

		
		static String userName, q1, q2, q3, q4, q5, q6, q7, menuSelect;
		static int opt, points = 0, rightScoreCount = 0, wrongScoreCount = 0;
		static char a1, a2, a3, a4, a5, a6, a7;
		
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			//Algorithm - added in v2
			//1. Introduce the program via dialog box
			//2. Prompt user for name and display name with welcome
			//3. Create variables
			//4. Implement Do While Loop = show Menu options while selections are not the Exit option
			//5. Add more questions from Chapter 3
			//6. Transitioned all items from console to Dialog boxes
			//7. Added point values to questions and implemented accumulator to add up points after each question
			
			//Introducing the program - changed to dialog box in v2
				JOptionPane.showMessageDialog(null, "Welcome to Who Wants to be a Programmer - The Game! \n" +
					"You will be prompted to enter your name, followed by a menu of choices.");
					
					
					//Variables
					//String userName, q1, q2, q3, q4, q5, menuSelect;
					//int opt, scoreCount;
					//char a1, a2, a3, a4, a5;
					
					
					//create scanner object
					//removed scanner and replaced with JOptionpane input dialog in v2
					//Scanner keyboard = new Scanner(System.in);
					
					userName = JOptionPane.showInputDialog("Enter your name: ");
					
					
					JOptionPane.showMessageDialog(null, "Hello "+ userName + "! - Welcome. \n");
					
					//added Do While Loop in v2
					do {
					//Main Menu Output
					menuSelect = JOptionPane.showInputDialog(null,"***Main Menu*** \n" +
							"\t 1. See Rules\n" +
							"\t 2. Play Game\n" +
							"\t 3. Exit\n" +
							" \n" +
							"Enter your selection: ");
					opt = Integer.parseInt(menuSelect);
					

					// List the rules for the game - added message to appear in dialog box in v2
							if (opt == 1)
							{
									JOptionPane.showMessageDialog(null, "Rules: \n" +
												"1) All questions are Java related\n" +
												"2) All questions will be multiple choice with 4 possible answers\n" +
												"3) Questions will increase in difficulty as you progress\n" +
												"4) The correct answer will be displayed after the question is answered");
					
									}


				 	// Play the game - updated message to appear in dialog box in v2	
							else if(opt == 2) 
							{
									JOptionPane.showMessageDialog(null, "Rules: \n" +
											"1) All questions are Java related\n" +
											"2) All questions will be multiple choice with 4 possible answers\n" +
											"3) Questions will increase in difficulty as you progress\n" +
											"4) The correct answer will be displayed after the question is answered");
						
									JOptionPane.showMessageDialog(null, "Let's get this game going!");
									
									Question1();
									Question2();
									Question3();
									Question4();
									Question5();
									Question6();
									Question7();
									
									

							}
							//Exit game
							else if (opt == 3) 
							{
								JOptionPane.showMessageDialog(null, "So sorry to see you go, " + userName + ". Thanks for stopping by. " +
										"See you next time!");
							}



					}
					while (opt !=3);
		}
					
									//Start with questions - changed the questions to appear in dialog boxes rather than in Console
					
									
							
		static void Question1()
	{
		// Question 1
			do
			{
					q1 = JOptionPane.showInputDialog(null, "1. Each byte is assigned a unique ____________. \n" + 
							"a. address \n" +
							"b. CPU \n" +
							"c. bit \n" +
							"d. variable \n" +
							" \n" + 
							"Enter your selection: ");
					a1 = q1.toUpperCase().charAt(0);
					
					if (a1 =='A') 
					{
						//rightScoreCount += 1; //begin correct score count in v3
						points += 5; //begin counting points in v2
						JOptionPane.showMessageDialog(null, "That is correct! Nice work. \n" +
								"You now have " + points + " points. \n");
					}
					
					if (a1 != 'A' && a1 != 'B' && a1 != 'C' && a1 != 'D')
					{
						// Gives a statement to the user if they choose a wrong value that is not from the main main
						JOptionPane.showMessageDialog(null, "***---*** Invalid choice!***---****\n"+ "Please choose A-D from the options.");
					}
					
					if (a1 == 'B' && a1 == 'C' && a1 == 'D') 
					{
						//wrongScoreCount += 1;
						points += 0;
						JOptionPane.showMessageDialog(null, "So sorry, not quite, the correct answer was A. \n" +
						"Better luck on the next question! \n" +
						"You now have " + points + " points. \n");
					}
			}
			 while (a1 != 'A' && a1 != 'B' && a1 != 'C' && a1 != 'D');
			
	}
					
		static void Question2()
		{
			// Question 2
			do
			{
				q2 = JOptionPane.showInputDialog(null, "2. JVM stands for: \n" +
						"a. Java Variable Machine \n" +
						"b. Java Variable Method \n" +
						"c. Java Virtual Method \n" +
						"d. Java Virtual Machine\n" +
						" \n" + 
						"Enter your selection: ");
				a2 = q2.toUpperCase().charAt(0);

				if (a2 =='B') 
				{
					//rightScoreCount += 1; //begin correct score count in v3
					points += 5; //begin counting points in v2
					JOptionPane.showMessageDialog(null, "That is correct! Nice work. \n" +
							"You now have " + points + " points. \n");
				}

				if (a2 != 'A' && a2 != 'B' && a2 != 'C' && a2 != 'D')
				{
					// Gives a statement to the user if they choose a wrong value that is not from the main main
					JOptionPane.showMessageDialog(null, "***---*** Invalid choice!***---****\n"+ "Please choose A-D from the options.");
				}

				if (a2 == 'A' && a2 == 'C' && a2 == 'D') 
				{
					//wrongScoreCount += 1;
					points += 0;
					JOptionPane.showMessageDialog(null, "So sorry, not exactly, the correct answer was B. \n" +
							"Better luck on the next question! \n" +
							"You now have " + points + " points. \n");
				}
			}
			while (a2 != 'A' && a2 != 'B' && a2 != 'C' && a2 != 'D'); 			
		}




		static void Question3()
		{
			// Question 3
			do
			{
				q3 = JOptionPane.showInputDialog(null, "3. These characters mark the beginning of a single-line comment: \n" +
						"a. / / \n" +
						"b. / * \n" +
						"c. * / \n" +
						"d. / * *\n" +
						" \n" + 
						"Enter your selection: ");
				a3 = q3.toUpperCase().charAt(0);

				if (a3 =='A') 
				{
					//rightScoreCount += 1; //begin correct score count in v3
					points += 5; //begin counting points in v2
					JOptionPane.showMessageDialog(null, "That is right! Great job. \n" +
							"You now have " + points + " points. \n");
				}

				if (a3 != 'A' && a3 != 'B' && a3 != 'C' && a3 != 'D')
				{
					// Gives a statement to the user if they choose a wrong value that is not from the main main
					JOptionPane.showMessageDialog(null, "***---*** Invalid choice!***---****\n"+ "Please choose A-D from the options.");
				}

				if (a3 == 'B' && a3 == 'C' && a3 == 'D') 
				{
					//wrongScoreCount += 1;
					points += 0;
					JOptionPane.showMessageDialog(null, "Sorry, that is not correct. The correct answer was A. \n" +
							"Better luck on the next question! \n" +
							"You now have " + points + " points. \n");
				}
			}
			while (a3 != 'A' && a3 != 'B' && a3 != 'C' && a3 != 'D');
		}


		static void Question4()
		{
			// Question 4 - added in v2
			do
			{
				q4 = JOptionPane.showInputDialog(null, "4. The IF statement is an example of a ____________: \n" +
						"a. sequence structure \n" +
						"b. decision structure \n" +
						"c. pathway structure \n" +
						"d. class structure \n" +
						" \n" + 
						"Enter your selection: ");
				a4 = q4.toUpperCase().charAt(0);

				if (a4 =='B') 
				{
					//rightScoreCount += 1; //begin correct score count in v3
					points += 5; //begin counting points in v2
					JOptionPane.showMessageDialog(null, "That is right! Great job. \n" +
							"You now have " + points + " points. \n");
				}

				if (a4 != 'A' && a4 != 'B' && a4 != 'C' && a4 != 'D')
				{
					// Gives a statement to the user if they choose a wrong value that is not from the main main
					JOptionPane.showMessageDialog(null, "***---*** Invalid choice!***---****\n"+ "Please choose A-D from the options.");
				}

				if (a4 == 'A' && a4 == 'C' && a4 == 'D') 
				{
					//wrongScoreCount += 1;
					points += 0;
					JOptionPane.showMessageDialog(null, "Sorry, that is not correct. The correct answer was B. \n" +
							"Better luck on the next question! \n" +
							"You now have " + points + " points. \n");
				}
			}
			while (a4 != 'A' && a4 != 'B' && a4 != 'C' && a4 != 'D');
		}

		static void Question5()
		{
			// Question 5 - added in v2
			do {
				q5 = JOptionPane.showInputDialog(null, "5. This type of expression has a value of either True or False: \n" +
						"a. binary \n" +
						"b. decision \n" +
						"c. unconditional \n" +
						"d. boolean \n" +
						" \n" + 
						"Enter your selection: ");
				a5 = q5.toUpperCase().charAt(0);

				if (a5 =='D') 
				{
					//rightScoreCount += 1; //begin correct score count in v3
					points += 5; //begin counting points in v2
					JOptionPane.showMessageDialog(null, "That is right! Great job. \n" +
							"You now have " + points + " points. \n");
				}

				if (a5 != 'A' && a5 != 'B' && a5 != 'C' && a5 != 'D')
				{
					// Gives a statement to the user if they choose a wrong value that is not from the main main
					JOptionPane.showMessageDialog(null, "***---*** Invalid choice!***---****\n"+ "Please choose A-D from the options.");
				}

				if (a5 == 'A' && a5 == 'B' && a5 == 'C') 
				{
					//wrongScoreCount += 1;
					points += 0;
					JOptionPane.showMessageDialog(null, "Sorry, that is not correct. The correct answer was D. \n" +
							"Better luck on the next question! \n" +
							"You now have " + points + " points. \n");
				}
			}
			while (a5 != 'A' && a5 != 'B' && a5 != 'C' && a5 != 'D');
		}
		static void Question6()
		{
			// Question 6 - added in v3
			do {
				q6 = JOptionPane.showInputDialog(null, "6. Which of the following is a decrement statement in the prefix mode? \n" +
						"a. -x \n" +
						"b. x-- \n" +
						"c. x = x - 1 \n" +
						"d. --x \n" +
						" \n" + 
						"Enter your selection: ");
				a6 = q6.toUpperCase().charAt(0);

				if (a6 =='D') 
				{
					//rightScoreCount += 1; //begin correct score count in v3
					points += 5; //begin counting points in v2
					JOptionPane.showMessageDialog(null, "That is right! Great job. \n" +
							"You now have " + points + " points. \n");
				}

				if (a6 != 'A' && a6 != 'B' && a6 != 'C' && a6 != 'D')
				{
					// Gives a statement to the user if they choose a wrong value that is not from the main main
					JOptionPane.showMessageDialog(null, "***---*** Invalid choice!***---****\n"+ "Please choose A-D from the options.");
				}

				if (a6 == 'A' && a6 == 'B' && a6 == 'C') 
				{
					//wrongScoreCount += 1;
					points += 0;
					JOptionPane.showMessageDialog(null, "Sorry, that is not correct. The correct answer was D. \n" +
							"Better luck on the next question! \n" +
							"You now have " + points + " points. \n");
				}
			}
			while (a6 != 'A' && a6 != 'B' && a6 != 'C' && a6 != 'D');
		}	
		static void Question7()
		{
			// Question 7 - added in v3
			do {
				q7 = JOptionPane.showInputDialog(null, "7. What will the println statement in the following program segment display? \n" +
						"int x = 5; \n" +
						"System.out.println(x++); \n\n" +
						"a. 5 \n" +
						"b. 6 \n" +
						"c. 0 \n" +
						"d. None of these \n" +
						" \n" + 
						"Enter your selection: ");
				a7 = q7.toUpperCase().charAt(0);

				if (a7 =='A') 
				{
					//rightScoreCount += 1; //begin correct score count in v3
					points += 5; //begin counting points in v2
					JOptionPane.showMessageDialog(null, "That is right! Great job. \n" +
							"You now have " + points + " points. \n");
				}

				if (a7 != 'A' && a7 != 'B' && a7 != 'C' && a7 != 'D')
				{
					// Gives a statement to the user if they choose a wrong value that is not from the main main
					JOptionPane.showMessageDialog(null, "***---*** Invalid choice!***---****\n"+ "Please choose A-D from the options.");
				}

				if (a7 == 'B' && a7 == 'C' && a7 == 'D') 
				{
					//wrongScoreCount += 1;
					points += 0;
					JOptionPane.showMessageDialog(null, "Sorry, that is not correct. The correct answer was A. \n" +
							"Better luck on the next question! \n" +
							"You now have " + points + " points. \n");
				}
			}
			while (a7 != 'A' && a7 != 'B' && a7 != 'C' && a7 != 'D');
		}	

}
