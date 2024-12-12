package simulado_q1;
import java.util.HashSet;
import java.util.Set;
import java.util.Date;

public class UserBase {
    private Set<User> users;
    private int verified;

    public UserBase(){
        this.users = new HashSet<>();
        this.verified = 0;
    }

    public User createUser (String id){
        User u = new User(id);
        this.users.add(u);
        return u;
    }

    public VerifiedUser createVerifiedUser(String id, Date date){
        VerifiedUser u = new VerifiedUser(id, date);
        this.verified++;
        this.users.add(u);
        return u;
    }

    public float tamanhoMedioTweets(){
        float soma = 0, qtd = 0;
        for (User u : this.users) {
            qtd += u.getTweetsQtd();
            soma += u.getSizeTweets();
        }
        return soma/qtd;
    }

    public float porcentagemVerificados(){
        float porcentagem  = (float)this.verified/this.users.size();
        return porcentagem;
    }

    public void printUsers(){
        for (User user : this.users) {
            System.out.println(user);
        }
    }
}
