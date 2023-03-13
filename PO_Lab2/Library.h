#pragma once
#include "Book.h"
#include <initializer_list>
class Library {
	Book* books;
	std::size_t size;
	void debug(const char* message);
public:
	Library();
	Library(std::size_t size);
	Library(std::initializer_list<Book> list);
	Library(const Library& orig);
	Library(Library&& orig);
	Library& operator=(const Library& right);
	Library& operator=(Library&& right);
	Book& operator[](std::size_t index);
	friend std::ostream& operator<<(std::ostream& out, const Library& library);
	const Book& operator[](std::size_t index) const;
	std::size_t GetSize() const;
	~Library();
	void swapBooksWith(Library& library);
};
