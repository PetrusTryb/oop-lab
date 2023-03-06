#include "Kolo.h"
#include <iostream>
#define _USE_MATH_DEFINES
#include <math.h>

void Kolo::Wypisz(std::ostream& out) const
{
	out << "Kolo o promieniu: " << r << std::endl;
}

Kolo::Kolo(double r) : r(r)
{
	std::cout << "Konstruktor kola(" << r << ")\nLiczba figur: "<<overallFigCount<<"\nLiczba kol: "<<++inst<<std::endl;
}

double Kolo::GetR() const
{
	return r;
}

void Kolo::SetR(double r)
{
	this->r = r;
}

double Kolo::Obwod()
{
	return 2 * M_PI * r;
}

double Kolo::Pole()
{
	return M_PI * r * r;
}

Kolo::~Kolo()
{
	std::cout << "Destruktor kola(" << r << ")\nLiczba figur: " << overallFigCount-1 << "\nLiczba kol: " << --inst << std::endl;
}

int Kolo::inst = 0;