#pragma once
#include <iostream>
#include <type_traits>
class Book
{
	std::string author, title;
	void debug(const char* message);
public:
	Book();
	Book(const std::string& author, const std::string& title);
	Book(std::string&& author, std::string&& title);
	Book(const Book& book);
	Book(Book&& book);
	std::string getAuthor() const;
	std::string getTitle() const;
	void setAuthor(const std::string& author);
	void setTitle(const std::string& title);
	void setAuthor(std::string&& author);
	void setTitle(std::string&& title);
	friend std::ostream& operator<<(std::ostream& out, const Book& book);
	Book& operator=(const Book& book);
	Book& operator=(Book&& book);
};


