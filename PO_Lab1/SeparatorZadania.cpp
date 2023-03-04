#include "SeparatorZadania.h"

SeparatorZadania::SeparatorZadania(const char* zadanie)
{
	strcpy_s(this->zadanie, zadanie);
}

void SeparatorZadania::Wypisz(std::ostream& out) const
{
	for (int i = 0; i < 15; i++)
	{
		out << "=";
	}
	out << "ZADANIE " << zadanie;
	for (int i = 0; i < 15; i++)
	{
		out << "=";
	}
	out << std::endl;
}
