
import java.util.Random;
import java.util.Scanner;

public class CAI4 {
	public static Scanner sc = new Scanner(System.in);
	static int rand_num1;
	static int rand_num2;
	static int student_ans;

	static int levelDif = 1;
	static int studentRan = 10;





	public static void main(String[] args) {

		// create a boolean that is change with either (y/n) *seee bottom of main* 
		boolean shouldAsknext = false;


		
		do {
			int quizChecker = 9;
			double howManyRight = 0 ;

			System.out.println("What difficulty? 1 - 4");
			String ans = sc.nextLine();
			levelDif = Integer.parseInt(ans);

			// checks how many questions the user got right
			do{
				quiz();
				if(isAnswerCorrect())
				{
					howManyRight = howManyRight + 1;
				}
				quizChecker = quizChecker - 1;


			}while(quizChecker >= 0);
			// creates a double call result that 
			double score_percentage = (howManyRight/10.00)*100;
			

			if(score_percentage > 75){
				System.out.printf("Your score: " + score_percentage + " Congratulations, you are ready to go to the next level \n" );

			}
			else{
				System.out.printf("Your score: " + score_percentage + " Please ask your teacher for extra help /n " );

			}

			quizChecker = 9;
			howManyRight = 0;
			System.out.println("Do you want to be asked another 10 questions Type Y - for yes N - for no");
			String ansRedo = sc.nextLine();
			try {
				student_ans = Integer.parseInt(ans);
			} catch (Exception c) {
				System.out.print("wrong input " + c + "\n");
			}

			if(ansRedo.compareToIgnoreCase("Y") == 0){shouldAsknext = true;}
			if(ansRedo.compareToIgnoreCase("N") == 0){shouldAsknext = false;}


		}while(shouldAsknext);

	}




	public static int quiz() {
		switch(levelDif){
		case 1:
			studentRan = 10;
			break;
		case 2:
			studentRan = 100;

			break;
		case 3:
			studentRan = 1000;

			break;
		case 4:
			studentRan = 10000;

			break;
		default:
			studentRan = 10;
			break;

		}
		Random rand = new Random();
		rand_num1 = rand.nextInt(studentRan);
		rand_num2 = rand.nextInt(studentRan);
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