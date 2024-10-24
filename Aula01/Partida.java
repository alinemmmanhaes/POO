public class Partida {
    private Time timeA, timeB;

    public Partida(Time timeA, Time timeB){
        this.timeA = timeA;
        this.timeB = timeB;
    }
    public Time getTimeA(){
        return timeA;
    }
    public Time getTimeB(){
        return timeB;
    }
}
