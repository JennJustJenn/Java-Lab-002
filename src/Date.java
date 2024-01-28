/**
 *
 * @author Trevor Hartman
 * @author Jennifer Gibson
 * Date 1-27-2024
 *
 * Since Version 1.0
 *
 */
public class Date {
    public static void main(String[] args) {
    int Date = 27;
    String Day = "Saturday";
    String Month = "January";
    int Year = 2024;
    System.out.println(Day);
    System.out.println(Month);
    System.out.println(Date);
    System.out.println(Year);

    String American = Day + ", " + Month+" " + Date+", " + Year;
    System.out.println(American);

    String European = Day + ", "+Date+" "+ Month+" "+ Year;
    System.out.println(European);;
}


}


