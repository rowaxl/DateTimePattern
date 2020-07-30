public class Date implements Displayable {
    private Month month;
    private int year;
    private int day;

    public Date(int day, int month, int year) throws InvalidInputException {
        setYear(year);
        setMonth(month);
        setDay(day);
    }

    public void setMonth(int month) throws InvalidInputException {
        if (month < 1 || month > 12) {
            throw new InvalidInputException("Month should be 1 ~ 12");
        }
        this.month = Month.getMonth(month);
    }

    public void setYear(int year) throws InvalidInputException {
        if (year < 1900 || year > 2020) {
            throw new InvalidInputException("Year should be 1990 ~ 2020");
        }
        this.year = year;
    }

    public void setDay(int day) throws InvalidInputException {
        if (day < 1 || day > 30) {
            throw new InvalidInputException("Day should be 1 ~ 30");
        }
        this.day = day;
    }

    public String getMonth() {
        return month.name();
    }

    public int getYear() {
        return year;
    }

    public String getDay() {
        String sDay = String.valueOf(day);
        if (day < 10) {
            sDay = "0" + sDay;
        }

        return sDay;
    }

    @Override
    public void display() {
        System.out.printf("%s-%s-%d%n", getMonth(), getDay(), getYear());
    }
}
