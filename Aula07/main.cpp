#include <iostream>
#include <string>
#include <map>
#include <fstream>
#include <sstream>
#include "Departamento.hpp"

using namespace std;

int main(){
    map<int, Departamento> mapa;

    ifstream in("departamentos.csv");
    int id;
    string linha, cell, nome;
    getline(in, linha);
    while(getline(in, linha)){
        istringstream lineStream(linha);

        getline(lineStream, cell, ';');
        id = stoi(cell);

        getline(lineStream, cell, ';');
        nome = cell;

        mapa.insert(pair<int, Departamento> (id, Departamento(id, nome)));
    } 

    for(map<int, Departamento>::iterator it = mapa.begin(); it != mapa.end(); ++it){
        cout << "Departamento " << it->first << " nome: " << it->second.get_nome() << endl;
    }
}