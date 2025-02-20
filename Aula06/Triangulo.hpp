#include "Ponto.hpp"

using namespace std;

class Triangulo{
    Ponto p1, p2, p3;
public:
    Triangulo(const Ponto& p1, const Ponto& p2, const Ponto& p3);
    void setP1(const Ponto& p1);
    Ponto getP1() const;
    void setP2(const Ponto& p2);
    Ponto getP2() const;
    void setP3(const Ponto& p3);
    Ponto getP3() const;
    double perimetro() const;
};