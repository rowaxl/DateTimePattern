import java.util.InputMismatchException;

public abstract class Time implements Displayable {
    protected int hour;
    private int minutes;
    private int seconds;

    public void setHour(int hour) throws InvalidInputException {
        if (hour < 0 || hour > 23) {
            throw new InvalidInputException("Hour should be between 0 ~ 23");
        }

        this.hour = hour;
    }

    public void setMinutes(int minutes) throws InvalidInputException {
        if (minutes < 0 || minutes > 60) {
            throw new InvalidInputException("Minutes should be between 0 ~ 59");
        }

        this.minutes = minutes;
    }

    public void setSeconds(int seconds) throws InvalidInputException {
        if (seconds < 0 || seconds > 60) {
            throw new InvalidInputException("Seconds should be between 0 ~ 59");
        }

        this.seconds = seconds;
    }

    public int getHour() {
        return hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public Time(int hour, int minutes, int seconds) throws InvalidInputException {
        setHour(hour);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    public String formatNumbers(int num) {
        if (num < 10) {
            return "0" + num;
        }

        return String.valueOf(num);
    }


    @Override
    public abstract void display();
}
