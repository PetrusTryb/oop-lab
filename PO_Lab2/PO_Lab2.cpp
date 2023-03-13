#include <iostream>
#include "Book.h"
#include "Library.h"
using namespace std;

void zad1() {
    string a = "Autor1", t = "Tytul1";
    Book e;
    cout << "e: " << e << endl;
    Book b1 = { a, t };
    cout << "b1: " << b1 << endl;
    Book b2 = { "Autor2","Tytul2" };
    cout << "b2: " << b2 << endl;
    Book b3 = b1;
    cout << "b3: " << b3 << " b1: " << b1 << endl;
    e = std::move(b2);
    cout << "e: " << e << " b2:" << b2 << endl;
    e.setAuthor("Autor3");
    cout << "e: " << e << endl;
    e.setTitle("Tytul3");
    cout << "e: " << e << endl;
}

void zad2() {
    Library e;
    cout << "e: " << e << endl;
    Library l1 = { {"Autor1", "Tytul1"},
    {"Autor2", "Tytul2"},
    {"Autor3", "Tytul3"} };
    cout << "l1: " << l1 << endl;
    Library l2(2);
    cout << "l2: " << l2 << endl;
    l2[0] = { "Autor4", "Tytul4" };
    l2[1] = { "Autor5", "Tytul5" };
    cout << "l2: " << l2 << endl;
    e = std::move(l2);
    cout << "e: " << e << " l2: " << l2 << endl;
    l1[0] = std::move(e[1]);
    cout << "l1: " << l1 << " e: " << e << endl;
}

void zad3() {
    Library l1 = { {"Autor1_1", "Tytul1_1"},{"Autor1_2", "Tytul1_2"},{"Autor1_3","Tytul1_3"}};
    Library l2 = { {"Autor2_1", "Tytul2_1"},{"Autor2_2", "Tytul2_2"} };
    cout << l1 << endl << l2 << endl;
    l1.swapBooksWith(l2);
    cout << l1 << endl << l2 << endl;
}

int main()
{
    cout << "***ZADANIE 1***\n";
    zad1();
    cout << "***ZADANIE 2***\n";
    zad2();
    cout << "***MODYFIKACJA***\n";
    zad3();
    return 0;
}
