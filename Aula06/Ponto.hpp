
using namespace std;

class Ponto{
    double x, y;
public:
    Ponto(const double& x, const double& y);
    void setX(const double& x);
    double getX() const;
    void setY(const double& y);
    double getY() const;
    double distPontos(Ponto p1);
};