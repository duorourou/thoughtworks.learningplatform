package com.thoughtworks.leanrningplatform.fizzbuzz;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class FizzBuzzGame {


    public String numberOff(Integer integer) {
        StringBuilder builder = new StringBuilder();

        if (integer % 3 == 0) {
            builder.append("Fizz");
        }
        if (integer % 5 == 0) {
            builder.append("Buzz");
        }
        if (integer % 7 == 0) {
            builder.append("Whizz");
        }
        String result = builder.toString();
        return result.isEmpty() ? String.valueOf(integer) : result;
    }

    public static void main(String[] args) {

    }
}
