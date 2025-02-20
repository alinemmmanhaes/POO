#include <iostream>
#include <string>
#include "Triangulo.hpp"

using namespace std;

int main(int argc, char const *argv[]){
    double x1 = stod(string(argv[1]));
    double y1 = stod(string(argv[2]));
    Ponto p1(x1, y1);

    double x2 = stod(string(argv[3]));
    double y2 = stod(string(argv[4]));
    Ponto p2(x2, y2);

    double x3 = stod(string(argv[5]));
    double y3 = stod(string(argv[6]));
    Ponto p3(x3, y3);

    Triangulo tri(p1, p2, p3);
    cout << "Perimetro: " << tri.perimetro() << "\n";
}