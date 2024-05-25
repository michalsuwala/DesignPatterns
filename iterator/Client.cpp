#include <iostream>
#include "ConcreteContainer.h"

int main() {
    ConcreteContainer<int> con;
    Iterator<int> *iter = con.createIterator();
    con.add(3);
    con.add(1);
    con.add(4);

    std::cout << iter->next() << "\n";
    std::cout << iter->getIdx();

    return 0;
}