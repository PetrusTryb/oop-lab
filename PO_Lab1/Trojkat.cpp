#include "Trojkat.h"

void Trojkat::Wypisz(std::ostream& out) const
{
	out << "Trojkat o bokach: " << a << ", " << b << ", " << c<<std::endl;
}

Trojkat::Trojkat(double a, double b, double c): a(a), b(b), c(c)
{
	std::cout << "Konstruktor Trojkata(" << a << "," << b << "," << c << ")\n";
}

double Trojkat::GetA() const
{
	return a;
}

void Trojkat::SetA(double a)
{
	this->a = a;
}

double Trojkat::GetB() const
{
	return b;
}

void Trojkat::SetB(double b)
{
	this->b = b;
}

double Trojkat::GetC() const
{
	return c;
}

void Trojkat::SetC(double c)
{
	this->c = c;
}

double Trojkat::Obwod()
{
	return a + b + c;
}

double Trojkat::Pole()
{
	double p = (a + b + c) / 2;
	return sqrt(p * (p - a) * (p - b) * (p - c));
}

Trojkat::~Trojkat()
{
	std::cout << "Destruktor Trojkata(" << a << "," << b << "," << c << ")\n";
}
