public abstract class Time implements Displayable {
    protected int hour;
    private int minutes;
    private int seconds;
    protected boolean isValid = true;

    public void setHour(int hour) {
        if (hour < 0 || hour > 23) {
            System.out.println("Hour should be between 0 ~ 23");
            isValid = false;
            return;
        }

        this.hour = hour;
    }

    public void setMinutes(int minutes) {
        if (minutes < 0 || minutes > 60) {
            System.out.println("Minutes should be between 0 ~ 59");
            isValid = false;
            return;
        }

        this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        if (seconds < 0 || seconds > 60) {
            System.out.println("Seconds should be between 0 ~ 59");
            isValid = false;
            return;
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

    public Time(int hour, int minutes, int seconds) {
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
