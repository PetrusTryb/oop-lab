#include "FiguraPlaska.h"
#include "Prostokat.h"
#include "Trojkat.h"
#include "Kolo.h"
#include "SeparatorZadania.h"
using namespace std;

void zad3a() {
	SeparatorZadania s = SeparatorZadania("3A");
	cout << s;
	Prostokat a(2, 10);
	cout << a;
	cout << "Pole: " << a.Pole() << endl;
	cout << "Obwod: " << a.Obwod() << endl;
	Prostokat* pa = &a;
	pa->SetA(5);
	pa->SetB(7);
	cout << *pa;
	cout << a;
	cout << "Pole: " << pa->Pole() << endl << endl;

	Trojkat b(3, 4, 5);
	cout << b;
	cout << "Pole: " << b.Pole() << endl;
	cout << "Obwod: " << b.Obwod() << endl;
	Trojkat* pb = &b;
	pb->SetA(5);
	pb->SetB(7);
	pb->SetC(8);
	cout << *pb << endl;

	Kolo c(5);
	cout << c;
	cout << "Pole: " << c.Pole() << endl;
	cout << "Obwod: " << c.Obwod() << endl;
	Kolo* pc = &c;
	pc->SetR(7);
	cout << *pc << endl << endl;
}

void zad3b() {
	SeparatorZadania s = SeparatorZadania("3B");
	cout << s;
	FiguraPlaska* tab[3];
	tab[0] = new Prostokat(2, 10);
	tab[1] = new Trojkat(3, 4, 5);
	tab[2] = new Kolo(5);

	for (int i = 0; i < 3; i++)
	{
		cout << *tab[i];
		cout << "Pole: " << tab[i]->Pole() << endl;
		cout << "Obwod: " << tab[i]->Obwod() << endl;
		delete tab[i];
	}
	
}

void zad3c() {
	SeparatorZadania s = SeparatorZadania("3C");
	cout << s;
	cout << "^^^ Nadpisywanie funkcji (w tym przypadku Wypisz)\n";
	cout << "vvv Przeciazanie funkcji (w tym przypadku konstruktora Separator)\n";
	Separator s1('x',10);
	cout << s1;
	Separator s2;
	cout << s2;
}

void zadMod() {
	cout << "\nMODYFIKACJA\n";
	Kolo k1(1);
	Trojkat t1(3, 4, 5), t2(5, 6, 7);
	Prostokat p1(1, 2), p2(3, 4), p3(5, 6);
}

int main()
{
	zad3a();
	zad3b();
	zad3c();
	zadMod();
	
	return 0;
}
