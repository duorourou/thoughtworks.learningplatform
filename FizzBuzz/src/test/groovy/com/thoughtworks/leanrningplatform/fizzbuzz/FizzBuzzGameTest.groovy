package com.thoughtworks.leanrningplatform.fizzbuzz

import spock.lang.Specification
import spock.lang.Unroll

class FizzBuzzGameTest extends Specification {

  def fizzBuzzGame = new FizzBuzzGame();

  @Unroll(value = "#rule : numberOff(#studentNumber) = #result")
  def "it will number off with student's numbers"() {
    expect:
      result == fizzBuzzGame.numberOff(studentNumber)
    where:
      rule                               | studentNumber || result
      "only multiple of 3"               | 3             || "Fizz"
      "only multiple of 3"               | 6             || "Fizz"
      "only multiple of 5"               | 5             || "Buzz"
      "only multiple of 5"               | 10            || "Buzz"
      "only multiple of 7"               | 7             || "Whizz"
      "only multiple of 7"               | 14            || "Whizz"
      "only multiple of 3 and 5"         | 3 * 5 * 4     || "FizzBuzz"
      "only multiple of 3 and 7"         | 3 * 7         || "FizzWhizz"
      "only multiple of 5 and 7"         | 5 * 7 * 4     || "BuzzWhizz"
      "only multiple of 3 and 5 and 7"   | 3 * 5 * 7 * 2 || "FizzBuzzWhizz"
      "contains 3 but not multiple of 3" | 13            || "Fizz"
      "contains 3 but not multiple of 3" | 30            || "Fizz"
  }

}


/**
 1 让所有学生拍成一队，然后按顺序报数。
 2 学生报数时，如果所报数字是3的倍数，那么不能说该数字，而要说Fizz；如果所报数字是5的倍数，那么要说Buzz；如果所报数字是7的倍数，那么要说Whizz。
 3 学生报数时，如果所报数字同时是两个特殊数的倍数情况下，也要特殊处理，比如3和5的倍数，那么不能说该数字，而是要说FizzBuzz, 以此类推。如果同时是三个特殊数的倍数，那么要说FizzBuzzWhizz。
 4 学生报数时，如果所报数字包含了3，那么也不能说该数字，而是要说相应的单词，比如要报13的同学应该说Fizz。
 5 如果数字中包含了3，那么忽略规则2和规则3，比如要报30的同学只报Fizz，不报FizzBuzz。
 6 如果数字中包含了5，那么忽略规则4和规则5，并且忽略被3整除的判定，比如要报35的同学不报Fizz，报BuzzWhizz。
 7 如果数字中包含了7，那么忽略规则6，并且忽略被5整除的判定，比如要报75的同学只报FIzz，其他case自己补齐。
 */