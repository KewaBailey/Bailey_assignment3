import java.util.Random;
import java.util.Scanner;

public class CAI5 {
	public static Scanner sc = new Scanner(System.in);
	static int rand_num1, rand_num2, student_ans, newArthmicType;
	static int levelDif = 1;
	static int studentRan = 10;
	static int typeOfArithmetic = 1;






	public static void main(String[] args) {

		// create a boolean that is change with either (y/n) *seee bottom of main* 
		boolean shouldAsknext = false;



	

		do {
			
			int quizChecker = 9;
			double howManyRight = 0 ;
			
			System.out.printf("What difficulty? 1 - 4");
			String ans = sc.nextLine();
			levelDif = Integer.parseInt(ans);


			System.out.printf("What arthmic promblem would you like? 1-5");
			String ansAth = sc.nextLine();
			typeOfArithmetic = Integer.parseInt(ansAth);


			do{
				// checks how many questions the user got right
				quiz();
				if(isAnswerCorrect())
				{
					howManyRight = howManyRight + 1;
				}
				quizChecker = quizChecker - 1;


			}while(quizChecker >= 0);

			double score_percentage = (howManyRight/10.00)*100;
			
			if(score_percentage > 75){
				System.out.printf("Your score: " + score_percentage + " Congratulations, you are ready to go to the next level \n" );

			}
			else{
				System.out.printf("Your score: " + score_percentage + " Please ask your teacher for extra help /n " );

			}

			quizChecker = 9;
			howManyRight = 0;
			System.out.printf("Do you want to be asked another 10 questions Type Y - for yes N - for no");
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
		generateQuestionArgument();
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

		if(typeOfArithmetic == 5)
		{
			newArthmicType = 5;
			Random rand = new Random();
			newArthmicType = rand.nextInt(5);

			switch(newArthmicType){
			case 1:
				System.out.printf("How much is " + rand_num1 + " plus " + rand_num2 +  "\n" );
				break;
			case 2:
				System.out.printf("How much is " + rand_num1 + " times " + rand_num2 +  "\n" );

				break;
			case 3:
				System.out.printf("How much is " + rand_num1 + " minus " + rand_num2 +  "\n" );

				break;
			case 4:
				Random randnew = new Random();
				rand_num2 = randnew.nextInt(studentRan - 2) + 2;

				System.out.printf("How much is " + rand_num1 + " divided " + rand_num2 +  "\n" );

				break;



			default:
				System.out.printf("How much is " + rand_num1 + " times " + rand_num2 +  "\n" );

				break;

			}


		}

		else{


			switch(typeOfArithmetic){
			case 1:
				System.out.printf("How much is " + rand_num1 + " plus " + rand_num2 +  "\n" );
				break;
			case 2:
				System.out.printf("How much is " + rand_num1 + " times " + rand_num2 +  "\n" );

				break;
			case 3:
				System.out.printf("How much is " + rand_num1 + " minus " + rand_num2 +  "\n" );

				break;
			case 4:
				Random rand = new Random();
				rand_num2 = rand.nextInt(studentRan - 2) + 2;

				System.out.printf("How much is " + rand_num1 + " divided " + rand_num2 +  "\n" );

				break;



			default:
				System.out.printf("How much is " + rand_num1 + " times " + rand_num2 +  "\n" );

				break;

			}


		}



	}







	public static String RanPos(){
		Random rand = new Random();
		rand_num1 = rand.nextInt(4);
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
		rand_num1 = rand.nextInt(4);
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


		if(typeOfArithmetic == 5)
		{



			switch(newArthmicType){
			case 1:



				if(student_ans != rand_num1+rand_num2) {
					displayInorrectResponse();
					return false;
				}
				else {
					displayCorrectResponse();
					return true;
				}  




			case 2:



				if(student_ans != rand_num1*rand_num2) {
					displayInorrectResponse();
					return false;
				}
				else {
					displayCorrectResponse();
					return true;
				}


			case 3:



				if(student_ans != rand_num1-rand_num2) {
					displayInorrectResponse();
					return false;
				}
				else {
					displayCorrectResponse();
					return true;
				}




			case 4:



				if(student_ans != rand_num1/rand_num2) {
					displayInorrectResponse();
					return false;
				}
				else {
					displayCorrectResponse();
					return true;
				}






			default:


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

		else{

			switch(typeOfArithmetic){
			case 1:



				if(student_ans != rand_num1+rand_num2) {
					displayInorrectResponse();
					return false;
				}
				else {
					displayCorrectResponse();
					return true;
				}  




			case 2:



				if(student_ans != rand_num1*rand_num2) {
					displayInorrectResponse();
					return false;
				}
				else {
					displayCorrectResponse();
					return true;
				}


			case 3:



				if(student_ans != rand_num1-rand_num2) {
					displayInorrectResponse();
					return false;
				}
				else {
					displayCorrectResponse();
					return true;
				}




			case 4:



				if(student_ans != rand_num1/rand_num2) {
					displayInorrectResponse();
					return false;
				}
				else {
					displayCorrectResponse();
					return true;
				}






			default:


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




	}
	public static void generateQuestionArgument() {
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
	}
}
