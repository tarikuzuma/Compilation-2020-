package doodles_november;
import java.util.Scanner;
public class Compilation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List of code that I want to compile. Also a practice for methods.
		Scanner scanner = new Scanner (System.in);
		
		while (true) {
		System.out.println("This is the list of programs that you can access:\n"
						+"1. Largest Three\n"
						+"2. Grade Computer\n"
						+"3. Password Inputter\n"
						+"Please type 'Help' for more infromation regarding the programs"
						+"Type the number of the program you want to use (1 / 2 / 3 / Help / Exit):"
							);
				String Userchoice = scanner.nextLine();
				if (Userchoice.equalsIgnoreCase("1")) {
					LargestThree();
					while (true) {
						System.out.println("Do you wish to try the program again? (Yes or No)");
						String Choice1 = scanner.nextLine();
			
						if (Choice1.equalsIgnoreCase("Yes")) {
							System.out.println("Try it again! \n"
									+ "\n"
									+ "");
							LargestThree();
						} else if (Choice1.equalsIgnoreCase("No")) {
							System.out.println("Understandable, I hope you had fun! \n"
									+ "");
							break;
						} else {
							System.out.println("That is not a choice, please retry. \n"
									+ "");
						}
						
					}
				} else if (Userchoice.equalsIgnoreCase("2")) {
					GradeComputer();
					while (true) {
						System.out.println("Do you wish to try the program again? (Yes or No)");
						String Choice2 = scanner.nextLine();
						
						if (Choice2.equalsIgnoreCase("Yes")) {
							System.out.println("Try it again!\n"
									+ "\n"
									+ "");
							GradeComputer();
						} else if (Choice2.equalsIgnoreCase("No")) {
							System.out.println("Understandable, I hope you had fun! \n"
									+ "");
							break;
						} else {
							System.out.println("That is not a choice, please retry.\n"
									+ "");
						}
					}
				} else if (Userchoice.equalsIgnoreCase("3")) {
					Password();
					 while (true) {
						System.out.println("Do you wish to try the program again? (Yes or No)");
						String Choice3 = scanner.nextLine();
					
						if (Choice3.equalsIgnoreCase("Yes")) {
							System.out.println("Try it again!\n"
									+ "\n"
									+ "");
							Password();
						} else if (Choice3.equalsIgnoreCase("No")) {
							System.out.println("Understandable, I hope you had fun! \n"
									+ "");
							break;
						} else {
							System.out.println("That is not a choice, please retry.\n"
									+ "");
					}
				} 
				
			} else if (Userchoice.equalsIgnoreCase("Help")) {
				System.out.println("1. 'Largest Three' is a program that helps the user know what number is the biggest among three given numbers. \n"
								+ ""
								+ "2. 'Grade Computer' is a program that helps the user identify the total average of a student. It asks for three \n"
								+ "numbers that is not lower than 0 and not bigger then a hundred. It also identifies if the user is an honor. \n"
								+ ""
								+ "3. 'Password Inputter' lets the user create a certain password. Password will then save as String = pass. The program \n"
								+ "lets the user input the password again to see if what they put was the same on what they put originally. If they fail \n"
								+ "5 times then the program stops. \n"
								+ "\n"
								+ "");
			} else if (Userchoice.equalsIgnoreCase("Exit")) {
				System.out.println("Goodbye :(");
				break;
			} else {
				System.out.println("That is not in the given choices.");
			}
		
		}
	}
	
	public static void LargestThree () {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Whatever you do, DO NOT INPUT A CHARACTER OTHER THAN A NUMBER T-T (pwease)");
		System.out.println("Input three numbers");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		String g = "Some of the numbers are equal";
		
			if (num1 == num2 || num1 == num3 || num2 == num3) {
				System.out.println(g);
			} else if (num1 == num2 && num1 == num3 && num2 == num3) {
				System.out.println(g);
				} else if (num1 > num3 && num1 > num2) {
					System.out.println(num1 + " is the largest number");
				} else if (num2 > num1 && num2 > num3) {
					System.out.println(num2 + " is the largest number");
				} else if (num3 > num1 && num3 > num2) {
					System.out.println(num3 + " is the largest number");
				}
			
			
	}
	
	public static void GradeComputer () {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Do not input other characters other than a number. Thank you :3");
		System.out.println("Average doer:");
		double num1 = scanner.nextDouble();
		if (101 > num1 && 0 < num1) {
			
			double num2 = scanner.nextDouble();
			if (101 > num2 && 0 < num2) {
				
				double num3 = scanner.nextDouble();
				if (101 > num3 && 0 < num3) {
					double average = (num1 + num2 + num3) / 3;
					System.out.println("Your average is " + average);
					
						if (average >= 75) {
						System.out.println("Congrats, you passed ");
							
							if (average >= 90 && average <= 100) {
							System.out.println(" and you're an honor!");
							} 
						} else if (74 > average) {
							System.out.println("Below average. Thee's always next time");
						}
				} else {
					System.out.println("input a number not lower than 0 or higher than 100");
				}
			} else {
				System.out.println("input a number not lower than 0 or higher than 100");
			}
		} else {
			System.out.println("input a number not lower than 0 or higher than 100");
		}
		
		
	}
	
	public static void Password () {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Create Password:");
		String pass = scanner.nextLine();
		// Password Input
		
		int i = 0;
		int j = 5;
		while (true) {
			System.out.println("Input password:");
			String ans = scanner.nextLine();
			
				if (ans.equals(pass)) {
					System.out.println("Hello, welcome back!");
					break;
				}  else {
					System.out.println("try again");
					i++;
					if (i==j) {
						System.out.println("You've reached the maximum number of tries. Please try again later.");
						break;
						
				}
			}
		}
		
	}
	
}
