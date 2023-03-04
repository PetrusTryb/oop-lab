#include "Separator.h"

Separator::Separator()
{
	znak = '*';
	ile = 20;
}

Separator::Separator(char c, int ile)
{
	this->znak = c;
	this->ile = ile;
}

void Separator::Wypisz(std::ostream& out) const
{
	for (int i = 0; i < ile; i++)
	{
		out << znak;
	}
	out << std::endl;
}

std::ostream& operator<<(std::ostream& os, const Separator& sep) {
	sep.Wypisz(os);
	return os;
}