
public class Driver {
    public static void main(String[] args) {
        Date d = new Date(1, 12, 1991);

        d.display();

        TimeWithTwelveHours tt = new TimeWithTwelveHours(13, 5, 59);
        tt.display();

        TimeWithTwentyfourHour tf = new TimeWithTwentyfourHour(3, 10, 9);
        tf.display();
    }
}
