import java.util.Random;
import java.util.Scanner;

public class Number_Guessing_Game {

	public static void main(String[] args) {
		System.out.println("*****************************NUMBER GUESSING GAME STARTED************************************");

		Scanner sc=new Scanner(System.in);

		int timesTry=1;
		Random randomNum=new Random();
		int randNum=randomNum.nextInt(100)+1;
		while(true) {
			System.out.println("Guess the Number Between (1-100) := ");
			int GussNumber=sc.nextInt();

			if(GussNumber==randNum)
			{
				
				System.out.println("============================================================");
				System.out.println("You Win ! Right Guess Number is : "+GussNumber);	
				System.out.println("You Tried "+timesTry+" Times");
				break;
			}

			else if(GussNumber<randNum)
			{
				timesTry++;
				System.out.println("No ! Number is Lower , Guess Again....");

			}
			else if(GussNumber>randNum)
			{
				timesTry++;
				System.out.println("No ! Number is Higher , Guess Again....");

			}

		}
	}

}
