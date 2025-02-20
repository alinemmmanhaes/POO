#include "Ponto.hpp"
#include <iostream>
#include <cmath>

Ponto::Ponto(const double& x, const double& y){
    this->x = x;
    this->y = y;
}
void Ponto::setX(const double& x){
    this->x = x;
}
void Ponto:: setY(const double& y){
    this->y = y;
}
double Ponto:: getX() const{
    return this->x;
}
double Ponto:: getY() const{
    return this->y;
}
double Ponto::distPontos(Ponto p1){
    double diff1 = this->getX() - p1.getX();
    double diff2 = this->getY() - p1.getY();
    double dist = pow(diff1, 2);
    dist += pow(diff2, 2);
    return sqrt(dist);
}