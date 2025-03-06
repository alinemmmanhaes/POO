#if !defined(DEPARTAMENTO_HPP)
#define DEPARTAMENTO_HPP

#include <iostream>
#include <string>

using namespace std;

class Departamento{
    int id;
    string nome;

    public:
    Departamento(const int &id, const string &nome) : id(id), nome(nome){}
    const int &get_id() const;
    const string &get_nome() const;
    void set_nome(const string &nome);
};

#endif