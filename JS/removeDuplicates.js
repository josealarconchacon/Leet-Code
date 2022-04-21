"use strict";

const array = [1, 1, 2];
const array1 = [0, 0, 1, 1, 1, 2, 2, 3, 3, 4];

var removeDuplicates = function (nums) {
  nums.forEach((n, index) => {
    nums.splice(index, nums.lastIndexOf(n) - index);
  });
};
removeDuplicates(array);
removeDuplicates(array1);
console.log(array);
console.log(array1);
