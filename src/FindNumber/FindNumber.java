package FindNumber;

import java.util.Scanner;

public class FindNumber {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a power of 2: ");
        int n = sc.nextInt();
        int range = (int) Math.pow(2, n);
        System.out.println("Think of a number between 0 and " + (range - 1) + ".");

        int low = 0;
        int high = range - 1;
        int guess;
        String response;
        while (low <= high) {
            guess = (low + high) / 2;
            System.out.println("Is your number " + guess + "?");
            System.out.print("Enter 'yes' or 'higher' or 'lower': ");
            response = sc.next();
            if (response.equals("yes")) {
                System.out.println("Your number is " + guess + ".");
                break;
            } else if (response.equals("higher")) {
                low = guess + 1;
            } else {
                high = guess - 1;
            }
        }
        sc.close();
    }
}

