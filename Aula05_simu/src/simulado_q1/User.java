package simulado_q1;

import java.util.LinkedList;

public class User {
    private String twitterId;
    private LinkedList<Tweet> tweets;

    public User(String twitterId) {
        this.twitterId = twitterId;
        this.tweets = new LinkedList<>();
    }

    public void addTweet(Tweet t){
        this.tweets.addFirst(t);
    }

    public int getTweetsQtd(){
        return this.tweets.size();
    }

    public int getSizeTweets(){
        int soma = 0;
        for (Tweet t : this.tweets) {
            soma += t.sizeTweet();
        }
        return soma;
    }

    @Override
    public String toString() {
        return "User [twitterId=" + twitterId + "]";
    }
}
