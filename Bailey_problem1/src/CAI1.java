import java.util.Random;
import java.util.Scanner;

public class CAI1 {
	public static Scanner sc = new Scanner(System.in);
	static int rand_num1;
	static int rand_num2;
	static int student_ans;



	public static void main(String[] args) {



		
			quiz();
			isAnswerCorrect();
		

	}
	// quiz method generates single digit random number
	public static int quiz() {
		Random rand = new Random();
		rand_num1 = rand.nextInt(10);
		rand_num2 = rand.nextInt(10);
		//print statement asking the user math question 
		askQuestion();
		String ans = sc.nextLine();
		// catches user input error
		try {
			student_ans = Integer.parseInt(ans);
		} catch (Exception c) {
			System.out.print("wrong input " + c + "\n");
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
	//asks the user math question
	public static void askQuestion() {


		
		System.out.printf("How much is " + rand_num1 + " times " + rand_num2 +  "\n" );
	}


	//displays incorrect respond that has a do loop, which will not break unless user corrects his or her mistake.
	public static void displayInorrectResponse() {
		do{
			System.out.printf("No. Please try again.");
			retakeQuiz();

		}while(student_ans != rand_num1*rand_num2);
		System.out.println("Very good. ");
	}
	public static void displayCorrectResponse(){
		System.out.print("Very good.\n ");
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