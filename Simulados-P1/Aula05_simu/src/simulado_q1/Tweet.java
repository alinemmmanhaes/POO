package simulado_q1;

public class Tweet {
    private String text;

    public Tweet(String text) {
        this.text = text;
    }

    public int sizeTweet(){
        return this.text.length();
    }
}
