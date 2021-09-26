package com.bridgelabz.lambda;

@FunctionalInterface
public interface UserValidate<T> {
    boolean validate(T param);
}