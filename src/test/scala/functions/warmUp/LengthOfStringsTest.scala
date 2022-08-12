package io.turntabl
package functions.warmUp

import org.scalatest.funsuite.AnyFunSuite

class LengthOfStringsTest extends AnyFunSuite {

  // longhand syntax
  test("should return 19 as length of provided strings") {
    val answer = LengthOfStrings.findLengthOfStringLongHand.apply("hi", "hey", "friend", "champ", "man")
    assert(answer == 19)
  }

  test("should return 0 as length if empty strings are passed") {
    val answer = LengthOfStrings.findLengthOfStringLongHand.apply("", "", "", "", "")
    assert(answer == 0)
    assert(answer.<(1))
  }

  test("should return 5 as length if strings with spaces are passed") {
    val answer = LengthOfStrings.findLengthOfStringLongHand.apply(" ", " ", " ", " ", " ")
    assert(answer == 5)
  }

  test("should return 10 as length for the given arguments") {
    val answer = LengthOfStrings.findLengthOfStringLongHand.apply("happy", " ", "mood", "", "")
    assert(answer == 10)
  }

  // shorthand syntax
  test("Shorthand Syntax: should return 19 as length of provided strings") {
    val answer = LengthOfStrings.findTheLengthOfStringShorthand.apply("hi", "hey", "friend", "champ", "man")
    assert(answer == 19)
  }

  test("Shorthand Syntax: should return 0 as length if empty strings are passed") {
    val answer = LengthOfStrings.findTheLengthOfStringShorthand.apply("", "", "", "", "")
    assert(answer == 0)
    assert(answer.<(1))
  }

  test("Shorthand Syntax: should return 5 as length if strings with spaces are passed") {
    val answer = LengthOfStrings.findTheLengthOfStringShorthand.apply(" ", " ", " ", " ", " ")
    assert(answer == 5)
  }

  test("Shorthand Syntax: should return 10 as length for the given arguments") {
    val answer = LengthOfStrings.findTheLengthOfStringShorthand.apply("happy", " ", "mood", "", "")
    assert(answer == 10)
  }


}
