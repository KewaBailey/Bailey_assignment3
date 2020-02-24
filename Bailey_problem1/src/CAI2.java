
import java.util.Random;
import java.util.Scanner;

public class CAI2 {
	public static Scanner sc = new Scanner(System.in);
	static int rand_num1;
	static int rand_num2;
	static int student_ans;



	public static void main(String[] args) {




		/*create instance of Random class and generate
two positive integers that are of single digits.
		 */

		do {
			quiz();
			isAnswerCorrect();
		}while(true);

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
		} catch (Exception c) {
			System.out.print("wrong input " + c + "\n");
		}
		return student_ans;
	}


	public static int retakeQuiz() {

		System.out.printf("\nHow much is " + rand_num1 + " times " + rand_num2 +  "\n" );
		String ans = sc.nextLine();
		try {
			student_ans = Integer.parseInt(ans);

		} catch (Exception e) {
			System.out.print("wrong input " + e + "\n");
		}

		return student_ans;
	}
	public static void askQuestion() {



		System.out.printf("How much is " + rand_num1 + " times " + rand_num2 +  "\n" );
	}

	public static String RanPos(){
		Random rand = new Random();
		int rand_num1 = rand.nextInt(4);
		switch(rand_num1) {
		case 0:
			// code block
			return "Very good!\n";
		case 1:
			// code block
			return "Excellent!\n";
		case 2:
			return "Nice Work!\n";
			// code block
		case 3:
			return "Keep up the good work!\n";
			// code block
		default:
			return "";
		}

	}
	// random negative response that just switches response prompts 
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
	//displays incorrect respond that has a do loop, which will not break unless user corrects his or her mistake.
	public static void displayInorrectResponse() {
		do{
			System.out.printf(RanNeg());
			retakeQuiz();

		}while(student_ans != rand_num1*rand_num2);
		System.out.println(RanPos());
	}
	public static void displayCorrectResponse(){
		System.out.print(RanPos());
	}
	public static void isAnswerCorrect() {
		if(student_ans != rand_num1*rand_num2) {
			displayInorrectResponse();
		}
		else {
			displayCorrectResponse();
		}
	}

}

