import java.io.IOException;

public class checking {
    public static void main(String[] args) throws IOException {


        int month = 3;
        String monthString = new String();
        switch (month) {
            case 1:
                monthString = "january";
                break;
            case 2:
                monthString = "february";
                break;
            case 3:
                monthString = "mart";
                break;
            case 4:
                monthString = "april";
                break;
            case 5:
                monthString = "may";
                break;
            case 6:
                monthString = "june";
                break;
            case 7:
                monthString = "july";
                break;
            case 8:
                monthString = "august";
                break;
            case 9:
                monthString = "september";
                break;
            case 10:
                monthString = "october";
                break;
            case 11:
                monthString = "november";
                break;
            case 12:
                monthString = "december";
                break;
            default:
                monthString = "this month is not exist";
                break;
        }
        System.out.println(monthString);

        char ch, answer = '1';
        System.out.println("what a letter?");
        System.out.print("try to guess : ");
        ch = (char) System.in.read();
        if (ch == answer) {
            System.out.println("Congrats!");
        } else if (ch > answer) {
            System.out.println(" you overdone ");
        } else {
            System.out.println("you didn't try hard");
        }
    }
}

