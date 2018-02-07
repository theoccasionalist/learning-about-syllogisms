package syllogisms;

import java.util.Scanner;

public class SyllogismApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Please input syllogism information.");

		// creates mood
		System.out.println("What type of proposition is the major premise?");
		String major = input.nextLine();
		System.out.println("What type of proposition is the minor premise?");
		String minor = input.nextLine();
		System.out.println("What type of propositin is the conclusion?");
		String conclusion = input.nextLine();
		System.out.println("What is the figure of the syllogism?");
		String figure = input.nextLine();

		MoodFigure syllogism = new MoodFigure(major, minor, conclusion, figure);

		input.close();

		ValidListCheck toTest = new ValidListCheck();
		toTest.addSyllogism(syllogism);
		toTest.testValidity(syllogism);
	}

}
