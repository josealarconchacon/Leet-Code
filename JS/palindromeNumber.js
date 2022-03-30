"use strict";
/*
    Given an integer x, return true if x is palindrome integer.
        An integer is a palindrome when it reads the same backward as forward.
        For example, 121 is a palindrome while 123 is not.

    Example 1:
    Input: x = 121
    Output: true
    Explanation: 121 reads as 121 from left to right and from right to left.

    Example 2:
    Input: x = -121
    Output: false
    Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

    Example 3:
    Input: x = 10
    Output: false
    Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 */

var isPalindrome = function (x) {
  // if x is less than zero, return false
  if (x < 0) {
    return false;
  }

  // initialize the reverse variable with 0
  let reversed = 0;
  // initializea variable X with x because x will lose the initial value in the logic
  const X = x;

  while (x > 0) {
    // multiply the reversed variable with 10 and add the last digit of the number to it
    reversed = reversed * 10 + (x % 10);
    x = parseInt(x / 10);
  }
  return reversed == X;
};
console.log(isPalindrome(121));
console.log(isPalindrome(-121));
console.log(isPalindrome(10));
