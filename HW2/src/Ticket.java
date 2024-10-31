import java.time.Instant ;

public class Ticket {
    private String ID;
    private String concertHall ;
    private String eventCode ;
    private long time ;
    private boolean isPromo ;
    private char stadiumSector ;
    private float backpackWeight ;
    private float price ;

    public Ticket() {
        this.ID = "" ;
        this.concertHall = "";
        this.eventCode=  "";
        this.time = Instant.now().getEpochSecond();
        this.isPromo = false ;
    }

    /**
     *
     * @param ID
     * @param concertHall
     * @param eventCode
     * @param time
     * @param isPromo
     * @param stadiumSector
     * @param backpackWeight
     */
    public Ticket(String ID, String concertHall,
                  String eventCode, long time,
                  boolean isPromo, char stadiumSector,
                  float backpackWeight) {
        if(ID.length()<=4){
            this.ID = ID ;
        }
        else {
            throw new IllegalArgumentException("ID's max allowed character is 4 and is exceeded");
        }

        //concertHall
        if(concertHall.length()<=10){
            this.concertHall = concertHall ;
        }
        else {
            throw new IllegalArgumentException("ID's max allowed character is 4 and is exceeded");
        }

        //eventCode
        if(eventCode.length()<=3){
            this.concertHall = eventCode ;
        }
        else {
            throw new IllegalArgumentException("ID's max allowed character is 4 and is exceeded");
        }
        this.time = time ;
        this.isPromo = isPromo ;
        this.stadiumSector = stadiumSector ;
        this.backpackWeight = backpackWeight ;
    }

    // concertHall, eventCode, time
    // limited

    /**
     *
     * @param concertHall
     * @param eventCode
     * @param time
     */
    public Ticket(String concertHall, String eventCode, long time) {
        //concertHall
        if(concertHall.length()<=10){
            this.concertHall = concertHall ;
        }
        else {
            throw new IllegalArgumentException("ID's max allowed character is 4 and is exceeded");
        }

        //eventCode
        if(eventCode.length()<=3){
            this.concertHall = eventCode ;
        }
        else {
            throw new IllegalArgumentException("ID's max allowed character is 4 and is exceeded");
        }
        this.time = Instant.now().getEpochSecond();

    }

    public String getID(){
        return ID ;
    }

    public void setID(String ID) {
        if (ID.length()<=4) {
            this.ID = ID ;
        }
        else {
            throw new IllegalArgumentException("ID's max allowed character is 4 and is exceeded") ;
        }
    }

    public long getTime(){
        return time ;
    }

    public void setTime(long time){
        this.time = time ;
    }

    public float getPrice(){
        return price ;
    }
    public void setPrice(float price){
        this.price = price;
    }
}
