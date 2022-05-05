package com.util;


//@FunctionalInterface
public interface Converter<T,N> {

    T converter (N element);

    static  boolean isElement(String str){
        return str.equals("");
    }

    default void printStr(String str){
        System.out.println(str);
    }

    String toString();

}
