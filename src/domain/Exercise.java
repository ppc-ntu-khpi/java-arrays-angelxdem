package domain;
/**
 * Hero is the main class
 *
 * @author angelxdem
 *
 */
public class Exercise {

    /**
     * The method makes it clear whether this number is an Armstrong number
     *
     * @param num number for research
     */
    public static void IsArmstrong(int num) {
        int number, digit, sum = 0;
        number = num;
        while (number != 0) {
            digit = number % 10;
            sum = sum + digit * digit * digit;
            number /= 10;
        }
        if (sum == num)
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number");
    }
}
