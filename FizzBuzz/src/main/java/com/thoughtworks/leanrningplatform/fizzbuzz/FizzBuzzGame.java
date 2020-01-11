package com.thoughtworks.leanrningplatform.fizzbuzz;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashSet;
import java.util.Set;

import static com.thoughtworks.leanrningplatform.fizzbuzz.FizzBuzzGame.FBW.BUZZ;
import static com.thoughtworks.leanrningplatform.fizzbuzz.FizzBuzzGame.FBW.FIZZ;
import static com.thoughtworks.leanrningplatform.fizzbuzz.FizzBuzzGame.FBW.WHIZZ;
import static java.util.stream.Collectors.joining;

@AllArgsConstructor
@Getter
public class FizzBuzzGame {


    public String numberOff(Integer integer) {
        Set<FBW> resultSet = new HashSet<>();
        String number = String.valueOf(integer);
        boolean ignore3 = false;
        boolean ignore5 = false;
        boolean ignore7 = false;
        if (number.contains(BUZZ.keyWord)) {
            resultSet.add(BUZZ);
            ignore3 = true;
        } else if (number.contains("3")) {
            return "Fizz";
        }
        commonCase(integer, resultSet, ignore3, ignore5, ignore7);

        return resultSet.isEmpty() ? String.valueOf(integer) : resultSet.stream().sorted().map(FBW::getValue).collect(joining());
    }

    private void commonCase(Integer integer, Set<FBW> resultSet, boolean ignore3,
                            boolean ignore5, boolean ignore7) {
        if (integer % 3 == 0 && !ignore3) {
            resultSet.add(FIZZ);
        }
        if (integer % 5 == 0 && !ignore5) {
            resultSet.add(BUZZ);
        }
        if (integer % 7 == 0 && !ignore7) {
            resultSet.add(WHIZZ);
        }
    }

    enum FBW {
        FIZZ("Fizz", "3"),
        BUZZ("Buzz", "5"),
        WHIZZ("Whizz", "7");

        private final String keyWord;
        private final String value;

        private FBW(String value, String keyWord) {
            this.value = value;
            this.keyWord = keyWord;
        }

        public String getValue() {
            return value;
        }

        public String getKeyWord() {
            return keyWord;
        }
    }

    public static void main(String[] args) {

    }
}
