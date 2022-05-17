import UIKit

func containDuplicate(_ N: [Int]) -> Bool {
    // compare set count with the array
    return Set(N).count != N.count
}

let x1 = containDuplicate([1,2,3,1])
print(x1)
let x2 = containDuplicate([1,2,3,4])
print(x2)
let x3 = containDuplicate([1,1,1,3,3,4,3,2,4,2])
print(x3)
