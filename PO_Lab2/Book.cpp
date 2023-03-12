#include "Book.h"
void Book::debug(const char* message)
{
	std::cout << "\x1B[2m"<<message<<"\033[0m\n";
}
Book::Book()
{	
	debug("Book::Book()");
	author = "";
	title = "";
}

Book::Book(const std::string& author, const std::string& title) : author(author), title(title)
{
	debug("Book::Book(const std::string& author, const std::string& title)");
}

Book::Book(std::string&& author, std::string&& title) : author(author), title(title)
{
	debug("Book::Book(std::string&& author, std::string&& title)");
}

std::string Book::getAuthor() const
{
	return author;
}

std::string Book::getTitle() const
{
	return title;
}

void Book::setAuthor(const std::string& author)
{
	debug("Book::setAuthor(const std::string& author)");
	this->author = author;
}

void Book::setTitle(const std::string& title)
{
	debug("Book::setTitle(const std::string& title)");
	this->title = title;
}

void Book::setAuthor(std::string&& author)
{
	debug("Book::setAuthor(std::string&& author)");
	this->author = author;
}

void Book::setTitle(std::string&& title)
{
	debug("Book::setTitle(std::string&& title)");
	this->title = title;
}

Book::Book(const Book& book) : author(book.author), title(book.title)
{
	debug("Book::Book(const Book& book)");
}

Book::Book(Book&& book) : author(book.author), title(book.title) {
	debug("Book::Book(Book&& book)");
	book.author = "", book.title = "";
}

Book& Book::operator=(const Book& book)
{
	debug("Book::operator=(const Book& book)");
	this->author = book.author;
	this->title = book.title;
	return *this;
}

Book& Book::operator=(Book&& book)
{
	debug("Book::operator=(Book&& book)");
	author.swap(book.author);
	title.swap(book.title);
	return *this;
}

std::ostream& operator<<(std::ostream& out, const Book& book)
{
	out << "{" << book.title << ", " << book.author<<"}";
	return out;
}
