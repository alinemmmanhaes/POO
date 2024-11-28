public class Ponto {
    private double x, y;

    public Ponto(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return x;
    }

    public void setX(double x){
        this.x = x;
    }

    public double getY(){
        return y;
    }

    public void setY(double y){
        this.y = y;
    }

    public double distPontos(Ponto p1){
        double dist = Math.pow(this.getX() - p1.getX(), 2);
        dist += Math.pow(this.getY() - p1.getY(), 2);
        return Math.sqrt(dist);
    }
}
