public class Date implements Displayable {
    private Month month;
    private int year;
    private int day;
    private boolean isValid = true;

    public Date(int day, int month, int year) {
        setYear(year);
        setMonth(month);
        setDay(day);
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            System.out.println("Month should be 1 ~ 12");
            isValid = false;
            return;
        }
        this.month = Month.getMonth(month);
    }

    public void setYear(int year) {
        if (year < 1900 || year > 2020) {
            System.out.println("Year should be 1990 ~ 2020");
            isValid = false;
            return;
        }
        this.year = year;
    }

    public void setDay(int day) {
        if (day < 1 || day > 30) {
            System.out.println("Day should be 1 ~ 30");
            isValid = false;
            return;
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
        if (isValid) {
            System.out.printf("%s-%s-%d%n", getMonth(), getDay(), getYear());
        }
    }
}
