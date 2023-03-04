#pragma once
#include <ostream>
class Separator
{
private:
	char znak;
	int ile;
public:
	Separator();
	Separator(char c, int ile);
protected:
	virtual void Wypisz(std::ostream& out) const;
	friend std::ostream& operator<< (std::ostream& os, const Separator& sep);
};

