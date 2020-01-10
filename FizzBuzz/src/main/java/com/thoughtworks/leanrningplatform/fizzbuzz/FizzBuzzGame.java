package com.thoughtworks.leanrningplatform.fizzbuzz;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class FizzBuzzGame {


    public String numberOff(Integer integer) {
        if (3 == integer) {
            return "Fizz";
        }
        if (5 == integer) {
            return "Buzz";
        }
        if (7 == integer) {
            return "Whizz";
        }
        return String.valueOf(integer);
    }

    public static void main(String[] args) {

    }
}
