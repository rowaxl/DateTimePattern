public class TimeWithTwentyfourHour extends Time {
    public TimeWithTwentyfourHour(int hour, int minutes, int seconds) throws InvalidInputException {
        super(hour, minutes, seconds);
    }

    @Override
    public void display() {
        System.out.printf("%s:%s:%s\n",
            formatNumbers(getHour()),
            formatNumbers(getMinutes()),
            formatNumbers(getSeconds())
        );
    }
}
