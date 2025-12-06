package arrays

import base.BaseInformation
import base.ProblemCategory
import base.ProblemType
import kotlin.math.abs

// three pointers
class SortedSquaredArray(
    override val problemUrl: String = "https://www.algoexpert.io/questions/sorted-squared-array",
    override val problemDescription: String = "Write a function that takes in a non-empty array of integers that are sorted in ascending order, and returns a new array of the same length containing the squares of the original integers, also sorted in ascending order.",
    override val type: ProblemType = ProblemType.Easy,
    override val programCategory: ProblemCategory = ProblemCategory.Arrays,
    override val problemNumber: Int = 20
) : BaseInformation() {
    //array = [-2, 3, 5, 6, 8, 9]
//    fun sortedSquaredArray(array: List<Int>): List<Int> {
//        // find first positive index than move left and right accordingly
//        var result = mutableListOf<Int>()
//        var nonZeroIndex = -1
//        for (i in array.indices) {
//            if (array[i] >= 0) {
//                nonZeroIndex = i
//                break
//            }
//        }
//        if (nonZeroIndex != -1) {
//            var non =  array[nonZeroIndex] * array[nonZeroIndex]
//            result.add(non)
//        }
//
//        var leftPointer = nonZeroIndex - 1
//        var rightPointer = nonZeroIndex + 1
//        if(nonZeroIndex == -1){
//          leftPointer = array.size - 1
//            rightPointer = array.size
//        }
//        while (leftPointer > -1 || rightPointer != array.size) {
//            var leftElement = -1
//            if (leftPointer > -1) {
//                leftElement = array[leftPointer] * array[leftPointer]
//            }
//            var rightElement = -1
//            if (rightPointer != array.size) {
//                rightElement = array[rightPointer] * array[rightPointer]
//            }
//            if (leftElement != -1 && rightElement != -1) {
//                if (leftElement < rightElement) {
//                    result.add(leftElement)
//                    leftPointer--
//                } else if (leftElement > rightElement) {
//                    result.add(rightElement)
//                    rightPointer++
//                }else{
//                    result.add(leftElement)
//                    leftPointer--
//                    result.add(rightElement)
//                    rightPointer++
//                }
//            }else{
//                if (leftElement != -1){
//                    // do nothing
//                    result.add(leftElement)
//                    leftPointer--
//                }
//                if (rightElement != -1){
//                    result.add(rightElement)
//                    rightPointer++
//                }
//            }
//        }
//        println("nonZeroIndex: $nonZeroIndex")
//
//        return result
//    }

    fun sortedSquaredArray(array: List<Int>): List<Int> {
        var smallerIndex = 0
        var largerIndex = array.size - 1
        val result = array.map { _ ->0 }.toMutableList()
        for (i in array.size - 1 downTo 0) {
            if(abs(array[smallerIndex])  >  abs(array[largerIndex]) ) {
                val leftelement =  array[smallerIndex] * array[smallerIndex]
                result[i] = leftelement

                smallerIndex++

            }else{
                val right = array[largerIndex] * array[largerIndex]
                result[i] = right
                largerIndex--


            }
        }
        return result
    }
}