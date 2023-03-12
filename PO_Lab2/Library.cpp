#include "Library.h"

void Library::debug(const char* message)
{
	std::cout << "\x1B[2m" << message << "\033[0m\n";
}

Library::Library()
{
	debug("Library::Library()");
	books = nullptr;
	size = 0;
}

Library::Library(std::size_t size)
{
	debug("Library::Library(std::size_t size)");
	this->size = size;
	books = new Book[size];
}

Library::Library(std::initializer_list<Book> list)
{
	debug("Library::Library(std::initializer_list<Book> list)");
	size = list.size();
	books = new Book[size];
	std::size_t i = 0;
	for (auto& book : list)
	{
		books[i++] = book;
	}
}

Library::Library(const Library& orig)
{
	debug("Library::Library(const Library& orig)");
	size = orig.size;
	books = new Book[size];
	for (std::size_t i = 0; i < size; i++)
	{
		books[i] = orig.books[i];
	}
}

Library::Library(Library&& orig)
{
	debug("Library::Library(Library&& orig)");
	size = orig.size;
	books = std::exchange(orig.books, nullptr);
	orig.size = 0;
}

Library& Library::operator=(const Library& right)
{
	debug("Library& Library::operator=(const Library& right)");
	if (this != &right)
	{
		delete[] books;
		size = right.size;
		books = new Book[size];
		for (std::size_t i = 0; i < size; i++)
		{
			books[i] = right.books[i];
		}
	}
	return *this;
}

Library& Library::operator=(Library&& right)
{
	debug("Library& Library::operator=(Library&& right)");
	if (this != &right)
	{
		delete[] books;
		size = right.size;
		books = std::exchange(right.books, nullptr);
		right.size = 0;
	}
	return *this;
}

Book& Library::operator[](std::size_t index)
{
	return books[index];
}

const Book& Library::operator[](std::size_t index) const
{
	return books[index];
}

std::size_t Library::GetSize() const
{
	return size;
}

Library::~Library()
{
	debug("Library::~Library()");
	size = 0;
	delete[] books;
}

std::ostream& operator<<(std::ostream& out, const Library& library)
{
	out << "[";
	for (std::size_t i = 0; i < library.size; i++)
	{
		out << library.books[i] << ", ";
	}
	out << "]";
	return out;
}
