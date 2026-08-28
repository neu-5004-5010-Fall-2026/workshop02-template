package clock;

public class DigitalClock {

    private int secondsSinceMidnight;

    public DigitalClock(int hour, int minute, int second) {
        if (hour < 0 || hour > 23) {
            throw new IllegalArgumentException("Invalid hour: " + hour);
        }
        if (minute < 0 || minute > 59) {
            throw new IllegalArgumentException("Invalid minute: " + minute);
        }
        if (second < 0 || second > 59) {
            throw new IllegalArgumentException("Invalid second: " + second);
        }
        this.secondsSinceMidnight = hour * 3600 + minute * 60 + second;
    }

    public int getHour() {
        return this.secondsSinceMidnight / 3600;
    }

    public int getMinute() {
        return (this.secondsSinceMidnight % 3600) / 60;
    }

    public int getSecond() {
        return this.secondsSinceMidnight % 60;
    }

    public String getDecimal() {
        return String.format("%02d:%02d:%02d",
                this.getHour(), this.getMinute(), this.getSecond());
    }

    @Override
    public String toString() {
        return "DigitalClock[" + this.getDecimal() + "]";
    }

    public String getAMPM() {
        return this.getHour() < 12 ? "AM" : "PM";
    }

    public DigitalClock tick() {
        int newSeconds = this.secondsSinceMidnight + 1;
        if (newSeconds >= 86400) newSeconds = 0;
        return new DigitalClock(
                newSeconds / 3600,
                (newSeconds % 3600) / 60,
                newSeconds % 60);
    }
}
