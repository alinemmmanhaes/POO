#include "Triangulo.hpp"

Triangulo::Triangulo(const Ponto& p1, const Ponto& p2, const Ponto& p3):p1(p1), p2(p2), p3(p3){}

void Triangulo::setP1(const Ponto& p1){
    this->p1 = p1;
}
Ponto Triangulo::getP1() const{
    return this->p1;
}
void Triangulo::setP2(const Ponto& p2){
    this->p2 = p2;
}
Ponto Triangulo::getP2() const{
    return this->p2;
}
void Triangulo::setP3(const Ponto& p3){
    this->p3 = p3;
}
Ponto Triangulo::getP3() const{
    return this->p3;
}
double Triangulo::perimetro() const{
    double total = 0;
    total += getP1().distPontos(p2);
    total += getP2().distPontos(p3);
    total += getP3().distPontos(p1);
    return total;
}