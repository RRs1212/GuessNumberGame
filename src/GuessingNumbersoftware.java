import java.util.Scanner;

class GuessingNumbersoftware {
    public void guessNumber() {
        System.out.println("WELCOME TO NUMBER GUESSING NUMBER::");
        randomNumber num = new randomNumber();
        checkingGuessingNumber guess = new checkingGuessingNumber();
        Scanner in = new Scanner(System.in);
        int target = num.generateNumber();
        System.out.println(target);
        int count = 0;
        int rotate = 3;
        while (rotate != 0) {
            count++;
            System.out.println("Guess your Number[ 0-100]:");
            int value = in.nextInt();
            rotate = guess.ckeck(value, target);
            if (rotate == 0) System.out.println("wow!! you guessed it right in" + count + "steps");
            else if (rotate == 1) System.out.println("my number is higher");
            else System.out.println("my number is greater");
        }

    }

}
