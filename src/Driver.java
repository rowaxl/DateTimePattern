import java.util.InputMismatchException;

public class Driver {
    public static void main(String[] args) {
        try {
            Date d = new Date(41, 11, 1991);
            d.display();
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
        }


        try {
            TimeWithTwelveHours tt = new TimeWithTwelveHours(23, 0, 59);
            tt.display();
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
        }

        try {
            TimeWithTwentyfourHour tf = new TimeWithTwentyfourHour(3, 10, 99);
            tf.display();
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
        }
    }
}
