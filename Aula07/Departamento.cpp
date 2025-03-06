#include "Departamento.hpp"

const int &Departamento::get_id() const{
    return id;
}

const string &Departamento::get_nome() const{
    return nome;
}

void Departamento::set_nome(const string &nome){
    this->nome = nome;
}