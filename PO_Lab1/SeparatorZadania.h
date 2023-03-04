#pragma once
#include "Separator.h"
class SeparatorZadania : public Separator
{
private:
	char zadanie[3];
public:
	SeparatorZadania(const char* zadanie);
	void Wypisz(std::ostream& out) const override;
};

