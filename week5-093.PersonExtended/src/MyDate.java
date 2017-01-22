
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int pv, int kk, int vv) {
        this.day = pv;
        this.month = kk;
        this.year = vv;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public int differneceInYears(MyDate comparedDate) {
        int year = this.year - comparedDate.year;
        int day = this.day - comparedDate.day;
        int month = this.month - comparedDate.month;

        int totalDaysInYear = 365 * year;
        int monthDiff = month * 30;

        return Math.abs((totalDaysInYear + monthDiff + day) / 365);

    }


}