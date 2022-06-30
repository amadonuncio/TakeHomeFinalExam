package practicalQuestions;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ThreadLocalRandom;

public class Practical1 {

	public static void main(String[] args) {

		Set<Integer> randomNum = new TreeSet<Integer>();
		while (randomNum.size() != 500) {
			randomNum.add(ThreadLocalRandom.current().nextInt(100, 999));
		}
		System.out.println(randomNum);
		Object[] randomNumArray = randomNum.toArray();
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Give me the __ smallest number. (FYI: We are dealing with indexes)");
			int userNum = scan.nextInt();
			System.out.println(randomNumArray[userNum]); 
		}
	}
}
