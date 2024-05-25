#include <iostream>

template<typename T>
class Container {
public:
    virtual ~Container() {}
    virtual Iterator<T> *createIterator() = 0;
    virtual void add(T) = 0;
};