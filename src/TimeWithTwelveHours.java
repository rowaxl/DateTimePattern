public class TimeWithTwelveHours extends Time {
    public TimeWithTwelveHours(int hour, int minutes, int seconds) throws InvalidInputException {
        super(hour, minutes, seconds);
    }

    @Override
    public int getHour() {
        if (this.hour > 12) {
            return this.hour - 12;
        }

        return this.hour;
    }

    public String getAMPM() {
        if (this.hour > 12) {
            return "p.m.";
        }

        return "a.m.";
    }

    @Override
    public void display() {
        System.out.printf("%s:%s:%s %s\n",
            formatNumbers(getHour()),
            formatNumbers(getMinutes()),
            formatNumbers(getSeconds()),
            getAMPM()
        );
    }
}
