package hackerrank.onemonthpreparation;

// Day 3 17.03.2024
public class TimeConversion {
    public static void main(String[] args) {
        System.err.println(timeConversion("12:01:00PM")); // "12:01:00"
        System.err.println(timeConversion("12:01:00AM")); // "00:01:00"
        System.err.println(timeConversion("07:05:45PM")); // "19:05:45"
        System.err.println(timeConversion("06:40:03AM")); // 06:40:03
    }

    public static String timeConversion(String dateTime) {
        var hour = dateTime.substring(0, 2);

        if (dateTime.contains("PM") && !hour.equals("12")) {
            hour = String.valueOf(Integer.parseInt(hour) + 12);
        } else if (dateTime.contains("AM") && hour.equals("12")) {
            hour = "00";
        }

        return hour + dateTime.substring(2, dateTime.length() - 2);
    }
}
