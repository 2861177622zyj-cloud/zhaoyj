package com.heima.GenericDemo3;

/**
 * ClassName: Data
 * Package: com.heima.GenericDemo3
 */
public interface Data<T> {
    void add(T t);
    void delete(T t);
    void update(T t);
    T query(T t);
}
