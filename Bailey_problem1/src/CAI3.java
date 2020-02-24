

import java.util.Random;
import java.util.Scanner;

public class CAI3 {
	public static Scanner sc = new Scanner(System.in);
	static int rand_num1, rand_num2, student_ans;



	public static void main(String[] args) {

		int quizChecker = 9;
		double howManyRight = 0 ;
		boolean shouldAsknext = false;




		/*create instance of Random class and generate
        two positive integers that are of single digits.
		 */

		do {


			do{
				quiz();
				if(isAnswerCorrect())
				{
					howManyRight = howManyRight + 1;
				}
				quizChecker = quizChecker - 1;


			}while(quizChecker >= 0);

			double result = howManyRight/10.00;
			result = result * 100;

			if(result > 75){
				System.out.printf("Your score: " + result + " Congratulations, you are ready to go to the next level \n" );

			}
			else{
				System.out.printf("Your score: " + result + " Please ask your teacher for extra help \n " );

			}

			quizChecker = 9;
			howManyRight = 0;

			System.out.println("Would you like to try another set of math questions? Type Y - for yes N - for no");
			String ansRedo = sc.nextLine();

			if(ansRedo.compareToIgnoreCase("Y") == 0){shouldAsknext = true;}
			if(ansRedo.compareToIgnoreCase("N") == 0){shouldAsknext = false;}


		}while(shouldAsknext);

	}




	public static int quiz() {
		Random rand = new Random();
		rand_num1 = rand.nextInt(10);
		rand_num2 = rand.nextInt(10);
		//print statement asking the user math question
		askQuestion();
		String ans = sc.nextLine();

		try {
			student_ans = Integer.parseInt(ans);
		} catch (Exception e) {
			System.out.print("wrong input " + e + "\n");
		}
		return student_ans;
	}








	public static int retakeQuiz() {
		// this prompt pops up if the user get the question wrong
		System.out.printf("\nHow much is " + rand_num1 + " times " + rand_num2 +  "\n" );
		String ans = sc.nextLine();
		try {
			student_ans = Integer.parseInt(ans);

		} catch (Exception e) {
			System.out.print("wrong input " + e + "\n");
		}

		return student_ans;
	}





	// asks the user arithmetic question
	public static void askQuestion() {



		System.out.printf("How much is " + rand_num1 + " times " + rand_num2 +  "\n" );
	}







	public static String RanPos(){
		Random rand = new Random();
		int rand_num1 = rand.nextInt(4);
		switch(rand_num1) {
		case 0:
			// code block
			return "Very good!";
		case 1:
			// code block
			return "Excellent!";
		case 2:
			return "Nice Work!";
			// code block
		case 3:
			return "Keep up the good work!";
			// code block
		default:
			return "";
		}

	}







	public static String RanNeg(){
		Random rand = new Random();
		int rand_num1 = rand.nextInt(4);
		switch(rand_num1) {
		case 0:
			// code block
			return "No, Please try again.";
		case 1:
			// code block
			return "Wrong, Try once more.";
		case 2:
			return "Don't give up!";
			// code block
		case 3:
			return "No, Keep trying.";
			// code block
		default:
			return "";
		}

	}





	public static void displayInorrectResponse() {
		//System.out.printf(RanNeg());

	}






	public static void displayCorrectResponse(){
		//System.out.print(RanPos());
	}








	//checks to see if answer is correct or not
	public static boolean isAnswerCorrect() {
		if(student_ans != rand_num1*rand_num2) {
			displayInorrectResponse();
			return false;
		}
		else {
			displayCorrectResponse();
			return true;
		}
	}

}