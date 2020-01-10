package com.thoughtworks.leanrningplatform.fizzbuzz

import spock.lang.Specification

class FizzBuzzGameTest extends Specification {

  def fizzBuzzGame = new FizzBuzzGame();

  def "it will number off with student's numbers"() {
    expect:
      result == fizzBuzzGame.numberOff(studentNumber)
    where:
      studentNumber || result
      3             || "Fizz"
      5             || "Buzz"
      7             || "Whizz"
      3 * 5         || "FizzBuzz"
      3 * 7         || "FizzWhizz"
      5 * 7         || "BuzzWhizz"
      3 * 5 * 7     || "FizzBuzzWhizz"
  }

}


/**
 让所有学生拍成一队，然后按顺序报数。
 学生报数时，如果所报数字是3的倍数，那么不能说该数字，而要说Fizz；如果所报数字是5的倍数，那么要说Buzz；如果所报数字是7的倍数，那么要说Whizz。
 学生报数时，如果所报数字同时是两个特殊数的倍数情况下，也要特殊处理，比如3和5的倍数，那么不能说该数字，而是要说FizzBuzz, 以此类推。如果同时是三个特殊数的倍数，那么要说FizzBuzzWhizz。
 学生报数时，如果所报数字包含了3，那么也不能说该数字，而是要说相应的单词，比如要报13的同学应该说Fizz。
 如果数字中包含了3，那么忽略规则2和规则3，比如要报30的同学只报Fizz，不报FizzBuzz。
 如果数字中包含了5，那么忽略规则4和规则5，并且忽略被3整除的判定，比如要报35的同学不报Fizz，报BuzzWhizz。
 如果数字中包含了7，那么忽略规则6，并且忽略被5整除的判定，比如要报75的同学只报FIzz，其他case自己补齐。
 */