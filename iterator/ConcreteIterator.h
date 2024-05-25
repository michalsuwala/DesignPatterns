#include <iostream>
#include <vector>
#include "Iterator.h"

template<typename T>
class ConcreteIterator : public Iterator<T> {
private:
    std::vector<T> &v;
    int idx;
public:
    ConcreteIterator(std::vector<T> &v) : v(v), idx(0) {}

    T next() override {
        return v[idx++];
    }

    int getIdx() override {
        return idx;
    }

    bool hasNext() override {
        if (idx < v.size() - 1) return true;
        return false;
    }
};