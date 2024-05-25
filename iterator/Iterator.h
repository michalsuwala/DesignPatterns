#include <iostream> 

template<typename T>
class Iterator {
public:
    virtual ~Iterator() {}
    virtual T next() = 0;
    virtual int getIdx() = 0;
    virtual bool hasNext() = 0;
};