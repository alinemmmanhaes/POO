public class App {
    public static void main(String[] args) throws Exception {
        double x1 = Double.parseDouble(args[0]);
        double y1 = Double.parseDouble(args[1]);
        Ponto p1 = new Ponto(x1, y1);

        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);
        Ponto p2 = new Ponto(x2, y2);

        double x3 = Double.parseDouble(args[4]);
        double y3 = Double.parseDouble(args[5]);
        Ponto p3 = new Ponto(x3, y3);

        Triangulo tri = new Triangulo(p1, p2, p3);
        System.out.println("Perímetro = " + tri.Perimetro());
    }
}
