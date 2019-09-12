import java.util.Random;
import java.util.Scanner;

public class SelectionDemo {

    public static void main(String[] args){
        var randGenerator = new Random(); //this creates an object of the Random Class
        var number = randGenerator.nextInt(10)+1;//nextInt(10) will return 0..9
        System.out.println("Guess a number from 1 to 10");
        var reader = new Scanner(System.in);
        var user_guess = reader.nextInt();

        while(user_guess == number)
            if(user_guess == number) //note lack of { discuss
                System.out.println("You guessed "+number+" which is correct!");
            if(user_guess < number)
                System.out.println(("You guessed "+ user_guess+ " That number is too high try again "));

            if(user_guess > number)
                System.out.println(("You guessed "+ user_guess+ " That number is too low try again " ));
    }
}