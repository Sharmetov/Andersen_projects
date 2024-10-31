import java.time.Instant ;
public class TicketService {
    public static void main(String[] args) {

        Ticket t1 = new Ticket() ;
        long currentTime = Instant.now().getEpochSecond();
        Ticket t2 = new Ticket("A1", "West", "123", currentTime, false, 'W', 10.0f ) ;
        Ticket t3 = new Ticket() ;

        t3.setPrice(2000.0f);

        System.out.println(t3.getPrice());
        System.out.println(t3.getTime());



    }
}
