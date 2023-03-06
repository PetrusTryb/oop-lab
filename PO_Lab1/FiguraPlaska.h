#pragma once
#include <iostream>

class FiguraPlaska {
protected:
	virtual void Wypisz(std::ostream& out) const = 0;
	friend std::ostream& operator<<(std::ostream& os, const FiguraPlaska&
		figura);
	static int overallFigCount;
public:
	virtual double Pole() = 0;
	virtual double Obwod() = 0;
	FiguraPlaska();
	virtual ~FiguraPlaska();
};

