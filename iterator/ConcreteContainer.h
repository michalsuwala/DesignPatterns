#include <iostream>
#include <vector>
#include "ConcreteIterator.h"
#include "Container.h"

template<typename T>
class ConcreteContainer : public Container<T> {
private:
    std::vector<T> v;
public:
    Iterator<T>* createIterator() override {
        return new ConcreteIterator<T>(v);
    }

    void add(T element) override {
        v.push_back(element);
    }
};