package simulado_q1;
import java.util.Date;

public class VerifiedUser extends User {
    private Date date;

    public VerifiedUser(String twitterId, Date date) {
        super(twitterId);
        this.date = date;
    }

    public Date getDate() {
        return date;
    }
}
