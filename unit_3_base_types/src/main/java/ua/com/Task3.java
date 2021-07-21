package ua.com;

public class Task3 {

    public static String getTime(int lessonNumber) {
        String[] timeLesson = new String[10];
        timeLesson[0] = "9:45";
        timeLesson[1] = "10:35";
        timeLesson[2] = "11:35";
        timeLesson[3] = "12:25";
        timeLesson[4] = "13:25";
        timeLesson[5] = "14:15";
        timeLesson[6] = "15:15";
        timeLesson[7] = "16:05";
        timeLesson[8] = "17:05";
        timeLesson[9] = "17:55";
        return "the lesson #" + lessonNumber + " ends at " + timeLesson[lessonNumber - 1];
    }
}
