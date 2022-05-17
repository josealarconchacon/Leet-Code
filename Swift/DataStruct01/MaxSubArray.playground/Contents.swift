import UIKit

func maxSubArray(_ nums: [Int]) -> Int {
    var curr = nums[0], sum = nums[0], arrayRange = nums[1...]
    
    for i in arrayRange {
        curr = max(i + curr, i)
        if curr > sum {
            sum = curr
        }
    }
    return sum
}

var x1 = maxSubArray([-2,1,-3,4,-1,2,1,-5,4])
print(x1)

var x2 = maxSubArray([1])
print(x2)

var xx = maxSubArray([5,4,-1,7,8])
print(xx)
