
package javaGameGroup5;

import java.util.Scanner;
import javax.swing.JOptionPane;



public class JavaGameGroup5v1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Introducing the program
				System.out.println("Welcome to Who Wants to be a Programmer - The Game!");
				System.out.println();
				System.out.println("You will be prompted to enter your name, followed by a menu of choices.");
				
				
				//Variables
				String userName, q1, q2, q3;
				int mainMenu;
				char a1, a2, a3;
				
				
				//create scanner object
				//need this code to obtain input from user and store
				Scanner keyboard = new Scanner(System.in);
				
				System.out.println("Enter your name: ");
				userName = keyboard.next();
				
				System.out.println("Hello "+ userName + "! - Welcome.");
				System.out.println();
				System.out.println("Please select an option from the main menu: ");
				System.out.println();
				
				
				//Main Menu Output
				System.out.println("Main Menu: \n" +
						"1. See Rules\n" +
						"2. Play Game\n" +
						"3. Exit");
				
				
				mainMenu = keyboard.nextInt();

				// List the rules for the game
				if (mainMenu ==1) {
					JOptionPane.showMessageDialog(null, "Rules: \n" +
					"1) All questions are Java related\n" +
					"2) All questions will be multiple choice with 4 possible answers\n" +
					"3) Questions will increase in difficulty as you progress\n" +
					"4) The correct answer will be displayed after the question is answered");
				
				}


			 	// Play the game	
				else if(mainMenu ==2) {
					JOptionPane.showMessageDialog(null, "Rules: \n" +
					"1) All questions are Java related\n" +
					"2) All questions will be multiple choice with 4 possible answers\n" +
					"3) Questions will increase in difficulty as you progress\n" +
					"4) The correct answer will be displayed after the question is answered");
					
					System.out.println("Let's get this game going!");
					System.out.println();
				
				//Start with questions
				
				// Question 1
					System.out.println("1. Each byte is assigned a unique ____________. \n" + 
							"a. address \n" +
							"b. CPU \n" +
							"c. bit \n" +
							"d. variable \n");
						q1 = keyboard.next();
						a1 = q1.toUpperCase().charAt(0);
							if (a1 =='A') {
							System.out.println("That is correct! Nice work. \n");
				}
							else {
							System.out.println("So sorry, not quite, the correct answer was A. \n" +
									"Better luck on the next question! \n");
				}
				
				// Question 2
					System.out.println("2. JVM stands for: \n" +
							"a. Java Variable Machine \n" +
							"b. Java Variable Method \n" +
							"c. Java Virtual Method \n" +
							"d. Java Virtual Machine");
						q2 = keyboard.next();
						a2 = q2.toUpperCase().charAt(0);
							if (a2 =='B') {
								System.out.println("That is correct! Nice work. \n");
							}
							else {
								System.out.println("So sorry, not exactly, the correct answer was B. \n" +
									"Better luck on the next question! \n");
							}
				
				// Question 3
					System.out.println("3. These characters mark the beginning of a single-line comment: \n" +
							"a. / / \n" +
							"b. / * \n" +
							"c. * / \n" +
							"d. / * *");
						q3 = keyboard.next();
						a3 = q3.toUpperCase().charAt(0);
							if (a3 =='A') {
								System.out.println("That is right! Great job. \n");
							}
							else {
								System.out.println("Sorry, that is not correct. The correct answer was A. \n" +
										"Better luck on the next question! \n");
							}
			}
				
				//Exit game
				else if (mainMenu ==3) {
					JOptionPane.showMessageDialog(null, "Rules: \n" +
					"1) All questions are Java related\n" +
					"2) All questions will be multiple choice with 4 possible answers\n" +
					"3) Questions will increase in difficulty as you progress\n" +
					"4) The correct answer will be displayed after the question is answered");
					System.out.println("So sorry to see you go, " + userName + ". Thanks for stopping by.");
					System.out.println("See you next time!");
				}
			}

	}