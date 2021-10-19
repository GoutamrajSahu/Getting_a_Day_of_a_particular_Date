import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class GetDay {
        public static void main(String[] args) {
            Scanner Sc = new Scanner(System.in);
            System.out.println("Enter the date in DD/MM/YYYY format: ");
            StringTokenizer dateStr = new StringTokenizer(Sc.nextLine(),"/");
            ArrayList<Integer> dateArray = new ArrayList<>();
            while(dateStr.hasMoreTokens()){
                dateArray.add(Integer.parseInt(dateStr.nextToken()));
            }
            int day = dateArray.get(0);
            int month = dateArray.get(1);
            int year = dateArray.get(2);
            LocalDate date = LocalDate.of(year, month, day);
            System.out.println("The particular day is: "+ date.getDayOfWeek().toString());
        }
}
