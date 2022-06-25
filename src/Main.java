import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int TicketPrice = 27_865;
        int OneMilesPrice = 20;

        int Miles = TicketPrice / OneMilesPrice;

        System.out.println("Бонусные мили: " + Miles);
    }
}
